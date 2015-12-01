package org.tasgo.jcurse.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

public class NewDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField modpackLink;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NewDialog dialog = new NewDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NewDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		{
			JComboBox versionBox = new JComboBox();
			versionBox.setModel(new DefaultComboBoxModel(new String[] {"Choose version..."}));
			versionBox.setMaximumSize(new Dimension(32767, versionBox.getPreferredSize().height));
			contentPanel.add(versionBox);
		}
		{
			modpackLink = new JTextField();
			contentPanel.add(modpackLink);
			modpackLink.setColumns(1);
			modpackLink.setMaximumSize(new Dimension(32767, modpackLink.getPreferredSize().height));
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
