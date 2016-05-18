package sections.whileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/16/16.
 */
public class EnterPin
{
        public static void main( String[] args )
        {
            Scanner keyboard = new Scanner(System.in);
            int pin = 12345;

            System.out.println("WELCOME TO THE BANK OF MITCHELL."); // (1) A while loop is similar to an if statement because it takes a condition
            System.out.print("ENTER YOUR PIN: ");                   // (2) A while loop is different from an if statement because it continues until the input allows it to exit
            int entry = keyboard.nextInt();                         // (3) There is no int in front of "entry = keyboard.nextInt();" b/c variable already defined.
                                                                    // (4) Data type 'entry' undefined
            while ( entry != pin )                                  // (5) Line replaced
            {
                System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                System.out.print("ENTER YOUR PIN: ");
                entry = keyboard.nextInt();
            }

            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        }
    }

