package sections.ifStatements;
import java.util.Scanner;
/**
 * Created by Nick on 4/23/16.
 */
public class LittleQuiz
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        final int answer1 = 4;
        final int answer2 = 4;
        final int answer3 = 3;

        int userInput1;
        int userInput2;
        int userInput3;

        int numCorrectAnswers = 0;

        System.out.println("Q1) What is my middle name? ");
        System.out.println("    1) Daniel ");
        System.out.println("    2) Craig ");
        System.out.println("    3) Joseph ");
        System.out.println("    4) Hunter ");
        System.out.println();
        System.out.print("> ");
        userInput1 = keyboard.nextInt();
        System.out.println();

        if(userInput1 == answer1) {
            System.out.println("That's right! ");
            System.out.println();
            numCorrectAnswers++;

        }
        else
        {
            System.out.println("Sorry, that is incorrect. ");
            System.out.println();

        }

        System.out.println("Q2) Company A's fixed costs were $45,000, its variable costs were $24,000, and its ");
        System.out.println(" sales were $80,000. The company's break-even point in sales-dollars is: ? ");
        System.out.println("    1) 79335 ");
        System.out.println("    2) 33287 ");
        System.out.println("    3) 88324 ");
        System.out.println("    4) 64286 ");
        System.out.println();
        System.out.print("> ");
        userInput2 = keyboard.nextInt();
        System.out.println();

        if(userInput2 == answer2) {
            System.out.println("That's right! ");
            System.out.println();
            numCorrectAnswers++;
        }
        else
        {
            System.out.println("Sorry, that is incorrect. ");
            System.out.println();

        }

        System.out.println("Q3) What is my favorite color? ");
        System.out.println("    1) Blue");
        System.out.println("    2) Green ");
        System.out.println("    3) Red ");
        System.out.println("    4) Yellow ");
        System.out.println();
        System.out.print("> ");
        userInput3 = keyboard.nextInt();
        System.out.println();

        if(userInput3 == answer3) {
            System.out.println("That's right! ");
            System.out.println();
            numCorrectAnswers++;

        }
        else
        {
            System.out.println("Sorry, that is incorrect. ");
            System.out.println();

        }

        System.out.println("Overall, you got " + numCorrectAnswers + " out of 3 correct. ");
        System.out.println("Thanks for playing. ");


    }
}
