package sections.doWhileLoops;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nick on 5/19/16.
 */
public class AgainWithTheNumberGuessing
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int secretNum = 1 + r.nextInt(10);
        int timesGuessed = 0;
        int guessedNum;

        System.out.println("I'm thinking of a number from 1-10. Take a guess.");
        System.out.print("Guess: ");

        do
        {
            System.out.println("Incorrect. Please try again.");
            System.out.print("Guess: " );
            guessedNum = keyboard.nextInt();
            timesGuessed++;
        }

        while (guessedNum != secretNum);

        System.out.println("Correct. The answer was indeed " + secretNum + ".");
        System.out.println("It only took you " + timesGuessed + " tries.");
    }
}
