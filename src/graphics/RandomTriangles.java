package graphics;

import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;
/**
 * Created by Nick on 6/9/16.
 */
public class RandomTriangles extends Canvas
{
    public static void main(String[] args)
    {
        JFrame win = new JFrame();
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomTriangles canvas = new RandomTriangles();
        win.add(canvas);
        win.setVisible(true);
    }

    public void paint(Graphics g)
    {
        Random r = new Random();

        for(int x = 0; x <= 500; x++)
        {
            Polygon tri = new Polygon();
            tri.addPoint(r.nextInt(800), r.nextInt(800));
            tri.addPoint(r.nextInt(800), r.nextInt(800));
            tri.addPoint(r.nextInt(800), r.nextInt(800));
            Color myColor = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
            g.setColor(myColor);
            g.fillPolygon(tri);
        }
    }
}
