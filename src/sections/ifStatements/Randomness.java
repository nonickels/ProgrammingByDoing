package sections.ifStatements;
import java.util.Random;
/**
 * Created by Nick on 5/16/16.
 */
public class Randomness
    {
        public static void main ( String[] args )
        {
            Random r = new Random();

            int x = 1 + r.nextInt(10);

            System.out.println( "My random number is " + x );

            System.out.println( "Here are some numbers from 1 to 5!" ); // (1) Prints rnd numbers from 0-5 rather than 1-5.
            System.out.print( 3 + r.nextInt(5) + " " );                 // (2) Prints rnd numbers from 3-8 rather than 1-5.
            System.out.print( 3 + r.nextInt(5) + " " );                 // (3) With a seed, the printed random numbers are static.
            System.out.print( 3 + r.nextInt(5) + " " );                 // (4) With a different seed, 38249 for example, the rnd numbers change but only once.
            System.out.print( 3 + r.nextInt(5) + " " );                 // (5) Random seed deleted.
            System.out.print( 3 + r.nextInt(5) + " " );
            System.out.print( 3 + r.nextInt(5) + " " );
            System.out.println();

            System.out.println( "Here are some numbers from 1 to 100!" );
            System.out.print( 1 + r.nextInt(100) + "\t" );
            System.out.print( 1 + r.nextInt(100) + "\t" );
            System.out.print( 1 + r.nextInt(100) + "\t" );
            System.out.print( 1 + r.nextInt(100) + "\t" );
            System.out.print( 1 + r.nextInt(100) + "\t" );
            System.out.print( 1 + r.nextInt(100) + "\t" );
            System.out.println();

            int num1 = 1 + r.nextInt(10);
            int num2 = 1 + r.nextInt(10);

            if ( num1 == num2 )
            {
                System.out.println( "The random numbers were the same! Weird." );
            }
            if ( num1 != num2 )
            {
                System.out.println( "The random numbers were different! Not too surprising, actually." );
            }
        }
    }
