package graphics;
import java.awt.*;
import javax.swing.JFrame;

/**
 * Created by Nick on 6/8/16.
 */
public class Circle extends Canvas
{
    public void paint(Graphics g )
    {
        g.setColor(Color.green);

        g.fillOval(400,300,100,100);
    }
    public static void main(String[] args)
    {
        JFrame win = new JFrame("Green Circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle canvas = new Circle();
        win.add(canvas);
        win.setVisible(true);
    }
}
