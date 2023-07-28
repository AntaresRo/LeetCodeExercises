package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {




    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
          sumFirstDiagonal +=  arr.get(i).get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            sumSecondDiagonal += arr.get(i).get(arr.size() - i - 1);

        }
        return sumFirstDiagonal - sumSecondDiagonal;
    }


    public int romanToInt(String input) {
        char [] chars = input.toCharArray();
        int sum = 0;


        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && romanToInt(chars[i]) < romanToInt(chars[i + 1])) {
                sum -= romanToInt(chars[i]);
            } else {
                sum += romanToInt(chars[i]);
            }
        }

        return sum;
    }

    private int romanToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };

    }


}