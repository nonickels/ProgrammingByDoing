package sections.ifStatements;
import java.util.Scanner;

/**
 * Created by Nick on 4/23/16.
 */
public class HowOldAreYou2
{
    public static void main ( String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Hey, what's your name? (Sorry I keep forgetting.) ");
        name = keyboard.next();

        System.out.print("Ok, " + name + ", how old are you? ");
        age = keyboard.nextInt();

        System.out.println();

        if (age < 16)
        {
            System.out.println("You can't drive, " + name + ". ");
        }
        else if (age < 18)
        {
            System.out.println("You can drive but not vote, " + name + ". ");
        }
        else if (age < 25)
        {
            System.out.println("You can vote but not rent a car, " + name + ". ");
        }
        else
        {
            System.out.println("You can pretty much do anything, " + name + ". ");
        }

    }
}
