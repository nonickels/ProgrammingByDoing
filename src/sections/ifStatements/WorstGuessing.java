package sections.ifStatements;
import java.util.Scanner;

/**
 * Created by Nick on 5/16/16.
 */
public class WorstGuessing
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNum = 4;

        System.out.println("This is the worst guessing game.");
        System.out.println();

        System.out.println("I'm thinking of a number from 1-10. Take a guess.");
        int guessedNum = keyboard.nextInt();

        if (guessedNum == 4) {
            System.out.println("Correct. The answer was indeed " + secretNum + ".");
        }
        else if (!(guessedNum == 4))
        {
            System.out.println("Wrong. The answer was actually " + secretNum + ".");
        }
    }
}
