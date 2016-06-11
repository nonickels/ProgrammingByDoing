package functions;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by Nick on 6/11/16.
 */
public class Keychains3
{
    public static Scanner keyboard = new Scanner(System.in);


    public static int menuDecision = 0;
    public static int keychainCounter = 0;
    public static final int keychainPrice = 10;
    public static final double salesTax = .0825;
    public static final int shippingCost = 5;
    public static final int additionalPerKeychainShippingCost = 1;

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
                    if (keychainCounter > 0) {
                        remove_keychains(sub);
                        System.out.println("You now have " + keychainCounter + " keychains.");
                        System.out.println();
                        break;
                    }
                    else if (keychainCounter <= 0)
                    {
                        System.out.println("You must have at least 1 keychain to remove.");
                        System.out.println();
                    }
                    break;
                case 3:
                    view_order();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ERROR.");
                    System.out.println();
                    continue;
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
        int shippingTotal = shippingCost + (keychainCounter * additionalPerKeychainShippingCost);
        int subTotalPreTax = (keychainCounter * keychainPrice) + shippingTotal;
        double taxAmount = subTotalPreTax * salesTax;
        double finalCost = subTotalPreTax + (taxAmount);

        System.out.println("You have " + keychainCounter + " keychains.");
        System.out.println("Keychains cost $" + keychainPrice + " each.");
        System.out.println("Shipping cost: $" + shippingTotal);
        System.out.println("Subtotal before tax: $" + subTotalPreTax);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("Final Cost: $" + finalCost);
        System.out.println();
    }
    public static void checkout()
    {
        System.out.println("What is your name?");
        String name = keyboard.next();
        view_order();
        System.out.println("Thanks for ordering, " + name + ".");
    }
}
