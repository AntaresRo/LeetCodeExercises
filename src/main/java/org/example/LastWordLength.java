package org.example;

public class LastWordLength {

    public static int lengthOfLastWord(String s) {
        String [] words = s.split("\\W+");
        return words[words.length -1].length();

    }
}
