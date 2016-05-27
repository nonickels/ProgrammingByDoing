package forLoops;
import java.util.Scanner;
/**
 * Created by Nick on 5/27/16.
 */
public class CountingMachineRevisited
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userNum1, userNum2, userNum3;

        System.out.println("I require three integers.");
        System.out.println("Please enter the first integer: ");
        userNum1 = keyboard.nextInt();

        System.out.println("Please enter the second integer: ");
        userNum2 = keyboard.nextInt();

        System.out.println("Please enter the third integer: ");
        userNum3 = keyboard.nextInt();

        for(int x = userNum1; x <= userNum2; x += userNum3)
        {
            System.out.println( x + " ");
        }
    }
}
