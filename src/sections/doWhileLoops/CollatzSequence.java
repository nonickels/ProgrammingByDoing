package sections.doWhileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/21/16.
 */
public class CollatzSequence
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int userNum;
        int stepCounter = 0;
        int largestValue = 0;

        System.out.print("Starting Number: ");
        userNum = keyboard.nextInt();

        while(userNum != 1 ) // Runs while loop until the condition that userNum does not equal 1 is met
        {
            System.out.print(userNum + "\t"); // Prints userNum each loop with a tab after

            if (userNum % 2 == 0) // If statement testing the even condition
            {
                userNum = userNum / 2;
                stepCounter++;

            }
            else // else statement testing the odd condition
            {
                userNum = (userNum * 3) + 1;
                stepCounter++;
            }
            if (stepCounter % 6 == 0) // Places 6 numbers on each line
            {
                System.out.println();
            }
            if (userNum > largestValue)
            {
                largestValue = userNum;
            }
        }

        System.out.println();
        System.out.println("Terminated after " + stepCounter + " steps." + " The largest value was " + largestValue + ".");

    }
}
