package graphics;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Created by Nick on 5/30/16.
 */
public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(50,200,100,200);  // draw a rectangle
        g.fillOval(10,20,100,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(50,200,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        g.setColor(Color.red);
        g.fillRect(1050,500,100,200); // draw a filled-in oval

        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 200, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}

// (1) The size of the window is 800 px wide and 600 px high
// (2) The 4 parameters of the drawRect function. From left to right: position rl, position tb, size width, size height
// (3) The 4 parameters of the fillOval function. From left to right: position rl, position tb, radius rl, radius tb
// (4) The 2 parameters of the drawString function. From left to right: position rl, postition tb
// (5) When the two objects overlap the rectangle is drawn on top of the oval
// (6) √