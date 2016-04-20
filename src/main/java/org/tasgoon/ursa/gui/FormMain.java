package org.tasgoon.ursa.gui;

import org.tasgoon.ursa.data.ModTableModel;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tasgoon on 4/10/16.
 */
public class FormMain extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JTable modTable;
    private JTextPane infoPanel;
    private JComboBox profileBox;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton playButton;
    private JSplitPane splitter;

    public FormMain() throws HeadlessException {
        super("Ursa");
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        splitter.setDividerLocation(0.7);
        splitter.setResizeWeight(1.0);

        modTable.setModel(new ModTableModel());

        addButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object src = actionEvent.getSource();
        if (src == addButton) {
            new DialogNew(this).setVisible(true);
        }
    }
}
