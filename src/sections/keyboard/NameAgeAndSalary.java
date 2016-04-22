package sections.keyboard;
import java.util.Scanner;
/**
 * Created by Nick on 4/22/16.
 */
public class NameAgeAndSalary {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        double salary;

        System.out.print("Hello. What is your name? ");
        name = keyboard.next();

        System.out.print("What's good with it " + name + ", how old are you? " );
        age = keyboard.nextInt();

        System.out.print("So you're " + age + ", eh? That's not old at all. How much do you make, " + name );
        salary = keyboard.nextDouble();

        System.out.print(salary + "! I hope that's per hour and not per year! LOL!");
    }
}
