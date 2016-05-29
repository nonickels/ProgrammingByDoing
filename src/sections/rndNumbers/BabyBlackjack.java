package sections.rndNumbers;
import java.util.Random;
/**
 * Created by Nick on 5/27/16.
 */
public class BabyBlackjack
{
    public static void main(String[] args)
    {

        Random r = new Random();

        int playerHand1 = 1 + r.nextInt(10);
        int playerHand2 = 1 + r.nextInt(10);
        int dealerHand1 = 1 + r.nextInt(10);
        int dealerHand2 = 1 + r.nextInt(10);
        int playerSum = playerHand1 + playerHand2;
        int dealerSum = dealerHand1 + dealerHand2;


        System.out.println("Baby Blackjack!");
        System.out.println();
        System.out.println("You drew " + playerHand1 + " and " + playerHand2 + ".");
        System.out.println("Your total is " + playerSum + ".");

        System.out.println();
        System.out.println("The dealer has " + dealerHand1 + " and " + dealerHand2 + ".");
        System.out.println("The dealer's total is " + dealerSum + ".");

        if(playerSum > dealerSum)
        {
            if(playerSum <= 21)
            {
                System.out.println("You win!");
            }
            else
            {
                System.out.println("You lose!");
            }
        }
        else if(dealerSum > playerSum)
        {
            if(dealerSum <= 21)
            {
                System.out.println("You lose!");
            }
            else
            {
                System.out.println("You win!");
            }
        }


    }
}
