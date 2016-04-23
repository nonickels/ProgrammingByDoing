package sections.keyboard;
import java.util.Scanner;

/**
 * Created by Nick on 4/22/16.
 */
public class DumbCalculator  {
    public static void main (String[] args)  {
        Scanner keyboard = new Scanner (System.in);

        double numFirst;
        double numSecond;
        double numThird;

        System.out.print("What is your first number? ");
        numFirst = keyboard.nextDouble();

        System.out.print("What is your second number? ");
        numSecond = keyboard.nextDouble();

        System.out.print("What is your third number? ");
        numThird = keyboard.nextDouble();

        System.out.print("( " + numFirst + " + " + numSecond + " + " + numThird + " )  /  2 is... " + ((numFirst + numSecond + numThird) / 2 ));

    }
}
