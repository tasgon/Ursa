package org.tasgo.jcurse.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTable;

import org.tasgo.jcurse.data.ModTableModel;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JScrollPane modPane;
	private JTable modTable;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setTitle("JCurse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.resetToPreferredSizes();
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(splitPane);
		
		modPane = new JScrollPane();
		splitPane.setLeftComponent(modPane);
		
		modTable = new JTable();
		modTable.setModel(new ModTableModel());
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
		
		JButton btnDelete = new JButton("Delete");
		horizontalBox_1.add(btnDelete);
		
		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_1);
		
		JTextPane infoPane = new JTextPane();
		infoPane.setBackground(Color.WHITE);
		infoPane.setContentType("text/html");
		infoPane.setEditable(false);
		verticalBox_1.add(infoPane);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2);
		
		JComboBox comboBox = new JComboBox();
		horizontalBox_2.add(comboBox);
		
		JButton btnStart = new JButton("Start");
		horizontalBox_2.add(btnStart);
		btnStart.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel panel = new JPanel();
		horizontalBox.add(panel);
		
		Box verticalBox_2 = Box.createVerticalBox();
		panel.add(verticalBox_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_3);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setToolTipText("Add mod.");
		horizontalBox_3.add(btnAdd);
		
		JButton btnDel = new JButton("-");
		btnDel.setToolTipText("Remove selected mod.");
		horizontalBox_3.add(btnDel);
		
		JButton button = new JButton("\u0394");
		button.setToolTipText("Edit selected mod.");
		button.setAlignmentY(Component.TOP_ALIGNMENT);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_2.add(button);
		splitPane.setDividerLocation(325);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JLabel lblDonate = new JLabel("Donate!");
		lblDonate.setForeground(Color.BLUE);
		lblDonate.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblDonate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Desktop.getDesktop().browse(new URI("http://tasgo.wordpress.com/donate"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		panel_1.add(lblDonate);
		
	}

}
