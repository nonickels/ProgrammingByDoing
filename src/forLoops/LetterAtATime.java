package forLoops;
import java.util.Scanner;
/**
 * Created by Nick on 5/27/16.
 */
public class LetterAtATime
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = kb.nextLine();

        System.out.println("\nYour message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastpos = message.length() - 1;
        System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
        System.out.println("\nHere are all the characters, one at a time:\n");

        for ( int i=0; i<message.length(); i++ )
        {
            System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
        }

        int a_count = 0;
        int e_count = 0;
        int i_count = 0;
        int o_count = 0;
        int u_count = 0;



        for ( int i=0; i<message.length(); i++ )
        {
            char letter = message.charAt(i);
            if ( letter == 'a' || letter == 'A' )
            {
                a_count++;
                e_count++;
                i_count++;
                o_count++;
                u_count++;
            }
        }

        System.out.println("\nYour message contains " + " the letter 'a' " + a_count + " times." +
                " the letter 'e' " + e_count + " times." + " the letter 'i' " + i_count + " times."
                        +" the letter 'o' " + o_count + " times." +
                        " the letter 'u' " + u_count + " times." + " Isn't that interesting?");

    }
}
// (1) An out of bounds exception happens
// (2) The length is 3 and 'x' is located at position 2
// (3) The length is 1 more than the last character position so the for loop will go until the .length and then stop
// (4) √ (vowels)
