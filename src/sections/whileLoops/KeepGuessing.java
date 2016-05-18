package sections.whileLoops;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Nick on 5/18/16.
 */
public class KeepGuessing
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int secretNum = 1 + r.nextInt(10);

        System.out.println("I'm thinking of a number from 1-10. Take a guess.");
        int guessedNum = keyboard.nextInt();

        while (!(guessedNum == secretNum))
        {

            System.out.println("Incorrect. Please try again.");
            System.out.print("Guess: " );
            guessedNum = keyboard.nextInt();
        }
        {
            System.out.println("Correct. The answer was indeed " + secretNum + ".");
        }
    }
}
