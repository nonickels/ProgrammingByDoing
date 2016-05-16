package sections.rndNumbers;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nick on 5/16/16.
 */
public class FortuneCookie {
    public static void main(String[] args)
    {
        Random r = new Random();

        int randomFortune = 1 + r.nextInt(6);
        int randomLotto1 = 1 + r.nextInt(54);
        int randomLotto2 = 1 + r.nextInt(54);
        int randomLotto3 = 1 + r.nextInt(54);
        int randomLotto4 = 1 + r.nextInt(54);
        int randomLotto5 = 1 + r.nextInt(54);
        int randomLotto6 = 1 + r.nextInt(54);



        if (randomFortune == 1)
            System.out.println("Fortune cookie says: Eat more vegetables.");
        else if (randomFortune == 2)
            System.out.println("Fortune cookie says: When life gives you lemons, someone else is losing lemons.");
        else if (randomFortune == 3)
            System.out.println("Fortune cookie says: You will find love after life.");
        else if (randomFortune == 4)
            System.out.println("Fortune cookie says: Sticks and stones.");
        else if (randomFortune == 5)
            System.out.println("Fortune cookie says: Do more puzzles.");
        else if (randomFortune == 6)
            System.out.println("Fortune cookie says: Watch more Netflix.");
        else
            System.out.println("No fortune for you.");

        System.out.print("    " + randomLotto1 + " - ");
        System.out.print(randomLotto2 + " - ");
        System.out.print(randomLotto3 + " - ");
        System.out.print(randomLotto4 + " - ");
        System.out.print(randomLotto5 + " - ");
        System.out.print(randomLotto6);


    }
}
