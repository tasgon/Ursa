package org.tasgoon.ursa

import org.tasgoon.ursa.gui.FormMain
import java.awt.EventQueue

object Main {
    def main(args: Array[String]) {
        EventQueue.invokeLater(new Runnable() {
            def run {
                try {
                    val frame = new FormMain
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
