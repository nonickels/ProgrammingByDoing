package graphics;

import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * Created by Nick on 6/9/16.
 */
public class MotivationalPoster extends Component
{
    Image motivationalPicture;

    public void paint(Graphics g)
    {
        g.drawImage(motivationalPicture, 256, 96, this);

        g.setColor(Color.white);
        Font timesBold40 = new Font("Times New Roman", Font.BOLD, 150);
        g.setFont(timesBold40);
        g.drawString("ex•lax", 256, 625);
        g.setColor(Color.white);
        Font centuryGothic30 = new Font("Century Gothic", Font.ITALIC,30);
        g.setFont(centuryGothic30);
        g.drawString("Just poo it.", 270, 665);
    }
    public MotivationalPoster() throws Exception
    {
        motivationalPicture = ImageIO.read(new File("images/exlax2.jpg"));

    }
    public static void main(String[] args) throws Exception
    {
        JFrame win = new JFrame("Motivational Poster");
        win.setSize(1024,768);
        win.setBackground(Color.BLACK);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new MotivationalPoster() );
        win.setVisible(true);

    }


}
