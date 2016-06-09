package graphics;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Created by Nick on 6/9/16.
 */
public class BoringTriangle extends Canvas
{
    public void paint(Graphics g)
    {
        Polygon tri = new Polygon();
        tri.addPoint(100, 100);
        tri.addPoint(100, 300);
        tri.addPoint(200, 300);
        Color myPurple = new Color(85,26,139);
        g.setColor(myPurple);
        g.fillPolygon(tri);
    }
    public static void main(String[] args)
    {
        JFrame win = new JFrame("Boring Triangle");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new BoringTriangle());
        win.setVisible(true);
    }
}
