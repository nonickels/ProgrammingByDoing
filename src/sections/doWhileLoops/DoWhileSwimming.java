package sections.doWhileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/18/16.
 */
public class DoWhileSwimming
{
    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS ";

        double minimumTemperature = 79.0; // degrees Fahrenheit
        double currentTemperature;
        double savedTemperature;
        int swimTime;

        System.out.print("What is the current water temperature? ");
        currentTemperature = keyboard.nextDouble();
        savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer1 + " approaches the lake...." );

        swimTime = 0;
        while ( currentTemperature >= minimumTemperature )
        {
            System.out.print( "\t" + swimmer1 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600); // pauses for 600 milliseconds
            currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
        }

        System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

        currentTemperature = savedTemperature; // restores original water temperature

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer2 + " approaches the lake...." );

        swimTime = 0;
        do
        {
            System.out.print( "\t" + swimmer2 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600);
            currentTemperature -= 0.5;
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

        } while ( currentTemperature >= minimumTemperature );

        System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
    }
}

// (1) Both Gallant and Goofus swim for 4min at 80.5 degrees
// (2) At 78 degrees, Gallant swims for 0min and Goofus swims for 1min
// (3) Gallant checks the temperature of the water before jumping in
// (4) Goofus just dives right into the water
// (5) A while loop iterates until a condition is met while a do while loop runs an iteration then a while loop
// (6) Gallant's test is considered the pretest and Goofus is the posttest
