package org.tasgoon.jcurse.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tasgoon on 4/10/16.
 */
public class FormMain extends JFrame {
    private JPanel mainPanel;
    private JTable modTable;
    private JTextPane infoPanel;
    private JComboBox profileBox;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton playButton;

    public FormMain() throws HeadlessException {
        super("FormMain");
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
}
