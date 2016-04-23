package sections.keyboard;
import java.util.Scanner;

/**
 * Created by Nick on 4/22/16.
 */
public class BMICalc  {
    public static void main (String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        double heightInMeters;
        double weightInKg;
        double calcBmi;

        System.out.print("How tall are you? ");
        heightInMeters = keyboard.nextDouble();

        System.out.print("How much do you weigh? ");
        weightInKg = keyboard.nextDouble();

        calcBmi = (weightInKg / (heightInMeters * heightInMeters) );

        System.out.println("Your height in m: " + heightInMeters);
        System.out.println("Your weight in kg: " + weightInKg);
        System.out.println();
        System.out.println("Your BMI is " + calcBmi);


    }

}
