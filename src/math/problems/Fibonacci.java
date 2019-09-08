package math.problems;

public class Fibonacci {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        for (int i=0; i<=40; i++ ){
            System.out.println(num1);
            num1 = num1 + num2;
            num2 = num1 - num2;


        }
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


    }
}
