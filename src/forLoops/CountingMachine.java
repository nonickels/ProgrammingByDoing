package forLoops;
import java.util.Scanner;
/**
 * Created by Nick on 5/27/16.
 */
public class CountingMachine
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input a number: ");
        int userNum = keyboard.nextInt();

        for(int x = 0; x <= userNum; x = x+1)
        {
            System.out.print(x + " ");
        }
    }
}
