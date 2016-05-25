package sections.whileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/23/16.
 */
public class Nim
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String userName1, userName2;
        String userPileChoice1, userPileChoice2;
        int user1Turn = 1;
        int user2Turn = 2;
        String pileA, pileB, pileC;
        int pileAValue = 3; //storage variable of pileA
        int pileBValue = 3; //storage variable of pileB
        int pileCValue = 3; //storage variable of pileC
        int removalValue;

        System.out.println("Player 1, enter your name: ");
        userName1 = keyboard.nextLine();

        System.out.println("Player 2, enter your name: ");
        userName2 = keyboard.nextLine();

        do
        {
            if(user1Turn != user2Turn) // If the userTurn values are not equal, player1 is up.
            {
                user1Turn++;
                System.out.println(userName1 + ", choose a pile: ");
                userPileChoice1 = keyboard.nextLine();

                if(userPileChoice1.equals("a"))
                {
                    System.out.println("How many to remove from pile a: ");
                    removalValue = keyboard.nextInt();
                    pileAValue -= removalValue;

                }
                else if(userPileChoice1.equals("b"))
                {
                    System.out.println("How many to remove from pile b: ");
                    removalValue = keyboard.nextInt();
                    pileBValue -= removalValue;
                }
                else
                {
                    System.out.println("How many to remove from pile c: ");
                    removalValue = keyboard.nextInt();
                    pileCValue -= removalValue;
                }
            }
            else //Else userTurn values are equal, player2 is up.
            {
                user2Turn++;
                System.out.println(userName2 + ", choose a pile: ");
                userPileChoice2 = keyboard.nextLine();

                if (userPileChoice2.equals("a"))
                {
                    System.out.println("How many to remove from pile a: ");
                    removalValue = keyboard.nextInt();
                    pileAValue -= removalValue;


                }
                else if (userPileChoice2.equals("b"))
                {
                    System.out.println("How many to remove from pile b: ");
                    removalValue = keyboard.nextInt();
                    pileBValue -= removalValue;
                }
                else
                {
                    System.out.println("How many to remove from pile c: ");
                    removalValue = keyboard.nextInt();
                    pileCValue -= removalValue;
                }
            }
        }
        while(pileAValue + pileBValue + pileCValue > 1);

    }
}