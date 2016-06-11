package functions;

import java.util.Scanner;
/**
 * Created by Nick on 6/11/16.
 */
public class Keychains1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        int menuDecision = 0;

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
                    add_keychains();
                    break;
                case 2:
                    remove_keychains();
                    break;
                case 3:
                    view_order();
                    break;
            }
        }
        checkout();

    }

    public static void add_keychains()
    {
        System.out.println("ADD KEYCHAINS");
        System.out.println();
    }
    public static void remove_keychains()
    {
        System.out.println("REMOVE KEYCHAINS");
        System.out.println();
    }
    public static void view_order()
    {
        System.out.println("VIEW ORDER");
        System.out.println();
    }
    public static void checkout()
    {
        System.out.println("CHECKOUT");
        System.out.println();
    }
}
