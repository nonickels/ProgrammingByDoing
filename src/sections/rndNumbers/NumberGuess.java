package sections.rndNumbers;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Nick on 5/16/16.
 */
public class NumberGuess
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int secretNum = 1 + r.nextInt(10);

        System.out.println("I'm thinking of a number from 1-10. Take a guess.");
        int guessedNum = keyboard.nextInt();

        if (guessedNum == secretNum) {
            System.out.println("Correct. The answer was indeed " + secretNum + ".");
        }
        else if (!(guessedNum == secretNum))
        {
            System.out.println("Wrong. The answer was actually " + secretNum + ".");
        }
    }
}

