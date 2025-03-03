package minggu5;

import java.applet.Applet;
import java.awt.*;

public class DrawShapes extends Applet{

    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public void init() {
        // The Font is Arial size, 18 and italicized
        font = new Font("Arial", Font.ITALIC, 18);
        // some colors are predefined in the Color class
        redColor = Color.red;
        backgroundColor = Color.orange;
        // color can be created using red, green, blue values
        blueColor = new Color(0, 0, 122);
        // set background color off the Applet
        setBackground(backgroundColor);
    }

    public void stop() {
    }

    public void paint(Graphics graph) {
        // set font
        graph.setFont(font);
        // create a title
        graph.drawString("Draw Shapes", 90, 20);
        // set the color for the first shape
        graph.setColor(blueColor);
        // draw a rectangle using drawRect(int x, int y, int width, int height)
        graph.drawRect(120, 120, 120, 120);
        // this will fill a rectangle
        graph.fillRect(115, 115, 90, 90);
        // set the color for the next shape
        graph.setColor(redColor);
        // draw a circle using fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        graph.fillArc(110, 110, 50, 50, 0, 360);
        // set color for the next shape
        graph.setColor(Color.CYAN);
        // draw another rectangle 
        graph.drawRect(50, 50, 50, 50);
        // this will fill a rectangle
        graph.fillRect(50, 50, 60, 60);

    }

}
