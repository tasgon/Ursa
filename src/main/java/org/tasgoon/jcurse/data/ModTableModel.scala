package org.tasgoon.jcurse.data

import javax.swing.table.AbstractTableModel

class ModTableModel extends AbstractTableModel {
    def getRowCount: Int = {
        return 0
    }

    def getColumnCount: Int = {
        return 0
    }

    def getValueAt(rowIndex: Int, columnIndex: Int): Any = {
        return null
    }
}