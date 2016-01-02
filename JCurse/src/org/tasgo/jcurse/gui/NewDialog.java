package org.tasgo.jcurse.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.JTextField;

import org.omg.CORBA.VersionSpecHelper;
import org.tasgo.jcurse.api.Utility;
import org.tasgo.jcurse.api.minecraft.MinecraftVersionList;
import org.tasgo.jcurse.data.Profile;
import org.tasgo.jcurse.data.Profile.ProfileType;

import com.google.gson.JsonSyntaxException;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class NewDialog extends JDialog implements ActionListener {
	private JTextField modpackField;
	private JComboBox<String> versionBox;
	private ProfileType profileType;
	private JTextField nameField;
	
	/**
	 * Start the dialog and wait for it to return a new Profile.
	 * @return a new profile with the selected profileType and data
	 */
	public Profile get() {
		setModal(true);
		setVisible(true);
		String name = nameField.getText();
		if (profileType == ProfileType.VANILLA)
			return new Profile(name, profileType, (String) versionBox.getSelectedItem());
		else
			return new Profile(name, profileType, modpackField.getText());
	}

	/**
	 * Create the dialog.
	 */
	public NewDialog() {
		setBounds(100, 100, 396, 137);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setAlignmentX(Component.LEFT_ALIGNMENT);
		getContentPane().add(horizontalBox_2);
		
		JLabel lblName = new JLabel("Name:");
		horizontalBox_2.add(lblName);
		
		nameField = new JTextField();
		horizontalBox_2.add(nameField);
		nameField.setColumns(10);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		getContentPane().add(horizontalBox);
		
		JRadioButton rdVersion = new JRadioButton("Minecraft version:");
		rdVersion.addActionListener(this);
		horizontalBox.add(rdVersion);
		
		versionBox = new JComboBox<String>();
		populateMinecraftVersions();
		versionBox.setEnabled(false);
		versionBox.setMaximumSize(new Dimension(128, versionBox.getPreferredSize().height));
		horizontalBox.add(versionBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		getContentPane().add(horizontalBox_1);
		
		JRadioButton rdModpack = new JRadioButton("Modpack URL:");
		rdModpack.addActionListener(this);
		horizontalBox_1.add(rdModpack);
		
		modpackField = new JTextField();
		modpackField.setEnabled(false);
		modpackField.setMaximumSize(new Dimension(256, modpackField.getPreferredSize().height));
		horizontalBox_1.add(modpackField);
		modpackField.setColumns(10);
		
		ButtonGroup rdGroup = new ButtonGroup();
		rdGroup.add(rdVersion);
		rdGroup.add(rdModpack);
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(e -> {
			setVisible(false);
			dispose();
		});
		panel.add(btnOk);
	}
	
	private void populateMinecraftVersions() {
		for (MinecraftVersionList.Version ver : MinecraftVersionList.instance.versions)
			versionBox.addItem(ver.id);
	}
	
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "Minecraft version:":
				versionBox.setEnabled(true);
				modpackField.setEnabled(false);
				profileType = ProfileType.VANILLA;
				break;
			case "Modpack URL:":
				versionBox.setEnabled(false);
				modpackField.setEnabled(true);
				profileType = ProfileType.MODPACK;
				break;
		}
	}
}
