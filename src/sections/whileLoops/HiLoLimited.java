package sections.whileLoops;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Nick on 5/18/16.
 */
public class HiLoLimited
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int numGuesses = 0;
        int maxGuesses = 7;
        int remainingGuesses = maxGuesses - numGuesses;
        int userGuess;
        int secretNumber = 1 + r.nextInt(100);

        System.out.println("I'm thinking of a number from 1-100. Take a guess.");
        System.out.println("Guesses remaining: " + remainingGuesses);
        remainingGuesses--;
        System.out.print("Guess: ");
        userGuess = keyboard.nextInt();


        while (numGuesses < maxGuesses && !(userGuess == secretNumber) && remainingGuesses > 0) {
            System.out.println("That is incorrect. Please guess again.");
            System.out.println("Guesses remaining: " + remainingGuesses);
            numGuesses++;
            remainingGuesses--;
            System.out.print("Guess: ");
            userGuess = keyboard.nextInt();
        }
        if (userGuess == secretNumber)
            System.out.println("Correct! What are the odds?!?");
        else
            System.out.println("That is incorrect you are out of tries.");

    }
}
