package sections.guis;
import java.util.Scanner;
/**
 * Created by Nick on 4/24/16.
 */
public class Adventure1
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int answer1;
        int answer2;
        int answer3;
        int answer4;
        
        
        System.out.println("Welcome to the game. WARNING: Enter at your own risk. ");
        System.out.println();
        System.out.println("You enter. Do you choose 1 or 2?");
        System.out.print("> ");
        answer1 = keyboard.nextInt();
        System.out.println();

        if (answer1 == 1) {
            System.out.println();
            System.out.println("A semi-functioning calculator appears. Do you click button 3 or 4?");
            System.out.print("> ");
            answer2 = keyboard.nextInt();
            System.out.println();

            if (answer2 == 3)
            {
                System.out.println();
                System.out.println("A daring exponent shows up. Do you click button 7 or 8?");
                System.out.print("> ");
                answer3 = keyboard.nextInt();
                System.out.println();

                if (answer3 == 7)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("This is ending number 1.");

                }
                else if (answer3 ==  8)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("This is ending number 2.");

                }
            }
            else if (answer2 == 4) {
                System.out.println();
                System.out.println("A friendly peanut shows up. Do you click button 9 or 10?");
                System.out.print("> ");
                answer3 = keyboard.nextInt();
                System.out.println();

                if (answer3 == 9)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("This is ending number 3.");

                }
                else if(answer3 == 10)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("This is ending number 4.");

                }
            }
        }
        else if (answer1 == 2)
        {
            System.out.println();
            System.out.println("A wild integer appears. Do you click button 5 or 6?");
            System.out.print("> ");
            answer2 = keyboard.nextInt();
            System.out.println();

            if (answer2 == 5)
            {
                System.out.println();
                System.out.println("mom or dad?");
                System.out.print("> ");
                String answer3String = keyboard.next();
                System.out.println();

                if (answer3String .equals("mom"))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("This is ending number 5.");

                }
                else if (answer3String .equals("dad"))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("This is ending number 6.");
                }
            }
            else if (answer2 == 6) {
                System.out.println();
                System.out.println("wa wa wa wa wa. wa wa wa wa. 0 or 12? ");
                System.out.print("> ");
                answer3 = keyboard.nextInt();
                System.out.println();

                if (answer3 == 0)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("This is ending number 7.");

                }
                else if(answer3 == 12)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("This is ending number 8.");

                }
            }
        }
    }
}
