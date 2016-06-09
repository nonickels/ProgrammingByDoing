package graphics;

import java.awt.*;
import javax.swing.JFrame;
/**
 * Created by Nick on 6/9/16.
 */
public class Boxy3 extends Canvas
{
    public void paint( Graphics window )
    {
        //                  color       x    y   w   h
        drawBox( window, Color.YELLOW, 200, 300, 50, 30 );
        drawBox( window, Color.GREEN,  400, 220, 30, 150 );

        // draw six more boxes -- different colors, different places, different sizes
        drawBox( window, Color.RED,  100, 400, 70, 200 );
        drawBox( window, Color.BLACK,  200, 100, 88, 90 );
        drawBox( window, Color.BLUE,  300, 300, 200, 60 );
        drawBox( window, Color.ORANGE,  90, 100, 100, 100 );
        drawBox( window, Color.PINK,  20, 20, 80, 150 );
        drawBox( window, Color.DARK_GRAY,  400, 400, 200, 200 );

    }

    public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
    {
        // add code to draw a WxH box in color c at (x,y)
        window.setColor(c);
        window.fillRect(x,y,w,h);
        window.setColor(Color.WHITE);
        window.fillRect(x+10,y+10,w-20,h-20);
    }


    public static void main(String[] args)
    {
        Canvas canvas = new Boxy3();
        JFrame win = new JFrame();
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add(canvas);
        win.setVisible(true);

    }
}
