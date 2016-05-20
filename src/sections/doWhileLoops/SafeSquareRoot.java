package sections.doWhileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/19/16.
 */
public class SafeSquareRoot
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

            System.out.println("SQUARE ROOT!");
            System.out.print("Enter number: ");
            int userInput = keyboard.nextInt();

        while(userInput < 0)
        {
            System.out.println("You can't take the square root of a negative number");
            System.out.println("Try again");
            userInput = keyboard.nextInt();

        }

        System.out.println("The square root of " + userInput + " is " + Math.sqrt(userInput));
    }

}
