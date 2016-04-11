package org.tasgoon.jcurse

import org.tasgoon.jcurse.gui.FormMain
import java.awt.EventQueue

object Main {
    def main(args: Array[String]) {
        EventQueue.invokeLater(new Runnable() {
            def run {
                try {
                    val frame: FormMain = new FormMain
                    frame.setVisible(true)
                }
                catch {
                    case e: Exception => {
                        e printStackTrace
                    }
                }
            }
        })
    }
}
