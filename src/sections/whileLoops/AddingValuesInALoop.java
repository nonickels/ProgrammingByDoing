package sections.whileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/18/16.
 */
public class AddingValuesInALoop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int numInput;
        int numInputTotal = 0;

        System.out.println("I will add up the numbers you input.");
        System.out.print("Number: ");
        numInput = keyboard.nextInt();
        numInputTotal += numInput;
        System.out.println("The total so far is " + numInputTotal);

        while (!(numInput == 0))
        {
            System.out.print("Number: ");
            numInput = keyboard.nextInt();
            numInputTotal += numInput;
            if (!(numInput == 0))
                System.out.println("The total so far is " + numInputTotal);
            else
                System.out.println();
        }

        System.out.println("The total is " + numInputTotal);

    }
}
