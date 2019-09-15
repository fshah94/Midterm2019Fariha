package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = getTheLargestWord(s);

        //implement

        for (Map.Entry entry : wordNLength.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

    public static Map<Integer, String> getTheLargestWord(String word){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] s = word.split(" ");

        //implement

        String largestWord = "";
        for (int i =0; i < s.length; i++) {
            if (s[i].length() > largestWord.length())
                largestWord = s[i];
        }
        System.out.println("Size of largest word and the word: ");
        map.put(largestWord.length(), largestWord);
        return map;
    }
}

