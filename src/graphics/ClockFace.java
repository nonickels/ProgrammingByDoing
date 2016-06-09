package graphics;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Created by Nick on 6/8/16.
 */
public class ClockFace extends Canvas
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


        g.drawOval(200,100,250,250);

        g.setColor(Color.black);
        g.setFont(new Font("Calibri", Font.BOLD+Font.ITALIC, 20)); // 60-pt italic bold
        g.drawString("12", 315, 140);
        g.drawString("3", 425, 235);
        g.drawString("6", 320, 325);
        g.drawString("9", 225, 240);
        g.drawLine(325,225,250,225);
        g.drawLine(325,225,275,250);

    }
    public static void main(String[] args)
    {
        JFrame win = new JFrame();
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add(canvas);
        win.setVisible(true);
    }
}
