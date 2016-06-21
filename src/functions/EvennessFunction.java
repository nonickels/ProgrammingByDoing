package functions;

/**
 * Created by Nick on 6/11/16.
 */
public class EvennessFunction
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 20; i++)
        {
            if (isEven(i) && isDivisibleBy3(i))
                System.out.println(i + " <=");
            else if (isEven(i) && !(isDivisibleBy3(i)))
                System.out.println(i + " <");
            else if (!(isEven(i)) && isDivisibleBy3(i))
                System.out.println(i + " =");
            else
                System.out.println(i);
        }

    }

    public static boolean isEven(int n)
    {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isDivisibleBy3(int n)
    {
        if (n % 3 == 0)
            return true;
        else
            return false;
    }
}
