package sections.whileLoops;
import java.util.Random;
/**
 * Created by Nick on 5/18/16.
 */
public class DiceDoubles
{
    public static void main(String[] args)
    {
        Random r = new Random();

        int dice1 = 1 + r.nextInt(6);
        int dice2 = 1 + r.nextInt(6);
        int diceSum;

        System.out.println("Simulating Dice Roll...");
        System.out.println();

        while(!(dice1 == dice2))
        {
            dice1 = 1 + r.nextInt(6);
            dice2 = 1 + r.nextInt(6);
            diceSum = dice1 + dice2;
            System.out.println("Dice Roll #1 = " + dice1);
            System.out.println("Dice Roll #2 = " + dice2);
            System.out.println("Total Dice Value = " + diceSum);
            System.out.println();
        }

    }
}
