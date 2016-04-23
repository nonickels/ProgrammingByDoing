package sections.ifStatements;
import java.util.Scanner;

/**
 * Created by Nick on 4/23/16.
 */
public class SpaceBoxing
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        final double GRAV_VENUS = 0.78;
        final double GRAV_MARS = 0.39;
        final double GRAV_JUPITER = 2.65;
        final double GRAV_SATURN = 1.17;
        final double GRAV_URANUS = 1.05;
        final double GRAV_NEPTUNE = 1.23;

        int earthWeight;
        int destinationPlanet;

        System.out.print("Please enter your current earth weight: ");
        earthWeight = keyboard.nextInt();

        System.out.println();
        System.out.println("I have information for the following planets: ");
        System.out.println("   1. Venus   2. Mars    3. Jupiter   ");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune   ");
        System.out.println();

        System.out.println("Which planet are you visiting? ");
        destinationPlanet = keyboard.nextInt();

        if (destinationPlanet == 1)
        {
            System.out.println("Your weight would be " + ( earthWeight * GRAV_VENUS ) + " pounds on that planet. ");
        }
        else if (destinationPlanet == 2)
        {
            System.out.println("Your weight would be " + ( earthWeight * GRAV_MARS ) + " pounds on that planet. ");
        }
        else if(destinationPlanet == 3)
        {
            System.out.println("Your weight would be " + ( earthWeight * GRAV_JUPITER ) + " pounds on that planet. ");
        }
        else if (destinationPlanet == 4)
        {
            System.out.println("Your weight would be " + ( earthWeight * GRAV_SATURN ) + " pounds on that planet. ");
        }
        else if (destinationPlanet == 5)
        {
            System.out.println("Your weight would be " + ( earthWeight * GRAV_URANUS ) + " pounds on that planet. ");
        }
        else if (destinationPlanet == 6)
        {
            System.out.println("Your weight would be " + ( earthWeight * GRAV_NEPTUNE ) + " pounds on that planet. ");
        }
        else
        {
            System.out.println("Not a valid planet. ");
        }

    }
}
