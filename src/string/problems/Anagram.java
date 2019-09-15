package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        Anagram anagram = new Anagram();
        String a = "ARMY";
        String b = "MARY";
        String c = "CAT";
        String d = "ACT";
        System.out.println(AnaGram(d, b));
        System.out.println(AnaGram(c, d));
        System.out.println(AnaGram(b, d));


    }

    public static boolean AnaGram(String a, String b) {
        char[] toCharArrayA = a.toCharArray();
        char[] toCHarArrayB = b.toCharArray();


        Arrays.sort(toCharArrayA);
        Arrays.sort(toCHarArrayB);


        return (Arrays.equals(toCharArrayA, toCHarArrayB));

    }

}


