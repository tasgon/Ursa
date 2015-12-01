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
import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class MainWindow {

	private JFrame frmJcurse;
	private JTable modTable;

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
		
		modTable = new JTable();
		modTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(modTable);
		
		Box horizontalBox = Box.createHorizontalBox();
		splitPane.setRightComponent(horizontalBox);
		
		Box verticalBox = Box.createVerticalBox();
		horizontalBox.add(verticalBox);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Test1", "Test2", "Test3", "Test4", "Test5"}));
		comboBox.setMaximumSize(new Dimension(32767, comboBox.getPreferredSize().height));
		verticalBox.add(comboBox);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JButton btnNewProfile = new JButton("New");
		horizontalBox_2.add(btnNewProfile);
		
		JButton btnEditProfile = new JButton("Edit");
		horizontalBox_2.add(btnEditProfile);
		
		JButton btnDelProfile = new JButton("Delete");
		horizontalBox_2.add(btnDelProfile);
		
		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_1);
		
		JTextPane infoPane = new JTextPane();
		infoPane.setContentType("text/html");
		infoPane.setText("<html><center>\r\n<b>Minecraft</b><br>\r\n143 Mods\r\n</center></html>\r\n");
		infoPane.setEditable(false);
		verticalBox_1.add(infoPane);
		
		JButton btnStart = new JButton("Start Game");
		btnStart.setAlignmentX(0.5f);
		verticalBox_1.add(btnStart);
		
		JPanel panel = new JPanel();
		horizontalBox.add(panel);
		
		JButton btnAddMod = new JButton("+");
		panel.add(btnAddMod);
		btnAddMod.setToolTipText("Add mod");
		
		JButton btnDelMod = new JButton("-");
		panel.add(btnDelMod);
		btnDelMod.setToolTipText("Remove mod");
	}

}
