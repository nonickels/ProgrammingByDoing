package forLoops;
import java.util.Scanner;
/**
 * Created by Nick on 5/27/16.
 */
public class AddingValuesForLoop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int sumOfX = 0;

        System.out.println("Please enter an integer: ");
        int userNum = keyboard.nextInt();

        for(int x = 1; x <= userNum; x += 1)
        {
            System.out.print(x + " ");
            sumOfX += x;
        }

        System.out.println();
        System.out.println("The sum is " + sumOfX);
    }
}
