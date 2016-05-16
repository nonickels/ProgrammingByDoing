package sections.rndNumbers;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by Nick on 5/16/16.
 */
public class OneShotHiLo
{
    public static void main(String[] args) {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);

        int randomNumber = 1 + r.nextInt(100);

        System.out.println("I'm thinking of a number from 1-100. Take a guess.");
        System.out.print("• ");
        int userGuess = keyboard.nextInt();

        if (userGuess == randomNumber)
            System.out.println("Congratulations! You are correct.");
        else if (userGuess < randomNumber)
            System.out.println("Sorry too low. I was thinking of " + randomNumber);
        else if (userGuess > randomNumber)
            System.out.println("Sorry too high. I was thinking of " + randomNumber);
        else
            System.out.println("Error");

    }
}
