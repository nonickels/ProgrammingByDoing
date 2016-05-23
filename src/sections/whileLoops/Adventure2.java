package sections.whileLoops;
import java.util.Scanner;

/**
 * Created by Nick on 5/23/16.
 */
public class Adventure2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int nextRoom = 1;
        String choice = "";

        System.out.println("You are in a spooky house. press 1 to start.");
        nextRoom = keyboard.nextInt();
        System.out.println("upstairs or downstairs?");


        while (nextRoom != 10 && nextRoom != 11) {
            if (nextRoom == 1)
            {
                choice = keyboard.nextLine().toLowerCase();

                if (choice.equals("upstairs"))
                    nextRoom = 2;
                else if (choice.equals("downstairs"))
                    nextRoom = 3;
            }
            if (nextRoom == 2)
            {
                System.out.println("U ascend upstairs. go back or go into spooky room?");
                System.out.print("> ");
                choice = keyboard.nextLine().toLowerCase();
                if (choice.equals("go back"))
                    nextRoom = 1;
                else if (choice.equals("spooky room"))
                    nextRoom = 4;
                else
                    System.out.println("ERROR.");
            }
            if (nextRoom == 3)
            {
                System.out.println("u go downstairs to the dungeon. go back or open the casket?");
                System.out.print("> ");
                choice = keyboard.nextLine().toLowerCase();
                if (choice.equals("go back"))
                    nextRoom = 2;
                else if (choice.equals("open the casket"))
                    nextRoom = 5;
                else
                    System.out.println("ERROR.");
            }
            if (nextRoom == 4)
            {
                System.out.println("you enter the spookzone. go back or open the wardrobe?");
                System.out.print("> ");
                choice = keyboard.nextLine().toLowerCase();
                if (choice.equals("go back"))
                    nextRoom = 1;
                else if (choice.equals("open the wardrobe"))
                    nextRoom = 6;
                else
                    System.out.println("ERROR.");
            }
            if (nextRoom == 5)
            {
                System.out.println("you open the casket. skeletor appears. attack or run away?");
                System.out.print("> ");
                choice = keyboard.nextLine().toLowerCase();
                if (choice.equals("attack"))
                    nextRoom = 11;
                else if (choice.equals("run away"))
                    nextRoom = 1;
                else
                    System.out.println("ERROR.");
            }
            if (nextRoom == 6)
            {
                System.out.println("you open the wardrobe. narnia appears. go through or run away?");
                System.out.print("> ");
                choice = keyboard.nextLine().toLowerCase();
                if (choice.equals("go through"))
                    nextRoom = 10;
                else if (choice.equals("run away"))
                    nextRoom = 1;
                else
                    System.out.println("ERROR.");
            }
        }
        if (nextRoom == 10)
            System.out.println("you win");
        if (nextRoom == 11)
            System.out.println("u ded. bai.");
    }
}
