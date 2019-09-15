package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    // With recursion


    static double factorial(double factor) {
        if (factor == 0) {
            return 1;
        } else {
            return factor * factorial(factor - 1);

        }


    }

    public static void main(String[] args) {

     System.out.println(Factorial.factorial(5));

}




    /*

         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


    }
