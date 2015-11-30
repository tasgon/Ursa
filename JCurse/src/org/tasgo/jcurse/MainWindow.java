package org.tasgo.jcurse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class MainWindow {

	private JFrame frmJcurse;
	private JTable table;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmJcurse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJcurse = new JFrame();
		frmJcurse.setTitle("JCurse");
		frmJcurse.setBounds(100, 100, 869, 551);
		frmJcurse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJcurse.getContentPane().setLayout(new BoxLayout(frmJcurse.getContentPane(), BoxLayout.Y_AXIS));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frmJcurse.getContentPane().add(splitPane);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		Box horizontalBox = Box.createHorizontalBox();
		splitPane.setRightComponent(horizontalBox);
		
		Box verticalBox = Box.createVerticalBox();
		horizontalBox.add(verticalBox);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		JComboBox comboBox = new JComboBox();
		verticalBox.add(comboBox);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JButton btnNew = new JButton("New Profile");
		horizontalBox_2.add(btnNew);
		
		JButton btnEdit = new JButton("Edit Profile");
		horizontalBox_2.add(btnEdit);
		
		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_1);
		
		JTextPane infoPane = new JTextPane();
		infoPane.setBackground(UIManager.getColor("Button.background"));
		infoPane.setEditable(false);
		verticalBox_1.add(infoPane);
		
		JButton btnStart = new JButton("Start Game");
		btnStart.setAlignmentX(0.5f);
		verticalBox_1.add(btnStart);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setAction(action);
		horizontalBox.add(btnAdd);
		btnAdd.setToolTipText("Add mod");
		
		JButton btnDel = new JButton("-");
		horizontalBox.add(btnDel);
		btnDel.setToolTipText("Remove mod");
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
