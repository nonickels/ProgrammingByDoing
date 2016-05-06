package sections.ifStatements;
import java.util.Scanner;
/**
 * Created by Nick on 4/24/16.
 */
public class GenderGame
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your gender (m or f) :");
        String userGender = keyboard.next().toLowerCase();

        System.out.print("First name: ");
        String userFirstName = keyboard.next();

        System.out.print("Last name: ");
        String userLastName = keyboard.next();

        System.out.print("Age: ");
        int userAge = keyboard.nextInt();

        System.out.println();

        if(userAge < 20)
            System.out.println("Then I shall call you " + userFirstName + " " + userLastName + ".");

        if(userAge >= 20)
        {
            if (userAge >= 20 && userGender .equals("m"));
            System.out.println("Then I shall call you Mr. " + userLastName + ".");

            if (userAge >= 20 && userGender.equals("f")) {
                System.out.println("Are you married, " + userFirstName + " (y or n)?");
                String userMaritalStatus = keyboard.next();
                {
                    if (userMaritalStatus.equals("y"))
                        System.out.println("Then I shall call you Mrs. " + userLastName + ".");
                    else
                        System.out.println("Then I shall call you Ms. " + userLastName + ".");
                }
            }
        }
    }
}
