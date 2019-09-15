package string.problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        st = st.toLowerCase();

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : st.split(" ")) {

            int i = map.getOrDefault(word, 0);
            map.put(word, i + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Duplicate words and occurrences:");
        for (String key : map.keySet()) {

            list.add(key.length());
            if (map.get(key) > 1)
                System.out.println(key + " " + map.get(key));

        }
        Integer sum = 0;
        for (Integer length : list) {
            sum += length;
        }
        int average = sum / list.size();

        System.out.println("The average length of the words is: " + average);
    }
}

