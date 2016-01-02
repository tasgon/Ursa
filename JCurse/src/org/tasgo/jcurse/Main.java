package org.tasgo.jcurse;

import java.awt.EventQueue;

import org.tasgo.jcurse.api.minecraft.MinecraftVersionList;
import org.tasgo.jcurse.gui.MainWindow;

public class Main {
	public static final Main main = new Main();
	
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
	
	public Main() {
		
	}
}
