package fr.unice.polytech.modalis.familiar.test.heuristics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

import com.google.common.collect.Sets;

import fr.unice.polytech.modalis.familiar.experimental.FGroup;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.graph.DirectedCliqueFinder;
import gsd.graph.ImplicationGraph;
import gsd.synthesis.FeatureEdge;
import gsd.synthesis.FeatureGraph;
import gsd.synthesis.FeatureNode;

/**
 * Experiment 3: our heuristics vs logic based heuristics
 * @author gbecan
 *
 */
public class ICSE2014Experiment3 extends KSynthesisTest {



	// Implication graph

	@Test
	public void testTransitiveReductionSPLOT() {
		System.out.println("Transitive reduction SPLOT");
		testTransitiveReduction(getSPLOTFeatureModelsForFASE());
	}
	
	@Test
	public void testTransitiveReductionPCM() {
		System.out.println("Transitive reduction PCM");
		testTransitiveReduction(getPCMFeatureModels());
	}
	
	public void testTransitiveReduction(List<FeatureModelVariable> fms) {

		int nbEdgesBeforeTR = 0;
		int nbEdgesAfterTR = 0;
		int keptParents = 0; 
		int nbParents = 0;
		
		List<Integer> listEdgesBeforeTR = new ArrayList<Integer>();
		List<Integer> listEdgesAfterTR = new ArrayList<Integer>();

		for (FeatureModelVariable fm : fms) {
			FeatureGraph<String> diagram = fm.getFm().getDiagram();
			
			ImplicationGraph<String> implicationGraph = fm.computeImplicationGraph();
			nbEdgesBeforeTR += implicationGraph.edges().size();
			listEdgesBeforeTR.add(implicationGraph.edges().size());
			
			ImplicationGraph<String> reducedBIG = computeReducedBIG(fm, implicationGraph);
			nbEdgesAfterTR += reducedBIG.edges().size();
			listEdgesAfterTR.add(reducedBIG.edges().size());
			
			nbParents += fm.features().size() - 1; // Avoid root feature

			for (FeatureEdge edge : diagram.edges()) {

				if (edge.getType() == FeatureEdge.HIERARCHY) {
					String source = diagram.getSource(edge).getFeature();
					String target = diagram.getTarget(edge).getFeature();

					if (reducedBIG.containsEdge(source, target)) {
						keptParents ++;
					}

				}
			}
		}

		double edgesBeforeTRav = averageInt(listEdgesBeforeTR);
		double edgesAfterTRav = averageInt(listEdgesAfterTR);
		
		System.out.println("BIG edges");
		System.out.println("before TR : " + edgesBeforeTRav);
		System.out.println("after TR : " + edgesAfterTRav);
		
		System.out.println("Edges in the BIG: " + nbEdgesBeforeTR + " -> " + nbEdgesAfterTR);
		System.out.println(keptParents + " / " + nbParents + " parents kept after transitive reduction");
		
	}



	// Cliques

	@Test
	public void testCliquesSPLOT() {
		System.out.println("Cliques SPLOT");
		testCliques(getSPLOTFeatureModelsForFASE());
	}
	
	@Test
	public void testCliquesPCM() {
		System.out.println("Cliques PCM");
		testCliques(getPCMFeatureModels());
	}
	
