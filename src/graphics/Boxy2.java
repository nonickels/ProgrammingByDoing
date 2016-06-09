package graphics;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Created by Nick on 6/9/16.
 */
public class Boxy2 extends Canvas
{
    public void paint( Graphics window )
    {
        //                  color    x    y
        drawBox( window, Color.RED, 100, 100 );

        // draw ten more boxes -- different colors, different places
        drawBox(window, Color.black, 100, 200);
        drawBox(window, Color.green, 100, 300);
        drawBox(window, Color.pink, 100, 400);
        drawBox(window, Color.magenta, 200, 100);
        drawBox(window, Color.orange, 200, 200);
        drawBox(window, Color.cyan, 200, 300);
        drawBox(window, Color.red, 300, 100);
        drawBox(window, Color.darkGray, 300, 200);
        drawBox(window, Color.blue, 300, 300);
        drawBox(window, Color.yellow, 300, 400);
    }

    public void drawBox( Graphics window, Color c, int x, int y )
    {
        // already finished; do not modify

        //this code draws a 100x100 box in color c at (x,y)
        window.setColor(c);
        window.fillRect(x,y,100,100);
        // this code "erases" the center of the box by painting over it in white
        window.setColor(Color.WHITE);
        window.fillRect(x+10,y+10,80,80);
    }


    public static void main( String[] args )
    {
        Canvas canvas = new Boxy2();
        JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas );
        win.setVisible(true);
    }
}
