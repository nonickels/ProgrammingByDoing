package sections.keyboard;
import java.util.Scanner;
/**
 * Created by Nick on 4/22/16.
 */
public class AgeInFive {
    public static void main(String[] args) {

        //TODO: Indenting needs to be consistent. https://google.github.io/styleguide/javaguide.html
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Hello, what is your name? ");
        name = keyboard.next();

        System.out.print("Hi " + name + "! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("Did you know that in five years you will be " + (age + 5) + " years old? ");
        System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
        // So I can recommit
    }
}
