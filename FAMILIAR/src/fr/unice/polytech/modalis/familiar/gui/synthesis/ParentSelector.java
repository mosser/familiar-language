package fr.unice.polytech.modalis.familiar.gui.synthesis;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class ParentSelector extends JPanel {
	
	private FMSynthesisEnvironment environment;
	
	private JTree tree;
	private DefaultTreeModel model;
	private DefaultMutableTreeNode root;
	
	private JPopupMenu parentPopupMenu;
	private JPopupMenu featurePopupMenu;
	private String lastSelectedParent;
	private String lastSelectedFeature;
	
	private Set<String> expandedFeatures;
	
	public ParentSelector(FMSynthesisEnvironment environment) {
		this.environment = environment;
		
		// Create explorer view
		root = new DefaultMutableTreeNode();
		model = new DefaultTreeModel(root);
		tree = new JTree(model);
		tree.setRootVisible(false);
		
		// Set layout and add explorer view
		this.setLayout(new BorderLayout());
		this.add(new JLabel("Parent selector"), BorderLayout.NORTH);
		this.add(new JScrollPane(tree), BorderLayout.CENTER);
		
		// Create parent popup menu
		parentPopupMenu = new JPopupMenu();
		JMenuItem selectParentItem = new JMenuItem("Select this parent");
		
		selectParentItem.addActionListener(new SelectParentActionListener());
		parentPopupMenu.add(selectParentItem);
		
		JMenuItem ignoreParentItem = new JMenuItem("Ignore this parent");
		ignoreParentItem.addActionListener(new IgnoreParentActionListener());
		parentPopupMenu.add(ignoreParentItem);
		
		// Create feature popup menu
		featurePopupMenu = new JPopupMenu();
		JMenuItem selectAsRootItem = new JMenuItem("Select as root");
		selectAsRootItem.addActionListener(new SelectAsRootActionListener());
		featurePopupMenu.add(selectAsRootItem);
		
		// Inform selected features
		tree.addTreeSelectionListener(new SelectedFeaturesListener(environment));
		
		// Show popup menu		
		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)) {
 
					int row = tree.getRowForLocation(e.getX(), e.getY());
					TreePath path = tree.getPathForRow(row);
					tree.setSelectionRow(row);
					if (path != null) {
						if (path.getPathCount() == 2) {
							lastSelectedFeature = path.getPathComponent(1).toString();
							featurePopupMenu.show(tree, e.getX(), e.getY());
						} else if (path.getPathCount() == 3) {
							lastSelectedFeature = path.getPathComponent(1).toString();
							lastSelectedParent = path.getPathComponent(2).toString();
							parentPopupMenu.show(tree, e.getX(), e.getY());		
						}
					}
					
				}
			}
		});
		
		// Update list of expanded features
		expandedFeatures = new HashSet<String>();
		tree.addTreeExpansionListener(new TreeExpansionListener() {
			
			@Override
			public void treeExpanded(TreeExpansionEvent event) {
				String feature = event.getPath().getLastPathComponent().toString();
				expandedFeatures.add(feature);
			}
			
			@Override
			public void treeCollapsed(TreeExpansionEvent event) {
				String feature = event.getPath().getLastPathComponent().toString();
				expandedFeatures.remove(feature);
			}
		});
		
	}

	public void updateParents(List<KeyValue<String, List<String>>> list) {
		List<TreePath> pathsToExpand = new ArrayList<TreePath>();
		root.removeAllChildren();

		for (KeyValue<String, List<String>> entry : list) {
			DefaultMutableTreeNode feature = new DefaultMutableTreeNode(entry.getKey());
			root.add(feature);
			for (String parent : entry.getValue()) {
				feature.add(new DefaultMutableTreeNode(parent));
			}
			
			if (expandedFeatures.contains(entry.getKey())) {
				pathsToExpand.add(new TreePath(feature.getPath()));
			}
		}
		
		model.reload();

		// Keep features expanded
		for (TreePath path : pathsToExpand) {
			tree.expandPath(path);	
		}
	}

	private class SelectParentActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			environment.selectParent(lastSelectedFeature, lastSelectedParent);
		}
	}
	
	private class IgnoreParentActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			environment.ignoreParent(lastSelectedFeature, lastSelectedParent);
		}
		
	}
	
	private class SelectAsRootActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			environment.setRoot(lastSelectedFeature);
		}
		
	}

}
