package graphics;

import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;
/**
 * Created by Nick on 6/9/16.
 */
public class Sierpinski extends Canvas
{
    public static void main(String[] args)
    {
        JFrame win = new JFrame();
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Sierpinski canvas = new Sierpinski();
        win.add(canvas);
        win.setVisible(true);
    }

    public void paint(Graphics g)
    {
        Random r = new Random();

        int x1 = 512;
        int y1 = 109;
        int x2 = 146;
        int y2 = 654;
        int x3 = 876;
        int y3 = 654;

        int x = 512;
        int y = 382;

        for(int i = 0; i <= 50000; i++)
        {
            g.drawLine(x,y,x,y);
            int randomNumber = 1 + r.nextInt(3);
            int dx = 0;
            int dy = 0;

            if(randomNumber == 1)
            {
                dx = x - x1;
                dy = y - y1;
            }
            else if(randomNumber == 2)
            {
                dx = x - x2;
                dy = y - y2;
            }
            else if(randomNumber == 3)
            {
                dx = x - x3;
                dy = y - y3;
            }

            x = x - dx/2;
            y = y - dy/2;
        }
        g.drawString("Sierpinski Triangle", 462, 484);
    }
}
