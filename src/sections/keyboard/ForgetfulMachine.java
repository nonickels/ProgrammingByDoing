package sections.keyboard;
import java.util.Scanner;
/**
 * Created by Nick on 4/22/16.
 */
public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please type a word. ");
        keyboard.next();

        System.out.print("Please type a different word. ");
        keyboard.next();

        System.out.print("What is your favorite number? ");
        keyboard.nextInt();

        System.out.print("What is your best guess on the number of licks required to reach the center of a tootsie pop? ");
        keyboard.nextInt();

    }

}
