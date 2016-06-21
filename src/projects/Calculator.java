package projects;

import java.util.Scanner;

/**
 * Created by Nick on 6/13/16.
 */
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double a, b, c;
        String op;

        do
        {
            System.out.print("> ");
            a  = keyboard.nextDouble();
            op = keyboard.next();
            b  = keyboard.nextDouble();

            if ( op.equals("+") )
                c = add(a,b);
            else if (op.equals("-"))
                c = subtract(a,b);
            else if (op.equals("*"))
                c = multiply(a,b);
            else if (op.equals("/"))
                c = divide(a,b);
            else if (op.equals("^"))
                c = exponents(a,b);
            else
            {
                System.out.println("Undefined operator: '" + op + "'.");
                c = 0;
            }

            System.out.println(c);

        } while ( a != 0 );
    }

    public static double add(double a, double b)
    {
        double sum;

        sum = a + b;

        return sum;
    }

    public static double subtract(double a, double b)
    {
        double difference;

        difference = a - b;

        return difference;
    }

    public static double multiply(double a, double b)
    {
        double product;

        product = a * b;

        return product;
    }

    public static double divide(double a, double b)
    {
        double quotient;

        quotient = a / b;

        return quotient;
    }

    public static double exponents(double a, double b)
    {
        double number = a, power = b, value = 0, storage = 0;

        for (int x = 1; x <= power; x++)
        {
            value = number * number;
            storage *= value;
        }

        return storage;
    }
}
