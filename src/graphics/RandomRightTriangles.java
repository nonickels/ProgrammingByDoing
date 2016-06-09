package graphics;

import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;
/**
 * Created by Nick on 6/9/16.
 */
public class RandomRightTriangles extends Canvas
{
    public static void main(String[] args)
    {
        JFrame win = new JFrame();
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomRightTriangles canvas = new RandomRightTriangles();
        win.add(canvas);
        win.setVisible(true);
    }

    public void paint(Graphics g)
    {
        Random r = new Random();

        for(int x = 0; x <= 500; x++)
        {
            int horizontal = r.nextInt(800);
            int vertical = r.nextInt(800);
            Polygon tri = new Polygon();
            tri.addPoint(horizontal, vertical);
            tri.addPoint(horizontal, vertical + 50);
            tri.addPoint(horizontal + 50, vertical + 50);

            Color myColor = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
            g.setColor(myColor);
            g.fillPolygon(tri);
        }
    }
}
