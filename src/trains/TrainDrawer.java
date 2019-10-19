package trains;

import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;

import static trains.TrainCar.CAR_WIDTH;
import static trains.TrainCar.CONNECTOR;


/*
 * File: TrainDrawer.java
 * --------------------
 * This program draws a three-car train consisting on an engine,
 * a boxcar, and a caboose.  This implementation of the program,
 * however, is incomplete, and contains only the methods given
 * in the text.
 */

public class TrainDrawer {



    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
    private CanvasWindow canvas;


    public static void main(String[] args) {
        TrainDrawer drawer = new TrainDrawer();
    }

    public TrainDrawer(){
        //Create a window and canvas to draw on
        canvas = new CanvasWindow("Train", 800, 500);

        double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
        double x = (canvas.getWidth() - trainWidth) / 2;
        double y = canvas.getHeight();
        double dx = CAR_WIDTH + CONNECTOR;

        Engine one = new Engine (0, Engine.getCarHeight(), Color.BLACK);
        canvas.add(one, x, y);

        Boxcar two = new Boxcar (0, Boxcar.getCarHeight(), Color.GREEN);
        canvas.add(two, x + dx, y);

        Caboose three = new Caboose (0, Caboose.getCarHeight(), Color.RED);
        canvas.add(three, x + 2 * dx, y);


        /*
        drawEngine(x, y);
        drawBoxcar(x + dx, y, Color.GREEN);
        drawCaboose(x + 2 * dx, y);
        */
    }

}