	public void testCliques(List<FeatureModelVariable> fms) {
		int featuresInCliques = 0;
		int nbCliques = 0;
		int unrelatedFeatures = 0;
		int unrelatedCliques = 0;
		int connectedCliques= 0;
		int oneLevelCliques = 0;

		List<Double> listUnrelatedFeatures = new ArrayList<Double>();
		List<Double> listUnrelatedCliques = new ArrayList<Double>();
		List<Double> listConnectedCliques = new ArrayList<Double>();
		List<Double> listOneLevelCliques = new ArrayList<Double>();
		List<Integer> listCliques = new ArrayList<Integer>();


		for (FeatureModelVariable fm : fms) {
			FeatureGraph<String> diagram = fm.getFm().getDiagram();
			List<Set<String>> cliques = DirectedCliqueFinder.INSTANCE.findAll(fm.computeImplicationGraph());

			int sumFeaturesInCliques = 0;
			int sumUnrelatedFeatures = 0;
			int sumUnrelatedCliques = 0;
			int sumConnectedCliques = 0;
			int sumOneLevelCliques = 0;
			
			for (Set<String> clique : cliques) {
				featuresInCliques += clique.size();
				sumFeaturesInCliques += featuresInCliques;
				nbCliques++;

				int countUnrelatedFeatures = countUnrelatedFeatures(diagram, clique);
				unrelatedFeatures += countUnrelatedFeatures;
				sumUnrelatedFeatures+= countUnrelatedFeatures;
				
				if (countUnrelatedFeatures > 0) {
					unrelatedCliques++;
					sumUnrelatedCliques++;
				}

				if (checkConnectedClique(diagram, clique)) {
					connectedCliques++;
					sumConnectedCliques++;
				}

				if (checkOneLevelClique(diagram, clique)) {
					oneLevelCliques++;
					sumOneLevelCliques++;
				}
			}
			
			listCliques.add(cliques.size());
			if (!cliques.isEmpty()) {
				listUnrelatedFeatures.add(sumUnrelatedFeatures / ((double)sumFeaturesInCliques));
				double cliquesSize = cliques.size();
				listUnrelatedCliques.add(sumUnrelatedCliques / cliquesSize);
				listConnectedCliques.add(sumConnectedCliques / cliquesSize);
				listOneLevelCliques.add(sumOneLevelCliques / cliquesSize);				
			}
		}

		System.out.println("Results by FM");
		System.out.println("Nb of cliques : " + averageInt(listCliques) + " (average) " + medianInt(listCliques) + " (median)");
		System.out.println(averageDouble(listUnrelatedFeatures) + " (average) " +
				medianDouble(listUnrelatedFeatures) + " (median) " +
				" features of a clique were not in a child-parent relation");
		
		System.out.println(averageDouble(listUnrelatedCliques) + " (average) " +
				medianDouble(listUnrelatedCliques) + " (median) " +
				" cliques contain features that were not in a child-parent relation");
		
		System.out.println(averageDouble(listConnectedCliques) + " (average) " +
				medianDouble(listConnectedCliques) + " (median) " +
				" cliques are connected");
		
		System.out.println(averageDouble(listOneLevelCliques) + " (average) " +
				medianDouble(listOneLevelCliques) + " (median) " +
				" cliques contains a parent with his children (one level)");
		
		System.out.println("Global results");
		System.out.println(unrelatedFeatures + " / " + featuresInCliques + " features of a clique were not in a child-parent relation");
		System.out.println(unrelatedCliques + " / " + nbCliques + " cliques contain features that were not in a child-parent relation");
		System.out.println(connectedCliques + " / " + nbCliques + " cliques are connected");
		System.out.println(oneLevelCliques + " / " + nbCliques + " cliques contains a parent with his children");
	}

	private int countUnrelatedFeatures(FeatureGraph<String> diagram, Set<String> clique) {
		Set<String> unrelatedFeatures = new HashSet<String>(clique);


		for (String child : clique) {
			FeatureNode<String> childNode = diagram.findVertex(child);

			for (String parent : clique) {
				FeatureNode<String> parentNode = diagram.findVertex(parent);
				if (!child.equals(parent) && diagram.containsEdge(childNode, parentNode, FeatureEdge.HIERARCHY)) {
					unrelatedFeatures.remove(child);
					unrelatedFeatures.remove(parent);
				}
			}
		}

		return unrelatedFeatures.size();
	}

	private boolean checkConnectedClique(FeatureGraph<String> diagram, Set<String> clique) {
		Set<String> connectedFeatures = new HashSet<String>();
		Set<String> toVisit = new HashSet<String>(clique); 

		// Init first feature
		String first = clique.iterator().next();
		connectedFeatures.add(first);
		toVisit.remove(first);

		boolean added;
		do {
			added = false;
			Set<String> newToVisit = new HashSet<String>(toVisit);

			for (String feature : toVisit) {
				for (String connectedFeature : connectedFeatures) {
					FeatureNode<String> featureNode = diagram.findVertex(feature);
					FeatureNode<String> connectedFeatureNode = diagram.findVertex(connectedFeature);

					if (diagram.containsEdge(featureNode, connectedFeatureNode, FeatureEdge.HIERARCHY)
							|| diagram.containsEdge(connectedFeatureNode, featureNode, FeatureEdge.HIERARCHY)) {

						connectedFeatures.add(feature);
						newToVisit.remove(feature);
						added = true;
						break;
					}
				}
			}

			toVisit = newToVisit;
		} while (added);

		return connectedFeatures.equals(clique);
	}

