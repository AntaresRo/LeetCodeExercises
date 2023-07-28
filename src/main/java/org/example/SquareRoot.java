package org.example;

public class SquareRoot {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int guessedNumber = x;
        for (int i = x; i >=0; i--){
            guessedNumber = (guessedNumber + x/guessedNumber)/2;
        }
        return guessedNumber;
    }
}
