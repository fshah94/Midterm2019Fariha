package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    // With recursion


    public static int fact(int num) {
        if (num == 0)
            return 1;
        else
            return (num * fact(num - 1));
    }


//        // With Iteration
//        public static int factorialWithIt ( int number) {
//            int factor = 1;
//            for (int i = 1; 1 < number; i++) {
//                factor = factor * i;
//
//            }
//            return factor;
//        }


        }


        /*

         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */




