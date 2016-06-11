package functions;

import java.util.Scanner;
/**
 * Created by Nick on 6/11/16.
 */
public class Keychains2
{
    public static Scanner keyboard = new Scanner(System.in);


    public static int menuDecision = 0;
    public static int keychainCounter = 0;
    public static final int keychainPrice = 10;

    public static void main(String[] args)
    {

        while(menuDecision != 4) {
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            System.out.println();
            System.out.print("Please Enter Your Choice:");
            menuDecision = keyboard.nextInt();
            System.out.println();

            switch (menuDecision) {
                case 1:
                    System.out.println("You currently have " + keychainCounter + " keychains. How many to add?");
                    int add = keyboard.nextInt();
                    add_keychains(add);
                    System.out.println("You now have " + keychainCounter + " keychains.");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("You currently have " + keychainCounter + " keychains. How many to remove?");
                    int sub = keyboard.nextInt();
                    remove_keychains(sub);
                    System.out.println("You now have " + keychainCounter + " keychains.");
                    System.out.println();
                    break;
                case 3:
                    view_order();
                    break;
            }
        }
        checkout();

    }

    public static int add_keychains(int add)
    {
        keychainCounter += add;

        return keychainCounter;
    }
    public static int remove_keychains(int sub)
    {

        keychainCounter -= sub;

        return keychainCounter;
    }
    public static void view_order()
    {
        System.out.println("You have " + keychainCounter + " keychains.");
        System.out.println("Keychains cost $" + keychainPrice + " each.");
        System.out.println("Total cost is $" + keychainCounter * keychainPrice + ".");
        System.out.println();
    }
    public static void checkout()
    {
        System.out.println("What is your name?");
        String name = keyboard.next();
        System.out.println("You have " + keychainCounter + " keychains.");
        System.out.println("Keychains cost $" + keychainPrice + " each.");
        System.out.println("Total cost is $" + keychainCounter * keychainPrice + ".");
        System.out.println("Thanks for ordering, " + name + ".");
    }
}
