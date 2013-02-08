/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.FmleroGrammarAccess;

public class FmleroParser extends AbstractContentAssistParser {
	
	@Inject
	private FmleroGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFmleroParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFmleroParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFmleroParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFeatureModelPrimitiveAccess().getAlternatives(), "rule__FeatureModelPrimitive__Alternatives");
					put(grammarAccess.getFeatureHasSubfeatureAccess().getAlternatives(), "rule__FeatureHasSubfeature__Alternatives");
					put(grammarAccess.getUndirectedRelationshipAccess().getAlternatives(), "rule__UndirectedRelationship__Alternatives");
					put(grammarAccess.getDirectedRelationshipAccess().getAlternatives(), "rule__DirectedRelationship__Alternatives");
					put(grammarAccess.getFeatureGroupAccess().getAlternatives(), "rule__FeatureGroup__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getConfigurationSourceAccess().getAlternatives(), "rule__ConfigurationSource__Alternatives");
					put(grammarAccess.getFeatureModelAccess().getGroup(), "rule__FeatureModel__Group__0");
					put(grammarAccess.getFeatureModelAccess().getGroup_5(), "rule__FeatureModel__Group_5__0");
					put(grammarAccess.getFeatureModelAccess().getGroup_5_3(), "rule__FeatureModel__Group_5_3__0");
					put(grammarAccess.getFeatureModelAccess().getGroup_6(), "rule__FeatureModel__Group_6__0");
					put(grammarAccess.getFeatureModelAccess().getGroup_6_3(), "rule__FeatureModel__Group_6_3__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_5(), "rule__Feature__Group_5__0");
					put(grammarAccess.getFeatureAccess().getGroup_5_3(), "rule__Feature__Group_5_3__0");
					put(grammarAccess.getFeatureAccess().getGroup_6(), "rule__Feature__Group_6__0");
					put(grammarAccess.getFeatureAccess().getGroup_6_3(), "rule__Feature__Group_6_3__0");
					put(grammarAccess.getFeatureAccess().getGroup_7(), "rule__Feature__Group_7__0");
					put(grammarAccess.getFeatureAccess().getGroup_8(), "rule__Feature__Group_8__0");
					put(grammarAccess.getFeatureAccess().getGroup_8_3(), "rule__Feature__Group_8_3__0");
					put(grammarAccess.getFeatureAccess().getGroup_9(), "rule__Feature__Group_9__0");
					put(grammarAccess.getFeatureAccess().getGroup_9_3(), "rule__Feature__Group_9_3__0");
					put(grammarAccess.getFeatureAccess().getGroup_10(), "rule__Feature__Group_10__0");
					put(grammarAccess.getFeatureAccess().getGroup_10_3(), "rule__Feature__Group_10_3__0");
					put(grammarAccess.getFeatureAccess().getGroup_11(), "rule__Feature__Group_11__0");
					put(grammarAccess.getFeatureAccess().getGroup_11_3(), "rule__Feature__Group_11_3__0");
					put(grammarAccess.getFeatureAccess().getGroup_12(), "rule__Feature__Group_12__0");
					put(grammarAccess.getFeatureAccess().getGroup_12_3(), "rule__Feature__Group_12_3__0");
					put(grammarAccess.getFeatureAccess().getGroup_13(), "rule__Feature__Group_13__0");
					put(grammarAccess.getFeatureAccess().getGroup_13_3(), "rule__Feature__Group_13_3__0");
					put(grammarAccess.getFeatureAccess().getGroup_14(), "rule__Feature__Group_14__0");
					put(grammarAccess.getGroupHasParentAccess().getGroup(), "rule__GroupHasParent__Group__0");
					put(grammarAccess.getGroupHasParentAccess().getGroup_7(), "rule__GroupHasParent__Group_7__0");
					put(grammarAccess.getGroupHasParentAccess().getGroup_7_3(), "rule__GroupHasParent__Group_7_3__0");
					put(grammarAccess.getGroupHasChildAccess().getGroup(), "rule__GroupHasChild__Group__0");
					put(grammarAccess.getGroupHasChildAccess().getGroup_7(), "rule__GroupHasChild__Group_7__0");
					put(grammarAccess.getGroupHasChildAccess().getGroup_7_3(), "rule__GroupHasChild__Group_7_3__0");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getGroup(), "rule__FeatureHasSubfeature_Impl__Group__0");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getGroup_7(), "rule__FeatureHasSubfeature_Impl__Group_7__0");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getGroup_7_3(), "rule__FeatureHasSubfeature_Impl__Group_7_3__0");
					put(grammarAccess.getSelectedFeatureAccess().getGroup(), "rule__SelectedFeature__Group__0");
					put(grammarAccess.getSelectedFeatureAccess().getGroup_7(), "rule__SelectedFeature__Group_7__0");
					put(grammarAccess.getSelectedFeatureAccess().getGroup_7_3(), "rule__SelectedFeature__Group_7_3__0");
					put(grammarAccess.getEliminatedFeatureAccess().getGroup(), "rule__EliminatedFeature__Group__0");
					put(grammarAccess.getEliminatedFeatureAccess().getGroup_7(), "rule__EliminatedFeature__Group_7__0");
					put(grammarAccess.getEliminatedFeatureAccess().getGroup_7_3(), "rule__EliminatedFeature__Group_7_3__0");
					put(grammarAccess.getFeatureIsRootAccess().getGroup(), "rule__FeatureIsRoot__Group__0");
					put(grammarAccess.getFeatureIsRootAccess().getGroup_7(), "rule__FeatureIsRoot__Group_7__0");
					put(grammarAccess.getFeatureIsRootAccess().getGroup_7_3(), "rule__FeatureIsRoot__Group_7_3__0");
					put(grammarAccess.getExplanationAccess().getGroup(), "rule__Explanation__Group__0");
					put(grammarAccess.getExplanationAccess().getGroup_3(), "rule__Explanation__Group_3__0");
					put(grammarAccess.getExplanationAccess().getGroup_3_3(), "rule__Explanation__Group_3_3__0");
					put(grammarAccess.getGroupHasMaxAccess().getGroup(), "rule__GroupHasMax__Group__0");
					put(grammarAccess.getGroupHasMaxAccess().getGroup_9(), "rule__GroupHasMax__Group_9__0");
					put(grammarAccess.getGroupHasMaxAccess().getGroup_9_3(), "rule__GroupHasMax__Group_9_3__0");
					put(grammarAccess.getGroupHasMinAccess().getGroup(), "rule__GroupHasMin__Group__0");
					put(grammarAccess.getGroupHasMinAccess().getGroup_9(), "rule__GroupHasMin__Group_9__0");
					put(grammarAccess.getGroupHasMinAccess().getGroup_9_3(), "rule__GroupHasMin__Group_9_3__0");
					put(grammarAccess.getAlternativeGroupAccess().getGroup(), "rule__AlternativeGroup__Group__0");
					put(grammarAccess.getAlternativeGroupAccess().getGroup_7(), "rule__AlternativeGroup__Group_7__0");
					put(grammarAccess.getAlternativeGroupAccess().getGroup_7_3(), "rule__AlternativeGroup__Group_7_3__0");
					put(grammarAccess.getAlternativeGroupAccess().getGroup_10(), "rule__AlternativeGroup__Group_10__0");
					put(grammarAccess.getAlternativeGroupAccess().getGroup_10_3(), "rule__AlternativeGroup__Group_10_3__0");
					put(grammarAccess.getAlternativeGroupAccess().getGroup_11(), "rule__AlternativeGroup__Group_11__0");
					put(grammarAccess.getAlternativeGroupAccess().getGroup_12(), "rule__AlternativeGroup__Group_12__0");
					put(grammarAccess.getOrGroupAccess().getGroup(), "rule__OrGroup__Group__0");
					put(grammarAccess.getOrGroupAccess().getGroup_7(), "rule__OrGroup__Group_7__0");
					put(grammarAccess.getOrGroupAccess().getGroup_7_3(), "rule__OrGroup__Group_7_3__0");
					put(grammarAccess.getOrGroupAccess().getGroup_10(), "rule__OrGroup__Group_10__0");
					put(grammarAccess.getOrGroupAccess().getGroup_10_3(), "rule__OrGroup__Group_10_3__0");
					put(grammarAccess.getOrGroupAccess().getGroup_11(), "rule__OrGroup__Group_11__0");
					put(grammarAccess.getOrGroupAccess().getGroup_12(), "rule__OrGroup__Group_12__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getGroup(), "rule__FeatureHasOptionalSubfeature__Group__0");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getGroup_7(), "rule__FeatureHasOptionalSubfeature__Group_7__0");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getGroup_7_3(), "rule__FeatureHasOptionalSubfeature__Group_7_3__0");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getGroup(), "rule__FeatureHasMandatorySubfeature__Group__0");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getGroup_7(), "rule__FeatureHasMandatorySubfeature__Group_7__0");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getGroup_7_3(), "rule__FeatureHasMandatorySubfeature__Group_7_3__0");
					put(grammarAccess.getMutualExclusiveAccess().getGroup(), "rule__MutualExclusive__Group__0");
					put(grammarAccess.getMutualExclusiveAccess().getGroup_7(), "rule__MutualExclusive__Group_7__0");
					put(grammarAccess.getMutualExclusiveAccess().getGroup_7_3(), "rule__MutualExclusive__Group_7_3__0");
					put(grammarAccess.getMutualExclusiveAccess().getGroup_8(), "rule__MutualExclusive__Group_8__0");
					put(grammarAccess.getMutualExclusiveAccess().getGroup_8_3(), "rule__MutualExclusive__Group_8_3__0");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getGroup(), "rule__CustomUndirectedRelationship__Group__0");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getGroup_9(), "rule__CustomUndirectedRelationship__Group_9__0");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getGroup_9_3(), "rule__CustomUndirectedRelationship__Group_9_3__0");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getGroup_10(), "rule__CustomUndirectedRelationship__Group_10__0");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getGroup_10_3(), "rule__CustomUndirectedRelationship__Group_10_3__0");
					put(grammarAccess.getRequiresAccess().getGroup(), "rule__Requires__Group__0");
					put(grammarAccess.getRequiresAccess().getGroup_7(), "rule__Requires__Group_7__0");
					put(grammarAccess.getRequiresAccess().getGroup_7_3(), "rule__Requires__Group_7_3__0");
					put(grammarAccess.getRequiresAccess().getGroup_8(), "rule__Requires__Group_8__0");
					put(grammarAccess.getRequiresAccess().getGroup_8_3(), "rule__Requires__Group_8_3__0");
					put(grammarAccess.getRequiresAccess().getGroup_9(), "rule__Requires__Group_9__0");
					put(grammarAccess.getRequiresAccess().getGroup_9_3(), "rule__Requires__Group_9_3__0");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getGroup(), "rule__TemporalOrderingSequential__Group__0");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getGroup_7(), "rule__TemporalOrderingSequential__Group_7__0");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getGroup_7_3(), "rule__TemporalOrderingSequential__Group_7_3__0");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getGroup_8(), "rule__TemporalOrderingSequential__Group_8__0");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getGroup_8_3(), "rule__TemporalOrderingSequential__Group_8_3__0");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getGroup_9(), "rule__TemporalOrderingSequential__Group_9__0");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getGroup_9_3(), "rule__TemporalOrderingSequential__Group_9_3__0");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getGroup(), "rule__CustomDirectedRelationship__Group__0");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getGroup_9(), "rule__CustomDirectedRelationship__Group_9__0");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getGroup_9_3(), "rule__CustomDirectedRelationship__Group_9_3__0");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getGroup_10(), "rule__CustomDirectedRelationship__Group_10__0");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getGroup_10_3(), "rule__CustomDirectedRelationship__Group_10_3__0");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getGroup_11(), "rule__CustomDirectedRelationship__Group_11__0");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getGroup_11_3(), "rule__CustomDirectedRelationship__Group_11_3__0");
					put(grammarAccess.getAutoCompleteAccess().getGroup(), "rule__AutoComplete__Group__0");
					put(grammarAccess.getAutoCompleteAccess().getGroup_7(), "rule__AutoComplete__Group_7__0");
					put(grammarAccess.getAutoCompleteAccess().getGroup_7_3(), "rule__AutoComplete__Group_7_3__0");
					put(grammarAccess.getFeatureModelAccess().getIdAssignment_1(), "rule__FeatureModel__IdAssignment_1");
					put(grammarAccess.getFeatureModelAccess().getNameAssignment_4(), "rule__FeatureModel__NameAssignment_4");
					put(grammarAccess.getFeatureModelAccess().getFeaturesAssignment_5_2(), "rule__FeatureModel__FeaturesAssignment_5_2");
					put(grammarAccess.getFeatureModelAccess().getFeaturesAssignment_5_3_1(), "rule__FeatureModel__FeaturesAssignment_5_3_1");
					put(grammarAccess.getFeatureModelAccess().getPrimitivesAssignment_6_2(), "rule__FeatureModel__PrimitivesAssignment_6_2");
					put(grammarAccess.getFeatureModelAccess().getPrimitivesAssignment_6_3_1(), "rule__FeatureModel__PrimitivesAssignment_6_3_1");
					put(grammarAccess.getFeatureAccess().getIdAssignment_1(), "rule__Feature__IdAssignment_1");
					put(grammarAccess.getFeatureAccess().getNameAssignment_4(), "rule__Feature__NameAssignment_4");
					put(grammarAccess.getFeatureAccess().getGroupHasParentAssignment_5_2(), "rule__Feature__GroupHasParentAssignment_5_2");
					put(grammarAccess.getFeatureAccess().getGroupHasParentAssignment_5_3_1(), "rule__Feature__GroupHasParentAssignment_5_3_1");
					put(grammarAccess.getFeatureAccess().getGroupHasChildAssignment_6_2(), "rule__Feature__GroupHasChildAssignment_6_2");
					put(grammarAccess.getFeatureAccess().getGroupHasChildAssignment_6_3_1(), "rule__Feature__GroupHasChildAssignment_6_3_1");
					put(grammarAccess.getFeatureAccess().getFeatureHasParentAssignment_7_1(), "rule__Feature__FeatureHasParentAssignment_7_1");
					put(grammarAccess.getFeatureAccess().getFeatureHasSubfeatureAssignment_8_2(), "rule__Feature__FeatureHasSubfeatureAssignment_8_2");
					put(grammarAccess.getFeatureAccess().getFeatureHasSubfeatureAssignment_8_3_1(), "rule__Feature__FeatureHasSubfeatureAssignment_8_3_1");
					put(grammarAccess.getFeatureAccess().getSelectedFeatureAssignment_9_2(), "rule__Feature__SelectedFeatureAssignment_9_2");
					put(grammarAccess.getFeatureAccess().getSelectedFeatureAssignment_9_3_1(), "rule__Feature__SelectedFeatureAssignment_9_3_1");
					put(grammarAccess.getFeatureAccess().getEliminatedFeatureAssignment_10_2(), "rule__Feature__EliminatedFeatureAssignment_10_2");
					put(grammarAccess.getFeatureAccess().getEliminatedFeatureAssignment_10_3_1(), "rule__Feature__EliminatedFeatureAssignment_10_3_1");
					put(grammarAccess.getFeatureAccess().getUndirectedRelationshipsAssignment_11_2(), "rule__Feature__UndirectedRelationshipsAssignment_11_2");
					put(grammarAccess.getFeatureAccess().getUndirectedRelationshipsAssignment_11_3_1(), "rule__Feature__UndirectedRelationshipsAssignment_11_3_1");
					put(grammarAccess.getFeatureAccess().getIncomingDirectedRelationshipsAssignment_12_2(), "rule__Feature__IncomingDirectedRelationshipsAssignment_12_2");
					put(grammarAccess.getFeatureAccess().getIncomingDirectedRelationshipsAssignment_12_3_1(), "rule__Feature__IncomingDirectedRelationshipsAssignment_12_3_1");
					put(grammarAccess.getFeatureAccess().getOutgoingDirectedRelationshipsAssignment_13_2(), "rule__Feature__OutgoingDirectedRelationshipsAssignment_13_2");
					put(grammarAccess.getFeatureAccess().getOutgoingDirectedRelationshipsAssignment_13_3_1(), "rule__Feature__OutgoingDirectedRelationshipsAssignment_13_3_1");
					put(grammarAccess.getFeatureAccess().getFeatureIsRootAssignment_14_1(), "rule__Feature__FeatureIsRootAssignment_14_1");
					put(grammarAccess.getGroupHasParentAccess().getIdAssignment_1(), "rule__GroupHasParent__IdAssignment_1");
					put(grammarAccess.getGroupHasParentAccess().getNameAssignment_4(), "rule__GroupHasParent__NameAssignment_4");
					put(grammarAccess.getGroupHasParentAccess().getConfigurationSourceAssignment_6(), "rule__GroupHasParent__ConfigurationSourceAssignment_6");
					put(grammarAccess.getGroupHasParentAccess().getExplanationsAssignment_7_2(), "rule__GroupHasParent__ExplanationsAssignment_7_2");
					put(grammarAccess.getGroupHasParentAccess().getExplanationsAssignment_7_3_1(), "rule__GroupHasParent__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getGroupHasParentAccess().getParentAssignment_9(), "rule__GroupHasParent__ParentAssignment_9");
					put(grammarAccess.getGroupHasParentAccess().getGroupAssignment_11(), "rule__GroupHasParent__GroupAssignment_11");
					put(grammarAccess.getGroupHasChildAccess().getIdAssignment_1(), "rule__GroupHasChild__IdAssignment_1");
					put(grammarAccess.getGroupHasChildAccess().getNameAssignment_4(), "rule__GroupHasChild__NameAssignment_4");
					put(grammarAccess.getGroupHasChildAccess().getConfigurationSourceAssignment_6(), "rule__GroupHasChild__ConfigurationSourceAssignment_6");
					put(grammarAccess.getGroupHasChildAccess().getExplanationsAssignment_7_2(), "rule__GroupHasChild__ExplanationsAssignment_7_2");
					put(grammarAccess.getGroupHasChildAccess().getExplanationsAssignment_7_3_1(), "rule__GroupHasChild__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getGroupHasChildAccess().getChildAssignment_9(), "rule__GroupHasChild__ChildAssignment_9");
					put(grammarAccess.getGroupHasChildAccess().getGroupAssignment_11(), "rule__GroupHasChild__GroupAssignment_11");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getIdAssignment_1(), "rule__FeatureHasSubfeature_Impl__IdAssignment_1");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getNameAssignment_4(), "rule__FeatureHasSubfeature_Impl__NameAssignment_4");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getConfigurationSourceAssignment_6(), "rule__FeatureHasSubfeature_Impl__ConfigurationSourceAssignment_6");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getExplanationsAssignment_7_2(), "rule__FeatureHasSubfeature_Impl__ExplanationsAssignment_7_2");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getExplanationsAssignment_7_3_1(), "rule__FeatureHasSubfeature_Impl__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getParentAssignment_9(), "rule__FeatureHasSubfeature_Impl__ParentAssignment_9");
					put(grammarAccess.getFeatureHasSubfeature_ImplAccess().getSubfeatureAssignment_11(), "rule__FeatureHasSubfeature_Impl__SubfeatureAssignment_11");
					put(grammarAccess.getSelectedFeatureAccess().getIdAssignment_1(), "rule__SelectedFeature__IdAssignment_1");
					put(grammarAccess.getSelectedFeatureAccess().getNameAssignment_4(), "rule__SelectedFeature__NameAssignment_4");
					put(grammarAccess.getSelectedFeatureAccess().getConfigurationSourceAssignment_6(), "rule__SelectedFeature__ConfigurationSourceAssignment_6");
					put(grammarAccess.getSelectedFeatureAccess().getExplanationsAssignment_7_2(), "rule__SelectedFeature__ExplanationsAssignment_7_2");
					put(grammarAccess.getSelectedFeatureAccess().getExplanationsAssignment_7_3_1(), "rule__SelectedFeature__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getSelectedFeatureAccess().getFeatureAssignment_9(), "rule__SelectedFeature__FeatureAssignment_9");
					put(grammarAccess.getEliminatedFeatureAccess().getIdAssignment_1(), "rule__EliminatedFeature__IdAssignment_1");
					put(grammarAccess.getEliminatedFeatureAccess().getNameAssignment_4(), "rule__EliminatedFeature__NameAssignment_4");
					put(grammarAccess.getEliminatedFeatureAccess().getConfigurationSourceAssignment_6(), "rule__EliminatedFeature__ConfigurationSourceAssignment_6");
					put(grammarAccess.getEliminatedFeatureAccess().getExplanationsAssignment_7_2(), "rule__EliminatedFeature__ExplanationsAssignment_7_2");
					put(grammarAccess.getEliminatedFeatureAccess().getExplanationsAssignment_7_3_1(), "rule__EliminatedFeature__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getEliminatedFeatureAccess().getFeatureAssignment_9(), "rule__EliminatedFeature__FeatureAssignment_9");
					put(grammarAccess.getFeatureIsRootAccess().getIdAssignment_1(), "rule__FeatureIsRoot__IdAssignment_1");
					put(grammarAccess.getFeatureIsRootAccess().getNameAssignment_4(), "rule__FeatureIsRoot__NameAssignment_4");
					put(grammarAccess.getFeatureIsRootAccess().getConfigurationSourceAssignment_6(), "rule__FeatureIsRoot__ConfigurationSourceAssignment_6");
					put(grammarAccess.getFeatureIsRootAccess().getExplanationsAssignment_7_2(), "rule__FeatureIsRoot__ExplanationsAssignment_7_2");
					put(grammarAccess.getFeatureIsRootAccess().getExplanationsAssignment_7_3_1(), "rule__FeatureIsRoot__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getFeatureIsRootAccess().getFeatureAssignment_9(), "rule__FeatureIsRoot__FeatureAssignment_9");
					put(grammarAccess.getExplanationAccess().getPrimitivesAssignment_3_2(), "rule__Explanation__PrimitivesAssignment_3_2");
					put(grammarAccess.getExplanationAccess().getPrimitivesAssignment_3_3_1(), "rule__Explanation__PrimitivesAssignment_3_3_1");
					put(grammarAccess.getGroupHasMaxAccess().getIdAssignment_1(), "rule__GroupHasMax__IdAssignment_1");
					put(grammarAccess.getGroupHasMaxAccess().getNameAssignment_4(), "rule__GroupHasMax__NameAssignment_4");
					put(grammarAccess.getGroupHasMaxAccess().getConfigurationSourceAssignment_6(), "rule__GroupHasMax__ConfigurationSourceAssignment_6");
					put(grammarAccess.getGroupHasMaxAccess().getMaxAssignment_8(), "rule__GroupHasMax__MaxAssignment_8");
					put(grammarAccess.getGroupHasMaxAccess().getExplanationsAssignment_9_2(), "rule__GroupHasMax__ExplanationsAssignment_9_2");
					put(grammarAccess.getGroupHasMaxAccess().getExplanationsAssignment_9_3_1(), "rule__GroupHasMax__ExplanationsAssignment_9_3_1");
					put(grammarAccess.getGroupHasMaxAccess().getGroupAssignment_11(), "rule__GroupHasMax__GroupAssignment_11");
					put(grammarAccess.getGroupHasMinAccess().getIdAssignment_1(), "rule__GroupHasMin__IdAssignment_1");
					put(grammarAccess.getGroupHasMinAccess().getNameAssignment_4(), "rule__GroupHasMin__NameAssignment_4");
					put(grammarAccess.getGroupHasMinAccess().getConfigurationSourceAssignment_6(), "rule__GroupHasMin__ConfigurationSourceAssignment_6");
					put(grammarAccess.getGroupHasMinAccess().getMinAssignment_8(), "rule__GroupHasMin__MinAssignment_8");
					put(grammarAccess.getGroupHasMinAccess().getExplanationsAssignment_9_2(), "rule__GroupHasMin__ExplanationsAssignment_9_2");
					put(grammarAccess.getGroupHasMinAccess().getExplanationsAssignment_9_3_1(), "rule__GroupHasMin__ExplanationsAssignment_9_3_1");
					put(grammarAccess.getGroupHasMinAccess().getGroupAssignment_11(), "rule__GroupHasMin__GroupAssignment_11");
					put(grammarAccess.getAlternativeGroupAccess().getIdAssignment_1(), "rule__AlternativeGroup__IdAssignment_1");
					put(grammarAccess.getAlternativeGroupAccess().getNameAssignment_4(), "rule__AlternativeGroup__NameAssignment_4");
					put(grammarAccess.getAlternativeGroupAccess().getConfigurationSourceAssignment_6(), "rule__AlternativeGroup__ConfigurationSourceAssignment_6");
					put(grammarAccess.getAlternativeGroupAccess().getExplanationsAssignment_7_2(), "rule__AlternativeGroup__ExplanationsAssignment_7_2");
					put(grammarAccess.getAlternativeGroupAccess().getExplanationsAssignment_7_3_1(), "rule__AlternativeGroup__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getAlternativeGroupAccess().getGroupHasParentAssignment_9(), "rule__AlternativeGroup__GroupHasParentAssignment_9");
					put(grammarAccess.getAlternativeGroupAccess().getGroupHasChildAssignment_10_2(), "rule__AlternativeGroup__GroupHasChildAssignment_10_2");
					put(grammarAccess.getAlternativeGroupAccess().getGroupHasChildAssignment_10_3_1(), "rule__AlternativeGroup__GroupHasChildAssignment_10_3_1");
					put(grammarAccess.getAlternativeGroupAccess().getGroupHasMaxAssignment_11_1(), "rule__AlternativeGroup__GroupHasMaxAssignment_11_1");
					put(grammarAccess.getAlternativeGroupAccess().getGroupHasMinAssignment_12_1(), "rule__AlternativeGroup__GroupHasMinAssignment_12_1");
					put(grammarAccess.getOrGroupAccess().getIdAssignment_1(), "rule__OrGroup__IdAssignment_1");
					put(grammarAccess.getOrGroupAccess().getNameAssignment_4(), "rule__OrGroup__NameAssignment_4");
					put(grammarAccess.getOrGroupAccess().getConfigurationSourceAssignment_6(), "rule__OrGroup__ConfigurationSourceAssignment_6");
					put(grammarAccess.getOrGroupAccess().getExplanationsAssignment_7_2(), "rule__OrGroup__ExplanationsAssignment_7_2");
					put(grammarAccess.getOrGroupAccess().getExplanationsAssignment_7_3_1(), "rule__OrGroup__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getOrGroupAccess().getGroupHasParentAssignment_9(), "rule__OrGroup__GroupHasParentAssignment_9");
					put(grammarAccess.getOrGroupAccess().getGroupHasChildAssignment_10_2(), "rule__OrGroup__GroupHasChildAssignment_10_2");
					put(grammarAccess.getOrGroupAccess().getGroupHasChildAssignment_10_3_1(), "rule__OrGroup__GroupHasChildAssignment_10_3_1");
					put(grammarAccess.getOrGroupAccess().getGroupHasMaxAssignment_11_1(), "rule__OrGroup__GroupHasMaxAssignment_11_1");
					put(grammarAccess.getOrGroupAccess().getGroupHasMinAssignment_12_1(), "rule__OrGroup__GroupHasMinAssignment_12_1");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getIdAssignment_1(), "rule__FeatureHasOptionalSubfeature__IdAssignment_1");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getNameAssignment_4(), "rule__FeatureHasOptionalSubfeature__NameAssignment_4");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getConfigurationSourceAssignment_6(), "rule__FeatureHasOptionalSubfeature__ConfigurationSourceAssignment_6");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getExplanationsAssignment_7_2(), "rule__FeatureHasOptionalSubfeature__ExplanationsAssignment_7_2");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getExplanationsAssignment_7_3_1(), "rule__FeatureHasOptionalSubfeature__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getParentAssignment_9(), "rule__FeatureHasOptionalSubfeature__ParentAssignment_9");
					put(grammarAccess.getFeatureHasOptionalSubfeatureAccess().getSubfeatureAssignment_11(), "rule__FeatureHasOptionalSubfeature__SubfeatureAssignment_11");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getIdAssignment_1(), "rule__FeatureHasMandatorySubfeature__IdAssignment_1");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getNameAssignment_4(), "rule__FeatureHasMandatorySubfeature__NameAssignment_4");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getConfigurationSourceAssignment_6(), "rule__FeatureHasMandatorySubfeature__ConfigurationSourceAssignment_6");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getExplanationsAssignment_7_2(), "rule__FeatureHasMandatorySubfeature__ExplanationsAssignment_7_2");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getExplanationsAssignment_7_3_1(), "rule__FeatureHasMandatorySubfeature__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getParentAssignment_9(), "rule__FeatureHasMandatorySubfeature__ParentAssignment_9");
					put(grammarAccess.getFeatureHasMandatorySubfeatureAccess().getSubfeatureAssignment_11(), "rule__FeatureHasMandatorySubfeature__SubfeatureAssignment_11");
					put(grammarAccess.getMutualExclusiveAccess().getIdAssignment_1(), "rule__MutualExclusive__IdAssignment_1");
					put(grammarAccess.getMutualExclusiveAccess().getNameAssignment_4(), "rule__MutualExclusive__NameAssignment_4");
					put(grammarAccess.getMutualExclusiveAccess().getConfigurationSourceAssignment_6(), "rule__MutualExclusive__ConfigurationSourceAssignment_6");
					put(grammarAccess.getMutualExclusiveAccess().getExplanationsAssignment_7_2(), "rule__MutualExclusive__ExplanationsAssignment_7_2");
					put(grammarAccess.getMutualExclusiveAccess().getExplanationsAssignment_7_3_1(), "rule__MutualExclusive__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getMutualExclusiveAccess().getRelatedFeaturesAssignment_8_2(), "rule__MutualExclusive__RelatedFeaturesAssignment_8_2");
					put(grammarAccess.getMutualExclusiveAccess().getRelatedFeaturesAssignment_8_3_1(), "rule__MutualExclusive__RelatedFeaturesAssignment_8_3_1");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getIdAssignment_1(), "rule__CustomUndirectedRelationship__IdAssignment_1");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getNameAssignment_4(), "rule__CustomUndirectedRelationship__NameAssignment_4");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getConfigurationSourceAssignment_6(), "rule__CustomUndirectedRelationship__ConfigurationSourceAssignment_6");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getStereotypeAssignment_8(), "rule__CustomUndirectedRelationship__StereotypeAssignment_8");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getExplanationsAssignment_9_2(), "rule__CustomUndirectedRelationship__ExplanationsAssignment_9_2");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getExplanationsAssignment_9_3_1(), "rule__CustomUndirectedRelationship__ExplanationsAssignment_9_3_1");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getRelatedFeaturesAssignment_10_2(), "rule__CustomUndirectedRelationship__RelatedFeaturesAssignment_10_2");
					put(grammarAccess.getCustomUndirectedRelationshipAccess().getRelatedFeaturesAssignment_10_3_1(), "rule__CustomUndirectedRelationship__RelatedFeaturesAssignment_10_3_1");
					put(grammarAccess.getRequiresAccess().getIdAssignment_1(), "rule__Requires__IdAssignment_1");
					put(grammarAccess.getRequiresAccess().getNameAssignment_4(), "rule__Requires__NameAssignment_4");
					put(grammarAccess.getRequiresAccess().getConfigurationSourceAssignment_6(), "rule__Requires__ConfigurationSourceAssignment_6");
					put(grammarAccess.getRequiresAccess().getExplanationsAssignment_7_2(), "rule__Requires__ExplanationsAssignment_7_2");
					put(grammarAccess.getRequiresAccess().getExplanationsAssignment_7_3_1(), "rule__Requires__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getRequiresAccess().getSourcesAssignment_8_2(), "rule__Requires__SourcesAssignment_8_2");
					put(grammarAccess.getRequiresAccess().getSourcesAssignment_8_3_1(), "rule__Requires__SourcesAssignment_8_3_1");
					put(grammarAccess.getRequiresAccess().getTargetsAssignment_9_2(), "rule__Requires__TargetsAssignment_9_2");
					put(grammarAccess.getRequiresAccess().getTargetsAssignment_9_3_1(), "rule__Requires__TargetsAssignment_9_3_1");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getIdAssignment_1(), "rule__TemporalOrderingSequential__IdAssignment_1");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getNameAssignment_4(), "rule__TemporalOrderingSequential__NameAssignment_4");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getConfigurationSourceAssignment_6(), "rule__TemporalOrderingSequential__ConfigurationSourceAssignment_6");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getExplanationsAssignment_7_2(), "rule__TemporalOrderingSequential__ExplanationsAssignment_7_2");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getExplanationsAssignment_7_3_1(), "rule__TemporalOrderingSequential__ExplanationsAssignment_7_3_1");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getSourcesAssignment_8_2(), "rule__TemporalOrderingSequential__SourcesAssignment_8_2");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getSourcesAssignment_8_3_1(), "rule__TemporalOrderingSequential__SourcesAssignment_8_3_1");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getTargetsAssignment_9_2(), "rule__TemporalOrderingSequential__TargetsAssignment_9_2");
					put(grammarAccess.getTemporalOrderingSequentialAccess().getTargetsAssignment_9_3_1(), "rule__TemporalOrderingSequential__TargetsAssignment_9_3_1");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getIdAssignment_1(), "rule__CustomDirectedRelationship__IdAssignment_1");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getNameAssignment_4(), "rule__CustomDirectedRelationship__NameAssignment_4");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getConfigurationSourceAssignment_6(), "rule__CustomDirectedRelationship__ConfigurationSourceAssignment_6");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getStereotypeAssignment_8(), "rule__CustomDirectedRelationship__StereotypeAssignment_8");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getExplanationsAssignment_9_2(), "rule__CustomDirectedRelationship__ExplanationsAssignment_9_2");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getExplanationsAssignment_9_3_1(), "rule__CustomDirectedRelationship__ExplanationsAssignment_9_3_1");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getSourcesAssignment_10_2(), "rule__CustomDirectedRelationship__SourcesAssignment_10_2");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getSourcesAssignment_10_3_1(), "rule__CustomDirectedRelationship__SourcesAssignment_10_3_1");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getTargetsAssignment_11_2(), "rule__CustomDirectedRelationship__TargetsAssignment_11_2");
					put(grammarAccess.getCustomDirectedRelationshipAccess().getTargetsAssignment_11_3_1(), "rule__CustomDirectedRelationship__TargetsAssignment_11_3_1");
					put(grammarAccess.getAutoCompleteAccess().getIdAssignment_1(), "rule__AutoComplete__IdAssignment_1");
					put(grammarAccess.getAutoCompleteAccess().getNameAssignment_4(), "rule__AutoComplete__NameAssignment_4");
					put(grammarAccess.getAutoCompleteAccess().getConfigurationSourceAssignment_6(), "rule__AutoComplete__ConfigurationSourceAssignment_6");
					put(grammarAccess.getAutoCompleteAccess().getExplanationsAssignment_7_2(), "rule__AutoComplete__ExplanationsAssignment_7_2");
					put(grammarAccess.getAutoCompleteAccess().getExplanationsAssignment_7_3_1(), "rule__AutoComplete__ExplanationsAssignment_7_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFmleroParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalFmleroParser) parser;
			typedParser.entryRuleFeatureModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FmleroGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FmleroGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
