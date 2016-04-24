package sections.guis;
import java.util.Scanner;

/**
 * Created by Nick on 4/24/16.
 */
public class TwoMoreQuestions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("TWO MORE QUESTIONS, PAL");
        System.out.println();
        System.out.println("Think of animal and i'll try and guess it.");
        System.out.println();

        System.out.println("Q1) Does your animal fly, run, or swim?");
        String answer1 = keyboard.next().toLowerCase();
        System.out.println("Q2) Is your animal big or small?");
        String answer2 = keyboard.next().toLowerCase();

        System.out.println();

        if (answer1 .equals("fly") && answer2 .equals("big"))
        {
            System.out.println("Oh, easy. You are thinking of the Vultur gryphus, a.k.a, the Andean Condor.");
        }
        if (answer1 .equals("fly") && !(answer2 .equals("big")))
        {
            System.out.println("I betcha you were thinking of the Mellisuga helenae, a.k.a, the Bee Hummingbird");
        }
        if (answer1 .equals("run") && answer2 .equals("big"))
        {
            System.out.println("Ah yes yes, you must have been pondering the Welickmai Kuntae, a.k.a the Elephant");
        }
        if (answer1 .equals("run") && !(answer2 .equals("big")))
        {
            System.out.println("aww puppy");
        }
        if (answer1. equals("swim") && (answer2 .equals("big")))
        {
            System.out.println("Blue Whale, that thing is so big, check me out on MySpace");
        }
        if (answer1. equals("swim") && !(answer2. equals("big")))
        {
            System.out.println("Nemo,from Finding Nemo. Final Answer.");
        }
    }
}
