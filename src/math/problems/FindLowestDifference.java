package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        Arrays.sort(array1);
        Arrays.sort(array2);


        int array1Diff = array1[1] - array1[0];
        for (int t = 2; t != array2.length; t++) {
            array1Diff = Math.min(array1Diff, array1[t] - array1[t - 1]);
        }
        System.out.println("Lowest difference are in array1 is " + array1Diff + "\n");
        int array2Diff = array2[1] - array2[0];
        for (int u = 2; u != array2.length; u++) {
            array2Diff = Math.min(array2Diff, array2[u] - array2[u - 1]);
        }
        System.out.println("Lowest difference are in Array2 is " + array2Diff);

        if (array1Diff > array2Diff) {
            System.out.println("Lowest difference in arrays are :- " + array2Diff);
        } else if (array2Diff < array1Diff) {
            System.out.println("Lowest diffreence in arrays are :- " + array1Diff);
        } else if (array1Diff == array2Diff) {
            System.out.println("Lowest difference between both arrays is " + array1Diff);



        }

    }
}