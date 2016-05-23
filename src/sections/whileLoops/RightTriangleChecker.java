package sections.whileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/20/16.
 */
public class RightTriangleChecker
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("RIGHT TRIANGLE CHECKER");
        System.out.println("Enter three integers: ");
        int side1,side2,side3;

        System.out.println("Side 1: ");
        side1 = keyboard.nextInt();

        System.out.println("Side 2: ");
        side2 = keyboard.nextInt();

        while(side1 > side2) //Prints error statement until user inputs int greater than side1
        {
            System.out.println("Side 2 smaller than Side 1. Try again. ");
            System.out.println("Side 2: ");
            side2 = keyboard.nextInt();
        }

        do
        {
            System.out.println("Side 3: "); // Prints side3 prompt
            side3 = keyboard.nextInt();

            while(side2 > side3) // Nested while loop that prints error statement until user inputs int greater than side2
            {
                System.out.println("Side 3 smaller than Side 2. Try again. ");
                System.out.println("Side 3: ");
                side3 = keyboard.nextInt();
            }
        }

        while(side2 > side3); // Exit constraint for the Do - While loop

        System.out.println("Your sides are " + side1 + side2 + side3 + ".");
        System.out.println("These sides DO make a right triangle!");




    }
}