	private boolean checkOneLevelClique(FeatureGraph<String> diagram, Set<String> clique) {

		for (String parent : clique) {
			boolean oneLevel = true;
			FeatureNode<String> parentNode = diagram.findVertex(parent);

			for (String child : clique) {
				FeatureNode<String> childNode = diagram.findVertex(child);
				if (!parent.equals(child) && !diagram.containsEdge(childNode, parentNode, FeatureEdge.HIERARCHY)) {
					oneLevel = false;
				}
			}

			if (oneLevel) {
				return true;
			}
		}

		return false;
	}

	// Feature groups

	@Test
	public void testFeatureGroupsOnCompleteBIGSPLOT() {
		System.out.println("Feature groups on complete BIG - SPLOT");
		testFeatureGroups(getSPLOTFeatureModelsForFASE(), false, true);
	}

	@Test
	public void testFeatureGroupsOnFeatureGraphSPLOT() {
		System.out.println("Feature groups on feature graph - SPLOT");
		testFeatureGroups(getSPLOTFeatureModelsForFASE(), true, true);
	}
	
	@Test
	public void testFeatureGroupsOnCompleteBIGPCM() {
		System.out.println("Feature groups on complete BIG - PCM");
		testFeatureGroups(getPCMFeatureModels(), false, false);
	}

	@Ignore
	@Test
	public void testFeatureGroupsOnFeatureGraphPCM() {
		System.out.println("Feature groups on feature graph - PCM");
		testFeatureGroups(getPCMFeatureModels(), true, false);
	}



	public void testFeatureGroups(List<FeatureModelVariable> fms, boolean useFeatureGraph, boolean computeOrGroups) {

		if (!computeOrGroups) {
			System.out.println("Or groups are not computed");
		}
		
		int nbMutexGroups = 0;
		int nbXorGroups = 0;
		int nbOrGroups = 0;
		int nbValidMutexGroups = 0;
		int nbValidXorGroups = 0;
		int nbValidOrGroups = 0;
		
		List<Integer> listGroups = new ArrayList<Integer>();
		List<Integer> listMutex = new ArrayList<Integer>();
		List<Integer> listXor = new ArrayList<Integer>();
		List<Integer> listOr= new ArrayList<Integer>();
		
		List<Double> listValidGroups = new ArrayList<Double>();
		List<Double> listValidMutex = new ArrayList<Double>();
		List<Double> listValidXor = new ArrayList<Double>();
		List<Double> listValidOr= new ArrayList<Double>();

		for (FeatureModelVariable fm : fms) {
			FeatureGraph<String> diagram = fm.getFm().getDiagram();

			// Mutex
			Set<FGroup> mutexGroups = null; 
			if (useFeatureGraph) {
				mutexGroups = fm.toGeneralizedNotation().getMutexGroups();
			} else {
				mutexGroups = fm.computeMutexGroups();
			}
			Set<Set<String>> expandedMutexGroups = expandGroups(mutexGroups);
			
			nbMutexGroups += expandedMutexGroups.size();
			listMutex.add(expandedMutexGroups.size());
			
			int validMutex= countValidGroups(diagram, expandedMutexGroups);
			nbValidMutexGroups += validMutex;
			if (!expandedMutexGroups.isEmpty()) {
				listValidMutex.add(validMutex / ((double) expandedMutexGroups.size()));	
			}
			
			
			// Xor
			Set<FGroup> xorGroups = null;
			if (useFeatureGraph) {
				xorGroups = fm.toGeneralizedNotation().getXorGroups();
			} else {
				xorGroups = fm.computeXorGroups();
			}
			Set<Set<String>> expandedXorGroups = expandGroups(xorGroups);
			
			nbXorGroups += expandedXorGroups.size();
			listXor.add(expandedXorGroups.size());
			
			int validXor = countValidGroups(diagram, expandedXorGroups);
			nbValidXorGroups += validXor;
			if (!expandedXorGroups.isEmpty()) {
				listValidXor.add(validXor / ((double) expandedXorGroups.size()));
			}
			

			if (computeOrGroups) {
				// Or
				Set<FGroup> orGroups = fm.computeOrGroups();
				Set<Set<String>> expandedOrGroups = expandGroups(orGroups);
				nbOrGroups += expandedOrGroups.size();
				listOr.add(expandedOrGroups.size());
				
				int validOr = countValidGroups(diagram, expandedOrGroups);
				nbValidOrGroups += validOr;
				if (!expandedOrGroups.isEmpty()) {
					listValidOr.add(validOr / ((double) expandedOrGroups.size()));
				}
				
				int nbGroups = expandedMutexGroups.size() + expandedXorGroups.size() + expandedOrGroups.size();
				if (nbGroups != 0) {
					listValidGroups.add((validMutex + validXor + validOr) / ((double) nbGroups));	
				}
				listGroups.add(nbGroups);
				
			} else {
				int nbGroups = expandedMutexGroups.size() + expandedXorGroups.size();
				if (nbGroups != 0) {
					listValidGroups.add((validMutex + validXor) / ((double) nbGroups));
				}
				listGroups.add(nbGroups);
			}
			
			
		}



		
		System.out.println("Results by fm");
		System.out.println("Nb of groups : " + averageInt(listGroups) + " (average) " + medianInt(listGroups) + " (median)");
		System.out.println(averageDouble(listValidGroups) + " (average) " + medianDouble(listValidGroups) + " (median) " +
		" groups are valid clusters");
		
		System.out.println("Nb of Mutex groups : " + averageInt(listMutex) + " (average) " + medianInt(listMutex) + " (median)");
		System.out.println(averageDouble(listValidMutex) + " (average) " + medianDouble(listValidMutex) + " (median) " +
		" are valid mutex groups");
		
		System.out.println("Nb of Xor groups : " + averageInt(listXor) + " (average) " + medianInt(listXor) + " (median)");
		System.out.println(averageDouble(listValidXor) + " (average) " + medianDouble(listValidXor) + " (median) " +
		" are valid xor groups");
		
		System.out.println("Nb of Or groups : " + averageInt(listOr) + " (average) " + medianInt(listOr) + " (median)");
		System.out.println(averageDouble(listValidOr) + " (average) " + medianDouble(listValidOr) + " (median) " +
		" are valid or groups");
		
		System.out.println();
		System.out.println("Global results");
		int nbGroups = nbMutexGroups + nbXorGroups + nbOrGroups; 
		int nbValidGroups = nbValidMutexGroups + nbValidXorGroups + nbValidOrGroups;
		System.out.println(nbValidGroups + " / " + nbGroups + " groups are valid clusters");
		System.out.println(nbValidMutexGroups + " / " + nbMutexGroups + " are valid mutex groups");
		System.out.println(nbValidXorGroups + " / " + nbXorGroups + " are valid xor groups");
		System.out.println(nbValidOrGroups + " / " + nbOrGroups + " are valid or groups");
	}



