package sections.ifStatements;

/**
 * Created by Nick on 4/23/16.
 */
public class ElseAndIf {
    public static void main(String[] args) {
        int people = 30;
        int cars = 40;
        int buses = 15;

        if ( cars > people )
        {
            System.out.println( "We should take the cars." );
        }
        else if ( cars < people ) // The Else If states the opposite condition and the Else is a condition that fails both the If and the Else If
        {                          /* If the Else is removed from the Else If, the Else If becomes an If. The Else then refers to the closest If and prints its opposite.*/
            System.out.println( "We should not take the cars." ); /* This makes a difference because an If statement by itself will only run one condition with one statement*/
        }                                                         /*  but if an Else statement is added, the opposite condition will then have a statement. */
        else
        {
            System.out.println( "We can't decide." );
        }


        if ( buses > cars )
        {
            System.out.println( "That's too many buses." );
        }
        else if ( buses < cars )
        {
            System.out.println( "Maybe we could take the buses." );
        }
        else
        {
            System.out.println( "We still can't decide." );
        }


        if ( people > buses )
        {
            System.out.println( "All right, let's just take the buses." );
        }
        else
        {
            System.out.println( "Fine, let's stay home then." );
        }

    }
}
