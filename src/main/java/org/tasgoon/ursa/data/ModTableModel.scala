package org.tasgoon.ursa.data

import javax.swing.table.AbstractTableModel

class ModTableModel extends AbstractTableModel {
    private var i = 0

    override def getRowCount: Int = 5

    override def getColumnCount: Int = 5

    override def getValueAt(i: Int, i1: Int): String = {
        this.i += 1
        return i.toString
    }
}