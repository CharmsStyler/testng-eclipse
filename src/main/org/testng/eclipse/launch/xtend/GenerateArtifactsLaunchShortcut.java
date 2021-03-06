/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.testng.eclipse.launch.xtend;

import static  org.testng.eclipse.launch.xtend.WorkflowLaunchUtils.*;

import org.eclipse.core.resources.IResource;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

/**
 * @author Peter Friese - Initial contribution and API
 */
public class GenerateArtifactsLaunchShortcut {

	public void launch(ISelection selection, String mode) {
		IResource workflowFile = workflowFileFor(selection);
		if (workflowFile != null) {
			runWorkflow(workflowFile, mode);
		}
	}

	public void launch(IEditorPart editor, String mode) {
		IResource workflowFile = workflowFileFor(editor);
		if (workflowFile != null) {
			runWorkflow(workflowFile, mode);
		}
	}

}
