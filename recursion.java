/**
 * @(#)recursion.java
 *
 *
 * @author
 * @version 1.00 2012/4/19
 */


public class recursion {

    public int b;
        public static void main(String[] args)
        {

            int x = 7;
            
            System.out.println("The factorial of " + x + " is: " + myPower(x));


            }
        
        static int myPower(int x)
            {
                if (x == 0)
                    return 1;

                    else
                        return x * myPower(x - 1);

                }


            


}