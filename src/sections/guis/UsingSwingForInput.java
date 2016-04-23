package sections.guis;
import javax.swing.*;

/**
 * Created by Nick on 4/23/16.
 */
public class UsingSwingForInput
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog( "What is your name?" );
        String input = JOptionPane.showInputDialog( "How old are you?");
        int age = Integer.parseInt(input);

        System.out.println("Hello, " + name + ".");
        System.out.println("Next year, you'll be " + (age + 1) );

        System.exit(0);
    }
}
