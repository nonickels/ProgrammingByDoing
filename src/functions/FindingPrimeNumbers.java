package functions;

/**
 * Created by Nick on 6/11/16.
 */
public class FindingPrimeNumbers {
    public static void main(String[] args)
    {
        for(int x = 2; x <= 20; x++)
        {
            if(isPrime(x))
                System.out.println(x + " <");
            else
                System.out.println(x);
        }
    }
    public static boolean isPrime(int n)
    {
        for(int i = 2; i < n; i++)
        {
            if (n % i != 0)
                return true;
            else
            {
                return false;

            }
        }
        return true;
    }
}
