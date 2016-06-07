package projects;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by Nick on 5/29/16.
 */
public class Blackjack
{
    public static void main(String[] args)
    {
        //Variable declarations
        Scanner keyboard = new Scanner(System.in);

        Random r = new Random();
        int playerHand1 = 2 + r.nextInt(10);
        int playerHand2 = 2 + r.nextInt(10);
        int playerHandTotal = playerHand1 + playerHand2;
        int dealerHand1 = 2 + r.nextInt(10);
        int dealerHand2 = 2 + r.nextInt(10);
        int dealerHandTotal = dealerHand1 + dealerHand2;
        String hitOrStay;
        //////////////////////////

        //Introduction to Blackjack
        System.out.println("Welcome to Blackjack.");
        System.out.println("You get a " + playerHand1 + " and a " + playerHand2);
        System.out.println("Your total is " + playerHandTotal);

        System.out.println();
        System.out.println("The dealer has " + dealerHand1 + " showing, and a hidden card.");
        System.out.println("His total is hidden, too.");
        //////////////////////////
        System.out.println();
        //First prompt for user input to enter the while loop



               //While user hits, do this


             while (playerHandTotal < 21 && dealerHandTotal < 21)
             {

                int playerChoiceHit = 2 + r.nextInt(10);

                System.out.println("Would you like to hit or stay");
                hitOrStay = keyboard.next().toLowerCase();

                if(hitOrStay.equals("hit")) //player turn
                {

                    System.out.println("You drew a " + playerChoiceHit);
                    playerHandTotal += playerChoiceHit;
                    System.out.println();
                    System.out.println("Your total is " + playerHandTotal);
                    System.out.println();
                }

                else if(hitOrStay.equals("stay")) //dealer turn
                {
                    System.out.println("Dealer's turn.");
                    System.out.println("The dealer's hidden card was " + dealerHand2);
                    System.out.println("His total was " + dealerHandTotal);
                    System.out.println();

                    while (dealerHandTotal <= 16 && playerHandTotal != dealerHandTotal)
                    {
                        {
                            int dealerChoiceHit = 2 + r.nextInt(10); //do this while the dealers hand remains under 16

                            if (dealerHandTotal <= 16) {
                                System.out.println("Dealer chooses to hit.");
                                System.out.println("The dealer draws a " + dealerChoiceHit);
                                dealerHandTotal += dealerChoiceHit;
                                System.out.println();
                                System.out.println("The dealer's total is " + dealerHandTotal);
                                System.out.println();
                            } else if (dealerHandTotal > 16 && dealerHandTotal <= 21) {
                                System.out.println("The dealer's total is " + dealerHandTotal);
                                System.out.println();
                                System.out.println("The dealer stays.");
                                System.out.println();
                            }
                        }
                    }


                }
            }


        System.out.println("The dealer's total is " + dealerHandTotal);
        System.out.println("Your total is " + playerHandTotal);
        System.out.println();

        if (playerHandTotal <= 21 && dealerHandTotal <= 21)
        {
            if (playerHandTotal > dealerHandTotal)
            {
                System.out.println("You win!");
            }
            else if (playerHandTotal < dealerHandTotal)
            {
                System.out.println("Dealer wins!");
            }
            else if (playerHandTotal == dealerHandTotal) {
                System.out.println("Dealer wins!");
            }
        }
        else if (playerHandTotal <= 21 && dealerHandTotal > 21)
        {
            System.out.println("Dealer busts!");
            System.out.println("You win!");
        }
        else if (playerHandTotal > 21 && dealerHandTotal <= 21)
        {
            System.out.println("You bust!");
            System.out.println("Dealer wins!");
        }

    }
}
