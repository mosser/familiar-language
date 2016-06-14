/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2015  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://featureide.cs.ovgu.de/ for further information.
 */
package de.ovgu.featureide.fm.ui.editors.featuremodel.actions.calculations;

import static de.ovgu.featureide.fm.core.localization.StringTable.CALCULATE_CONSTRAINT_ERRORS;

import org.eclipse.gef.ui.parts.GraphicalViewerImpl;
import org.eclipse.jface.action.Action;

import de.ovgu.featureide.fm.core.FeatureModel;

/**
 * 
 * @author Jens Meinicke
 */
public class ConstrainsCalculationsAction extends Action {

	private final FeatureModel featureModel;

	public ConstrainsCalculationsAction(GraphicalViewerImpl viewer, FeatureModel featureModel) {
		super(CALCULATE_CONSTRAINT_ERRORS);
		this.featureModel = featureModel;
		setChecked(featureModel.getAnalyser().calculateConstraints);
	}

	@Override
	public void run() {
		if (featureModel.getAnalyser().calculateConstraints) {
			featureModel.getAnalyser().calculateConstraints = false;
			featureModel.getAnalyser().calculateRedundantConstraints = false;
			featureModel.getAnalyser().calculateTautologyConstraints = false;
		} else {
			featureModel.getAnalyser().calculateConstraints = true;
			featureModel.getAnalyser().calculateFeatures = true;
		}
		featureModel.handleModelDataChanged();
	}

}