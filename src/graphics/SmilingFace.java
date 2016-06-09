package graphics;
import java.awt.*;
import javax.swing.JFrame;
/**
 * Created by Nick on 6/8/16.
 */
public class SmilingFace extends Canvas
{
    public void paint(Graphics g)
    {
        // labels
        g.setColor(Color.black);
        g.setFont(new Font(null));
        for ( int X=0; X<800; X += 50 )
            g.drawString( String.valueOf(X), X, 50 );
        for ( int Y=100; Y<600; Y += 50 )
            g.drawString( String.valueOf(Y), 28, Y );
        // lines
        g.setColor(Color.lightGray);
        for ( int X=0; X<800; X += 50 )
            g.drawLine(X,0,X,599);    // horizontal
        for ( int Y=0; Y<600; Y += 50 )
            g.drawLine(0,Y,799,Y);    // vertical

        g.setColor(Color.yellow);
        g.fillOval(350,250,150,150);
        g.fillArc(385,300,20,20,180,180); // from 90 degrees to 270 (90+180)


        g.setColor(Color.black);
        g.fillOval(385,300,30,30);
        g.fillOval(435,300,30,30);
        g.fillArc(385,300,80,80,180,180); // from 90 degrees to 270 (90+180)

    }
    public static void main(String[] args)
    {
        JFrame win = new JFrame();
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmilingFace canvas = new SmilingFace();
        win.add(canvas);
        win.setVisible(true);
    }
}
