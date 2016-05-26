package sections.whileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/23/16.
 */
public class BabyNim
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int coinAValue = 3;
        int coinBValue = 3;
        int coinCValue = 3;
        String userChoice;
        int userRemovalValue;




        while (coinAValue + coinBValue + coinCValue > 0)
        {
            System.out.println("A:" + coinAValue + "\t" + "B:" + coinBValue + "\t" + "C:" + coinCValue);
            System.out.println();

            System.out.print("Please choose a pile: ");
            userChoice = keyboard.next().toLowerCase();

            System.out.println();
            System.out.print("How many to remove from pile " + userChoice + ": ");
            userRemovalValue = keyboard.nextInt();

            if(userChoice.equals("a"))
            {
                coinAValue -= userRemovalValue;
            }
            else if(userChoice.equals("b"))
            {
                coinBValue -= userRemovalValue;
            }
            else if(userChoice.equals("c"))
            {
                coinCValue -= userRemovalValue;
            }
            else
            {
                System.out.println("Error");
            }

        }

        System.out.println("A:" + coinAValue + "\t" + "B:" + coinBValue + "\t" + "C:" + coinCValue);
        System.out.println();
        System.out.println("All piles are empty. Good job!");


    }
}
