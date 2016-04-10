package org.tasgo.jcurse.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tasgo on 4/10/16.
 */
public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JTable modTable;
    private JTextPane infoPanel;
    private JComboBox profileBox;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton playButton;

    public MainForm() throws HeadlessException {
        super("MainForm");
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
}
