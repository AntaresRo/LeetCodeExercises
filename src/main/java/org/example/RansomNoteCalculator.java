package org.example;

public class RansomNoteCalculator {

    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder tempString = new StringBuilder(ransomNote);
        return magazine.contains(ransomNote) || magazine.contains(tempString.reverse().toString());
    }

}
