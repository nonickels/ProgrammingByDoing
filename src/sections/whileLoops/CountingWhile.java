package sections.whileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/18/16.
 */
public class CountingWhile
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        int n = 10;
        while ( n < 110 )
        {
            System.out.println( (n) + ". " + message );
            n+= 10;
        }

    }
}
// (1) n++ adds 1 print to n. Removing it makes infinite loop
// (2) √
// (3) √