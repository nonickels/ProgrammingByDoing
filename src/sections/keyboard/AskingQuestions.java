package sections.keyboard;
import java.util.Scanner;


/**
 * Created by Nick on 4/22/16.
 */
public class AskingQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        int feet;
        int inches;
        double weight;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("How many feet tall are you? ");
        feet = keyboard.nextInt();

        System.out.print("And how many inches? ");
        inches = keyboard.nextInt();

        System.out.print("How much do you weigh? ");
        weight = keyboard.nextDouble();

        System.out.println( "So you're " + age + " old, " + feet + "'" + inches + "\"" + " tall and " + weight + " heavy." );
    }
}
