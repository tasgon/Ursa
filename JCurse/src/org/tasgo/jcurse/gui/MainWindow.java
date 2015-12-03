package org.tasgo.jcurse.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JScrollPane modPane;
	private JTable modTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.resetToPreferredSizes();
		contentPane.add(splitPane);
		
		modPane = new JScrollPane();
		splitPane.setLeftComponent(modPane);
		
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
		modPane.setViewportView(modTable);
		
		Box horizontalBox = Box.createHorizontalBox();
		splitPane.setRightComponent(horizontalBox);
		
		Box verticalBox = Box.createVerticalBox();
		horizontalBox.add(verticalBox);
		
		JComboBox profileBox = new JComboBox();
		profileBox.setMaximumSize(new Dimension(32767, profileBox.getPreferredSize().height));
		verticalBox.add(profileBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(e -> {
			System.out.println(new NewDialog().get().profileType);
		});
		horizontalBox_1.add(btnNew);
		
		JButton btnEdit = new JButton("Edit");
		horizontalBox_1.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		horizontalBox_1.add(btnDelete);
		
		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_1);
		
		JTextPane infoPane = new JTextPane();
		infoPane.setBackground(Color.WHITE);
		infoPane.setContentType("text/html");
		infoPane.setEditable(false);
		verticalBox_1.add(infoPane);
		
		JButton btnStart = new JButton("Start");
		btnStart.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_1.add(btnStart);
		
		JPanel panel = new JPanel();
		horizontalBox.add(panel);
		
		JButton btnAdd = new JButton("+");
		panel.add(btnAdd);
		
		JButton btnDel = new JButton("-");
		panel.add(btnDel);
		splitPane.setDividerLocation(325);
	}

}
