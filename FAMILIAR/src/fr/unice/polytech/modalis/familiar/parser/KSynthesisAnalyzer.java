/**
 * 
 */
package fr.unice.polytech.modalis.familiar.parser;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.fML.Command;
import org.xtext.example.mydsl.fML.ConstraintExpr;
import org.xtext.example.mydsl.fML.ConstraintsSpecification;
import org.xtext.example.mydsl.fML.FMCommand;
import org.xtext.example.mydsl.fML.HProduction;
import org.xtext.example.mydsl.fML.HierarchySpecification;
import org.xtext.example.mydsl.fML.KnowledgeSpecification;
import org.xtext.example.mydsl.fML.Synthesis;

import fr.unice.polytech.modalis.familiar.interpreter.FMLShell;
import fr.unice.polytech.modalis.familiar.operations.KnowledgeSynthesis;
import fr.unice.polytech.modalis.familiar.variable.ConstraintVariable;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.RType;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import gsd.synthesis.Expression;
import gsd.synthesis.FeatureEdge;
import gsd.synthesis.FeatureGraph;
import gsd.synthesis.FeatureGraphFactory;
import gsd.synthesis.FeatureNode;

/**
 * @author macher
 *
 */
public class KSynthesisAnalyzer extends FMLAbstractCommandAnalyzer {

	/**
	 * @param cmd
	 * @param ns
	 * @param an
	 */
	public KSynthesisAnalyzer(Command cmd, NameSpace ns,
			FMLCommandInterpreter an) {
		super(cmd, ns, an);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cmd
	 * @param assigner
	 * @param ns
	 * @param an
	 */
	public KSynthesisAnalyzer(Command cmd, String assigner, NameSpace ns,
			FMLCommandInterpreter an) {
		super(cmd, assigner, ns, an);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fr.unice.polytech.modalis.familiar.parser.FMLAbstractCommandAnalyzer#eval()
	 */
	@Override
	public void eval() {
		assert (_command instanceof Synthesis);
		Synthesis ksCmd = (Synthesis) _command;

		FMCommand fmCmd = ksCmd.getFm();
		FeatureModelVariable fmToSynthesis = _environment.parseFMCommand(fmCmd, null, null);
		
		
		
		
		KnowledgeSynthesis kst1 = new KnowledgeSynthesis() ; 
		
		KnowledgeSpecification kstCmd = ksCmd.getKst() ;
		if (kstCmd == null) {
			// no knowledge
		}
		else {
			
			// hierarchy (if any)			
			HierarchySpecification hSpecification = kstCmd.getHierarchy() ;
			if (hSpecification != null) {
				FeatureGraph<String> hierarchy = parseHierarchySpecification(hSpecification);
				kst1.setHierarchy(hierarchy);
			}
			
			ConstraintsSpecification cstSpecification = kstCmd.getConstraints() ;
			if (cstSpecification != null) {
				Set<Expression<String>> exprs = new HashSet<Expression<String>>() ; 
				ConstraintExpr csts = cstSpecification.getCsts() ; 
				SetVariable s = _environment.parseSetCommand(csts, null) ;
				Set<Variable> cstVariables = s.getVars() ;
				for (Variable cstVariable : cstVariables) {
					if (!(cstVariable instanceof ConstraintVariable)) {
						FMLShell.getInstance().printError("Constraint expected but " + cstVariable);
						return ; 
					}
					ConstraintVariable cst = (ConstraintVariable) cstVariable ;
					Expression<String> expr = cst.getConstraint() ;
					exprs.add(expr);
				}
				kst1.setConstraints(exprs);
			}
			
			
		}
		
		
		
		fmToSynthesis.setBuilder(FMLCommandInterpreter.getBuilder()); // in case we want BDD
		
		// TODO backend analysis for defining the synthesis strategy
		FeatureModelVariable fmSynthesised = fmToSynthesis.ksynthesis(kst1);
			
		setVariable(fmSynthesised) ; 
	}

	private FeatureGraph<String> parseHierarchySpecification(HierarchySpecification hSpecification) {
		FeatureGraph<String> r = FeatureGraphFactory.mkStringFactory().mkTop() ;
		EList<HProduction> productions = hSpecification.getFeatures() ;
		boolean first = true ; 
		for (HProduction hProduction : productions) {
			String parentName = hProduction.getName() ;
			
			FeatureNode<String> fnParent = null ; 
			try {
				fnParent = r.findVertex(parentName); 
			}
			catch (Exception e) {
				fnParent = 	new FeatureNode<String>(parentName) ;
				r.addVertex(fnParent);
			}
			if (first) {
				r.addEdge(fnParent, r.getTopVertex(), FeatureEdge.HIERARCHY);
				first = false ;   
			}
			EList<String> fts = hProduction.getFeatures() ;
			for (String ft : fts) {
				r.addVertex(new FeatureNode<String>(ft));
			}			
		}
		
		for (HProduction hProduction : productions) {
			String parentName = hProduction.getName() ;
			FeatureNode<String> fnParent = r.findVertex(parentName); 
			EList<String> fts = hProduction.getFeatures() ;
			for (String ft : fts) {
				FeatureNode<String> fnChild = r.findVertex(ft); 
				r.addEdge(fnChild, fnParent, FeatureEdge.HIERARCHY);
			}			
		}
		FMLShell.getInstance().printDebugMessage("hierarchy: " + r);
		
		
		return r;
	}

	/* (non-Javadoc)
	 * @see fr.unice.polytech.modalis.familiar.parser.FMLAbstractCommandAnalyzer#getType()
	 */
	@Override
	public RType getType() {
		return RType.FEATURE_MODEL ;
	}

}