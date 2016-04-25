package sections.ifStatements;
import java.util.Scanner;

/**
 * Created by Nick on 4/23/16.
 */
public class TwentyQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and i'll try to guess it");
        System.out.println();

        System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
        String answer1 = keyboard.next().toLowerCase();

        System.out.println("Question 2) Is it bigger than a breadbox?");
        String answer2 = keyboard.next().toLowerCase();

        if (answer1 .equals("animal"))
        {
            if (answer2 .equals("yes"))
            {
                System.out.println("My guess is that you are thinking of a moose.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            }
            else
            {
                System.out.println("My guess is that you are thinking of a squirrel.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            }

        } else if (answer1 .equals("vegetable"))
        {
            if (answer2 .equals("yes"))
            {
                System.out.println("My guess is that you are thinking of a watermelon.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            }
            else
            {
                System.out.println("My guess is that you are thinking of a carrot.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            }

        } else if (answer1 .equals("mineral"))
        {
            if (answer2 .equals("yes"))
            {
                System.out.println("My guess is that you are thinking of a Camaro.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            }
            else
            {
                System.out.println("My guess is that you are thinking of a paper clip.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            }

        }
    }
}


