package sections.rndNumbers;
import java.util.Random;
/**
 * Created by Nick on 5/16/16.
 */
public class Dice
{
    public static void main(String[] args)
    {
        Random r = new Random();

        int dice1 = 1 + r.nextInt(6);
        int dice2 = 1 + r.nextInt(6);
        int diceSum = dice1 + dice2;

        System.out.println("Simulating Dice Roll...");
        System.out.println();

        System.out.println("Dice Roll #1 = " + dice1);
        System.out.println("Dice Roll #2 = " + dice2);
        System.out.println();

        System.out.println("Total Dice Value = " + diceSum);
    }
}
