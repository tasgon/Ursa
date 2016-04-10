package org.tasgo.jcurse;

import org.tasgo.jcurse.gui.MainForm;

import java.awt.EventQueue;

public class Main {
	public static final Main main = new Main();
	
	/**
	 * Launch the application.
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//MainWindow frame = new MainWindow();
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
