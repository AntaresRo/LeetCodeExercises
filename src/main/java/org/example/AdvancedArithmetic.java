package org.example;

public interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    sum += i;
                } else {
                    sum += i + (n / i);
                }
            }
        }

        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(sum);
        return sum;
    }
}
