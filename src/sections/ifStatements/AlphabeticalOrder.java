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

        if ( lastName.compareTo("Carswell") <= lastName.compareTo("Jones") ) {
            System.out.println("You don't have to wait long " + lastName + ".");
        }
        else if ( lastName.compareTo("Jones") > lastName.compareTo("Carswell")) {
            System.out.println("That's not bad " + lastName + ".");
        }

        else if ( lastName.compareTo("Smith") > lastName.compareTo("Jones") ) {
            System.out.println("Looks like a bit of a wait " + lastName + ".");
        }

        else if ( lastName.compareTo("Young") >= lastName.compareTo("Smith") ) {
            System.out.println("It's gonna be a while " + lastName + ".");
        }

        else if ( lastName.compareTo("Young") <= lastName.compareTo("ZZZZZ") ) {
            System.out.println("Not going anywhere for a while, " + lastName + "?");
        }
        else {
            System.out.println("What are you?");
        }
    }
}