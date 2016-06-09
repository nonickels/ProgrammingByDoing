package graphics;

import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;
/**
 * Created by Nick on 6/9/16.
 */
public class SmilingFaceFunction extends Canvas
{
    public void paint( Graphics g )
    {
        drawSmilingFace(g,100,100);
        drawSmilingFace(g,400,350);
        // etc
        drawSmilingFace(g,0,0);

        for(int i = 0; i <= 80; i++)
        {
            Random r = new Random();
            drawSmilingFace(g,r.nextInt(768),r.nextInt(1024));
        }
    }

    public void drawSmilingFace( Graphics g, int x, int y )
    {
        // Draws a smiling face on the screen, where the point (x,y) is
        //  the upper-left corner of a box containing the face.
        g.setColor(Color.BLACK);
        g.drawRect(x - 10,y - 10,120,120);

        // draw circle for the head
        g.setColor(Color.YELLOW);
        g.fillOval(x,y,100,100);
        // draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(x + 25, y + 25, 10, 10);
        g.fillOval(x + 65, y + 25, 10, 10);
        // draw mouth
        g.drawArc(x + 25, y + 30, 50, 50, 180, 180);
    }

    public static void main(String[] args)
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Smiling Face Function");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new SmilingFaceFunction() );
        win.setVisible(true);
    }

}

