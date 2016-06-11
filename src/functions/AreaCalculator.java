package functions;

import java.util.Scanner;
/**
 * Created by Nick on 6/10/16.
 */
public class AreaCalculator
{
    public static double area_circle( int radius )              // returns the area of a circle
    {
        double a;

        a = Math.PI *  Math.pow(radius, 2.0);

        return a;
    }
    public static int area_rectangle( int length, int width )   // returns the area of a rectangle
    {
        int ar;

        ar = length * width;

        return ar;
    }
    public static int area_square( int side )                   // returns the area of a square
    {
        int as;

        as = side * side;

        return as;
    }
    public static double area_triangle( int base, int height )  // returns the area of a triangle
    {
        double at;

        at = .5 * base * height;

        return at;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int shapeChoice = 0;
        System.out.println("Shape Area Calculator version 0.1 (c) 2016 Littman Sample Output, Inc.");
        System.out.println();
        System.out.println("----------------------------------------------------------------------");


        while(shapeChoice != 5)
        {
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Circle");
            System.out.println("5. Quit");
            System.out.println();
            System.out.print("Which shape: ");
            shapeChoice = keyboard.nextInt();
            System.out.println();

            if (shapeChoice == 1)
            {

                System.out.print("Base: ");
                int base = keyboard.nextInt();
                System.out.println();
                System.out.print("Height: ");
                int height = keyboard.nextInt();

                System.out.println();
                System.out.println("The area is:" + area_triangle(base, height) + ".");

                System.out.println();
                System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");
                System.out.println();
            }
            else if (shapeChoice == 2)
            {
                System.out.print("Length: ");
                int length = keyboard.nextInt();
                System.out.println();

                System.out.print("Width: ");
                int width = keyboard.nextInt();
                System.out.println();

                System.out.println("The area is:" + area_rectangle(length, width) + ".");

                System.out.println();
                System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");
                System.out.println();
            }
            else if (shapeChoice == 3)
            {
                System.out.print("Side length: ");
                int side = keyboard.nextInt();
                System.out.println();

                System.out.println("The area is: " + area_square(side));

                System.out.println();
                System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");
                System.out.println();

            }
            else if (shapeChoice == 4)
            {
                System.out.print("Radius: ");
                int radius = keyboard.nextInt();
                System.out.println();

                System.out.println("The area is: " + area_circle(radius));

                System.out.println();
                System.out.println("••••••••••••••••••••••••••••••••••••••••••••••");
                System.out.println();

            }
        }

        System.out.println("Goodbye.");
    }
}
