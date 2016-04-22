package sections.keyboard;
import java.util.Scanner;

/**
 * Created by Nick on 4/22/16.
 */
public class MoreUserInputOfData {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String firstName;
        String lastName;
        int grade;
        int id;
        String login;
        double gpa;

        System.out.print("Please enter your first name. ");
        firstName = keyboard.next();

        System.out.print("last name? ");
        lastName = keyboard.next();

        System.out.print("Please enter your current grade? (9-12) ");
        grade = keyboard.nextInt();

        System.out.print("Please enter your Student ID. ");
        id = keyboard.nextInt();

        System.out.print("Please enter your login information. ");
        login = keyboard.next();

        System.out.print("Please enter your current cumulative GPA. ");
        gpa = keyboard.nextDouble();

        System.out.println("Your information: ");
        System.out.println("        Login: " + login);
        System.out.println("        ID: " + id);
        System.out.println("        Name: " + lastName + ", " + firstName);
        System.out.println("        GPA: " + gpa);
        System.out.println("        Grade: " + grade);


    }
}
