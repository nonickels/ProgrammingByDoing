package sections.rndNumbers;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by Nick on 5/16/16.
 */
public class ThreeCardMonte
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);

        int correctBall = 1 + r.nextInt(3);

        System.out.println("A street magician beckons you over.");
        System.out.println("The magician shows you 3 cups and a ball.");
        System.out.println("With a quick shuffle, the ball disappears.");
        System.out.println("After a few seconds, he asks you which cup the ball lies under.");

        System.out.println();

        System.out.println("Which cup contains the ball?");
        System.out.println("___  ___  ___");
        System.out.println("| |  | |  | |");
        System.out.println(" 1    2    3 ");

        System.out.println();

        System.out.print("» ");
        int userGuess = keyboard.nextInt();


        if (correctBall == 1)
        {
            System.out.println("–––  ___  ___");
            System.out.println("|•|  | |  | |");
            System.out.println(" 1    2    3 ");
        }

        else if (correctBall == 2)
        {
            System.out.println("___  –––  ___");
            System.out.println("| |  |•|  | |");
            System.out.println(" 1    2    3 ");
        }

        else if (correctBall == 3)
        {
            System.out.println("___  ___  –––");
            System.out.println("| |  | |  |•|");
            System.out.println(" 1    2    3 ");
        }

        if (userGuess == correctBall)
            System.out.println("Correct! the ball was in Cup " + correctBall);
        else
            System.out.println("Sorry, the ball was in Cup " + correctBall);
}
}
