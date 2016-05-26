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

        int pile1Val = 3; // Pile 1 Value
        int pile2Val = 3; // Pile 2 Value
        int pile3Val = 3; // Pile 3 Value
        int playerTurn = 0; // Player Turn

        System.out.println("Player 1, enter name: "); // Player 1 name prompt
        String playerName1 = keyboard.next(); // Player 1 name variable storage

        System.out.println("Player 2, enter name: "); // Player 2 name prompt
        String playerName2 = keyboard.next(); // Player 2 name variable storage

        while (pile1Val + pile2Val + pile3Val > 1)
        {

            if (playerTurn % 2 == 0) //Player1 turn
            {
                System.out.println("A:" + pile1Val + "\t" + "B:" + pile2Val + "\t" + "C:" + pile3Val); // Prints current pile values
                System.out.println(); // Space

                System.out.println(playerName1 + ", choose a pile: "); // Player 1 pile choice prompt
                String pileChoice = keyboard.next(); // Pile choice variable storage


                System.out.println("How many to remove from " + pileChoice + ": "); // Amount to remove prompt
                int pileRemovalValue = keyboard.nextInt(); // Value of removal choice variable storage

                do //Pre-test check before moving on with the while loop
                {
                    if (pileRemovalValue < 1) // Constraint if pileRemovalValue is less than one
                    {
                        System.out.println("You must choose at least one. Choose again: ");
                        pileRemovalValue = keyboard.nextInt();
                    }

                    if (pileChoice.equals("a") && pileRemovalValue > pile1Val) // This DOESNT WORK!!!
                    {
                        System.out.println("Pile " + pileChoice + " doesn't have that many. Choose again: ");
                        pileRemovalValue = keyboard.nextInt();
                    }
                    if (pileChoice.equals("b") && pileRemovalValue > pile2Val) // This DOESNT WORK!!!
                    {
                        System.out.println("Pile " + pileChoice + " doesn't have that many. Choose again: ");
                        pileRemovalValue = keyboard.nextInt();
                    }
                    if (pileChoice.equals("c") && pileRemovalValue > pile3Val) // This DOESNT WORK!!!
                    {
                        System.out.println("Pile " + pileChoice + " doesn't have that many. Choose again: ");

                    }
                }
                    while (pileRemovalValue < 0);

                if (pileChoice.equals("a"))
                {
                    pile1Val -= pileRemovalValue;
                }
                else if (pileChoice.equals("b"))
                {
                    pile2Val -= pileRemovalValue;
                }
                else if (pileChoice.equals("c"))
                {
                    pile3Val -= pileRemovalValue;
                }
                playerTurn++;

                }

            else if(playerTurn % 2 != 0) //Player2 turn
            {
                System.out.println("A:" + pile1Val + "\t" + "B:" + pile2Val + "\t" + "C:" + pile3Val);
                System.out.println();

                System.out.println(playerName2 + ", choose a pile: ");
                String pileChoice = keyboard.next();

                System.out.println("How many to remove from " + pileChoice + ": ");
                int pileRemovalValue = keyboard.nextInt();

                do //Pre-test check before moving on with the while loop
                {
                    if (pileRemovalValue < 1) // Constraint if pileRemovalValue is less than one
                    {
                        System.out.println("You must choose at least one. Choose again: ");
                        pileRemovalValue = keyboard.nextInt();
                    }

                    if(pileChoice.equals("a") && pileRemovalValue > pile1Val) // This DOESNT WORK!!!
                    {
                        System.out.println("Pile " + pileChoice + " doesn't have that many. Choose again: ");
                        pileRemovalValue = keyboard.nextInt();
                    }
                    if(pileChoice.equals("b") && pileRemovalValue > pile2Val) // This DOESNT WORK!!!
                    {
                        System.out.println("Pile " + pileChoice + " doesn't have that many. Choose again: ");
                        pileRemovalValue = keyboard.nextInt();
                    }
                    if(pileChoice.equals("c") && pileRemovalValue > pile3Val) // This DOESNT WORK!!!
                    {
                        System.out.println("Pile " + pileChoice + " doesn't have that many. Choose again: ");
                        pileRemovalValue = keyboard.nextInt();
                    }

                }
                while (pileRemovalValue < 0);

            if (pileChoice.equals("a"))
            {
                pile1Val -= pileRemovalValue;
            }
            else if (pileChoice.equals("b"))
            {
                pile2Val -= pileRemovalValue;
            }
            else if (pileChoice.equals("c"))
            {
                pile3Val -= pileRemovalValue;
            }
            playerTurn++;

            }
        }

        System.out.println("A:" + pile1Val + "\t" + "B:" + pile2Val + "\t" + "C:" + pile3Val); // Prints current pile values

        if (playerTurn % 2 == 0)
        {
            System.out.println(playerName1 + ", you must take the last counter, so you lose!");
            System.out.println(playerName2 + ", you win!");
        }

        else if (playerTurn % 2 != 0)
        {
            System.out.println(playerName2 + ", you must take the last counter, so you lose!");
            System.out.println(playerName1 + ", you win!");
        }
    }
}
