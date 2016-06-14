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
package de.ovgu.featureide.fm.ui.editors.featuremodel.operations;

import static de.ovgu.featureide.fm.core.localization.StringTable.RENAME_FEATURE;
import de.ovgu.featureide.fm.core.FeatureModel;

/**
 * Operation with functionality to rename features. Provides undo/redo
 * functionality.
 * 
 * @author Fabian Benduhn
 */
public class FeatureRenamingOperation extends AbstractFeatureModelOperation {

	private static final String LABEL = RENAME_FEATURE;
	private String oldName;
	private String newName;

	public FeatureRenamingOperation(FeatureModel featureModel, String oldName, String newName) {
		super(featureModel, LABEL);
		this.oldName = oldName;
		this.newName = newName;
	}

	@Override
	protected void redo() {
		featureModel.getRenamingsManager().renameFeature(oldName, newName);
	}

	@Override
	protected void undo() {
		featureModel.getRenamingsManager().renameFeature(newName, oldName);
	}

}