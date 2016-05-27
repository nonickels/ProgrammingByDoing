package forLoops;

/**
 * Created by Nick on 5/27/16.
 */
public class XsAndYs
{
    public static void main(String[] args)
    {
        for(double x = -10.0; x <= 10.0; x += 0.5 )
        {
            double y = x * x;
            System.out.println(x + "\t" + y);
        }
    }
}