	private Set<Set<String>> expandGroups(Set<FGroup> fGroups) {
		Set<Set<String>> expandedGroups = new HashSet<Set<String>>();

		for (FGroup fGroup : fGroups) {

			List<Set<String>> featureSets = new ArrayList<Set<String>>();
			for (FeatureNode<String> source : fGroup.getSources()) {
				featureSets.add(source.features());
			}

			for (List<String> expandedGroup : Sets.cartesianProduct(featureSets)) {
				expandedGroups.add(new HashSet<String>(expandedGroup));
			}


		}

		return expandedGroups;
	}

	private int countValidGroups(FeatureGraph<String> diagram, Set<Set<String>> groups) {
		int nbValidGroups = 0;

		for (Set<String> group : groups) {
			if (checkGroup(diagram, group)) {
				nbValidGroups++;	
			}	
		}

		return nbValidGroups;
	}

	private boolean checkGroup(FeatureGraph<String> diagram, Set<String> group) {
		// Retrieve siblings in the feature diagram
		List<Set<String>> siblingSets = convertInSetOfString(diagram.getSiblingSetsInBFS());

		// Check that a set of siblings contains the group
		for (Set<String> siblingSet : siblingSets) {
			if (siblingSet.containsAll(group)) {
				return true;
			}
		}

		return false;
	}

