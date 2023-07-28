package org.example;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int lastDigit = digits.length - 1;


        if (digits[lastDigit] < 9) {
            digits[lastDigit] += 1;
            return digits;
        }

        for (int i = lastDigit; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] lengthyArray = new int[digits.length + 1];
        lengthyArray[0] = 1;
        return lengthyArray;

    }
}
