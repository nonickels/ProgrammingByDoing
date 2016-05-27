package forLoops;
import java.util.Scanner;
/**
 * Created by Nick on 5/27/16.
 */
public class CountingFor
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 2 ; n <= 10 ; n = n+2 )
        {
            System.out.println( n + ". " + message );
        }
    }
}

// (1) The n = n+1 tells the for loop to increase n by 1 each loop. If you remove n = n+1, the for loop never ends
// (2) Int n = 1 initializes the start variable of the for loop. Without it, the for loop doesn't know where to begin so it doesn't run.
// (3) √ (changed the code so that the loop repeats ten times instead of five.)
// (4) √ (changed the for loop so that the message starts at 2 and counts by twos.)