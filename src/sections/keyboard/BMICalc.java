package sections.keyboard;
import java.util.Scanner;

/**
 * Created by Nick on 4/22/16.
 */
public class BMICalc  {
    public static void main (String[] args)  {

        Scanner keyboard = new Scanner(System.in);


        final double INCHES_IN_FEET = 12;
        final double FEET_IN_METERS = 3.28084;
        final double POUNDS_IN_KILOS = 0.453592;


        double feet;
        double inches;
        double pounds;
        double calcBmi;
        double calcHeight;
        double calcHeightImp;
        double calcWeightImp;

        System.out.print("How tall are you in feet? ");
        feet = keyboard.nextDouble();

        System.out.print("And inches? ");
        inches = keyboard.nextDouble();

        calcHeight = (feet + (inches / INCHES_IN_FEET));

        System.out.print("How much do you weigh in pounds? ");
        pounds = keyboard.nextDouble();

        calcWeightImp = (pounds * POUNDS_IN_KILOS);
        calcHeightImp = (calcHeight / FEET_IN_METERS);
        calcBmi = (calcWeightImp / (calcHeightImp * calcHeightImp) );

        System.out.println("Your height (feet only): " + feet);
        System.out.println("Your height (inches): " + inches);
        System.out.println("Your weight in pounds: " + pounds);
        System.out.println();
        System.out.println("Your BMI is " + calcBmi);

    }

}
