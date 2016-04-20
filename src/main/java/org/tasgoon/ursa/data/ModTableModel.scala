package org.tasgoon.ursa.data

import javax.swing.table.AbstractTableModel

class ModTableModel extends AbstractTableModel {
    val titles = Array("Mod", "Link", "Version")

    override def getColumnName(pos: Int): String = titles[pos]

    override def getRowCount: Int = 3

    override def getColumnCount: Int = 5

    override def getValueAt(i: Int, i1: Int): String = {
        return (i * i1).toString
    }
}