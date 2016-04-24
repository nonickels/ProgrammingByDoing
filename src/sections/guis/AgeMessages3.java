package sections.guis;
import java.util.Scanner;
/**
 * Created by Nick on 4/24/16.
 */
public class AgeMessages3 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        System.out.print("» ");
        String name = keyboard.next();
        System.out.println();

        System.out.println("Hi, " + name + ", how old are you?");
        System.out.print("» ");
        int age = keyboard.nextInt();
        System.out.println();

        if (age < 16)
        {
            System.out.println("You can't drive, " + name + ".");
        }
        if (age > 16 && age < 18)
        {
            System.out.println("You can drive but not vote. " + name + ".");
        }
        if (age > 18 && age < 25)
        {
            System.out.println("You can vote but you not rent a car, " + name + ".");
        }
        if(age > 25)
        {
            System.out.println("You can pretty much do anything, " + name + ".");
        }
    }
}
