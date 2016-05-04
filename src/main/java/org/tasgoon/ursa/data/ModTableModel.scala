package org.tasgoon.ursa.data

import javax.swing.table.AbstractTableModel

class ModTableModel extends AbstractTableModel {
    val titles = Array("Mod", "Version", "Link", "New Version?")

    override def getColumnName(pos: Int): String = titles(pos)

    override def getRowCount: Int = 5

    override def getColumnCount: Int = 4

    override def getValueAt(i: Int, i1: Int): Object = {
        return (i * i1).toString
    }
}