	//	public void testFeatureGroups(boolean useFeatureGraph) {
	//		int nbGroups = 0;
	//		int nbMutexGroups = 0;
	//		int nbXorGroups = 0;
	//		int nbOrGroups = 0;
	//		int nbValidGroups = 0;
	//		int nbValidMutexGroups = 0;
	//		int nbValidXorGroups = 0;
	//		int nbValidOrGroups = 0;
	//		
	//		for (FeatureModelVariable fm : fms) {
	//			FeatureGraph<String> diagram = fm.getFm().getDiagram();
	//			
	//			Set<FGroup> groups = new HashSet<FGroup>();
	//			
	//			// Mutex
	//			Set<FGroup> mutexGroups = null; 
	//			if (useFeatureGraph) {
	//				mutexGroups = fm.toGeneralizedNotation().getMutexGroups();
	//			} else {
	//				mutexGroups = fm.computeMutexGroups();
	//			}
	//			mutexGroups = expandGroups(mutexGroups, FeatureEdge.MUTEX);
	//			groups.addAll(mutexGroups);
	//			nbMutexGroups += mutexGroups.size();
	//			
	//			// Xor
	//			Set<FGroup> xorGroups = null;
	//			if (useFeatureGraph) {
	//				xorGroups = fm.toGeneralizedNotation().getXorGroups();
	//			} else {
	//				xorGroups = fm.computeXorGroups();
	//			}
	//			xorGroups = expandGroups(xorGroups, FeatureEdge.XOR);
	//			groups.addAll(xorGroups);
	//			nbXorGroups += xorGroups.size();
	//			
	//			// Or
	//			Set<FGroup> orGroups = fm.computeOrGroups();
	//			orGroups = expandGroups(orGroups, FeatureEdge.OR);
	//			groups.addAll(orGroups);
	//			nbOrGroups += orGroups.size();
	//			
	//			nbGroups += groups.size();
	//			
	//			// Checking groups
	//			for (FGroup group : groups) {
	//				if (checkGroupAsSiblings(diagram, group)) {
	//					nbValidGroups++;
	//					if (group.isMutex()) {
	//						nbValidMutexGroups++;
	//					} else if (group.isXor()) {
	//						nbValidXorGroups++;
	//					} else { // or group
	//						nbValidOrGroups++;
	//					}
	//				}
	//			}
	//				
	//		}
	//		
	//		System.out.println(nbValidGroups + " / " + nbGroups + " groups are valid clusters");
	//		System.out.println(nbValidMutexGroups + " / " + nbMutexGroups + " are valid mutex groups");
	//		System.out.println(nbValidXorGroups + " / " + nbXorGroups + " are valid xor groups");
	//		System.out.println(nbValidOrGroups + " / " + nbOrGroups + " are valid or groups");
	//	}
	//	
	//	/**
	//	 * Separate the contracted parents in different groups
	//	 * @param groups
	//	 * @param edgeType
	//	 * @return
	//	 */
	//	private Set<FGroup> expandGroups(Set<FGroup> groups, int edgeType) {
	//		Set<FGroup> expandedGroups = new HashSet<FGroup>();
	//		
	//		for (FGroup group : groups) {
	//			FeatureNode<String> target = group.getTarget();
	//			Set<FeatureNode<String>> sources = group.getSources();
	//			
	//			for (String parent : target.features()) {
	//				FeatureNode<String> parentNode = new FeatureNode<String>(parent);
	//				FGroup newGroup = FGroupBuilder.make(sources, parentNode, edgeType);
	//				expandedGroups.add(newGroup);
	//				System.out.println(newGroup);
	//			}
	//			
	//		}
	//		
	//		return expandedGroups;
	//	}
	//
	//	/**
	//	 * Check that a group represents a parent and its children
	//	 * @param diagram
	//	 * @param group
	//	 * @return
	//	 */
	//	private boolean checkGroupAsParentAndSiblings(FeatureGraph<String> diagram, FGroup group) {
	//		boolean validGroup = true;
	//		
	//		Set<FeatureNode<String>> sources = group.getSources();
	//		FeatureNode<String> target = group.getTarget();
	//		target.getFeature(); // Just for checking the group
	//		for (FeatureNode<String> source : sources) {
	//			if (!diagram.containsEdge(source, target, FeatureEdge.HIERARCHY)) {
	//				validGroup = false;
	//				break;
	//			}
	//		}
	//		
	//		return validGroup;
	//	}
	//	
	//	/**
	//	 * Check that the children in a group are siblings
	//	 * @param diagram
	//	 * @param group
	//	 * @return
	//	 */
	//	private boolean checkGroupAsSiblings(FeatureGraph<String> diagram, FGroup group) {
	//
	//		// Retrieve siblings in the feature diagram
	//		List<Set<String>> siblingSets = convertInSetOfString(diagram.getSiblingSetsInBFS());
	//		
	//		// Convert group as a set of string
	//		Set<FeatureNode<String>> sources = group.getSources();
	//		Set<String> children = new HashSet<String>();
	//		for (FeatureNode<String> source : sources) {
	//			children.addAll(source.features());
	//		}
	//		
	//		// Check that a set of siblings contains the group
	//		for (Set<String> siblingSet : siblingSets) {
	//			if (siblingSet.containsAll(children)) {
	//				return true;
	//			}
	//		}
	//		
	//		return false;
	//	}
}
