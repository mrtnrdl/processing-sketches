package de.mrtnrdl.sketches

import de.mrtnrdl.sketches.de.mrtnrdl.sketches.Bubbles
import processing.core.PApplet
import processing.core.PVector
import java.awt.event.MouseEvent

/**
 * Created by mrtnrdl on 2017-05-16.
 */

fun main(args: Array<String>) {
    FractalTree.run()
}

class FractalTree : PApplet() {

    // Factory implementation with companion object
    companion object Factory {

        /**
         * Runs the Processing-Application.
         */
        fun run(){
            var app:FractalTree = FractalTree()
            app.setSize(800,800)
            app.runSketch()
        }
    }

    /***
     * Variables
     */
    var startX: Float = 0.0f
    var startY: Float = 0.0f

    override fun setup() {
        background(255)
        frameRate(60f)
        stroke(0)

    }

    override fun draw() {

    }

    private fun drawLine(startX: Float, startY: Float, length: Int) {
        line(startX, startY, startX + length, startY + length)
    }

    override fun mouseClicked() {
        val startX = mouseX.toFloat()
        val startY = mouseY.toFloat()

        drawLine(startX, startY, 100)

    }


}

