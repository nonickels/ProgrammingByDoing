package sections.ifStatements; // Remove this line to run in terminal

/**
 * Created by Nick on 4/23/16.
 */
public class ModulusAnimation
{
        public static void main( String[] args ) throws Exception
        {

            for ( int i=0; i<100 ; i++ )
            {

                if (i%17 == 0)
                    System.out.print("________ \r");
                else if (i%17 == 1)
                    System.out.print("_______« \r");
                else if (i%17 == 2)
                    System.out.print("______«_ \r");
                else if (i%17 == 3)
                    System.out.print("_____«__ \r");
                else if (i%17 == 4)
                    System.out.print("____«___ \r");
                else if (i%17 == 5)
                    System.out.print("___«I___ \r");
                else if (i%17 == 6)
                    System.out.print("__«HI___ \r");
                else if (i%17 == 7)
                    System.out.print("_«_HI___ \r");
                else if (i%17 == 8)
                    System.out.print("«__HI___ \r");
                else if (i%17 == 9)
                    System.out.print("»__HI___ \r");
                else if (i%17 == 10)
                    System.out.print("_»_HI___ \r");
                else if (i%17 == 11)
                    System.out.print("_»_HI___ \r");
                else if (i%17 == 12)
                    System.out.print("__»HI___ \r");
                else if (i%17 == 13)
                    System.out.print("___»I___ \r");
                else if (i%17 == 14)
                    System.out.print("____»___ \r");
                else if (i%17 == 15)
                    System.out.print("_____»__ \r");
                else if (i%17 == 16)
                    System.out.print("______»_ \r");
                else if (i%17 == 17)
                    System.out.print("_______» \r");

                Thread.sleep(70);
            }

        }
    }
