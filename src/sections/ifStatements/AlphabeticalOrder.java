package sections.ifStatements;
import java.util.Scanner;
/**
 * Created by Nick on 5/6/16.
 */
public class AlphabeticalOrder
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your last name?");
        String lastName = keyboard.next();

        if ( "carswell".compareTo(lastName) >= 0 ) {
            System.out.println("You don't have to wait long " + lastName + ".");
        }
        else if ( "jones".compareTo(lastName) >= 0 ) {
            System.out.println("That's not bad " + lastName + ".");
        }

        else if ( "smith".compareTo(lastName) >= 0 ) {
            System.out.println("Looks like a bit of a wait " + lastName + ".");
        }

        else if ( "young".compareTo(lastName) >= 0 ) {
            System.out.println("It's gonna be a while " + lastName + ".");
        }

        else if ( "zzzzz".compareTo(lastName) > 0 ) {
            System.out.println("Not going anywhere for a while, " + lastName + "?");
        }
        else {
            System.out.println("What are you?");
        }
    }
}