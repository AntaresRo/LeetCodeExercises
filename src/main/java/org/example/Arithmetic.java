package org.example;

class Arithmetic {
    protected int add (int first, int second) {
        return first + second;
    }
}

class Adder extends Arithmetic {
    @Override
    protected int add(int first, int second) {
        int result = first + second;
        System.out.println("My superclass is: Arithmetic");
        System.out.println(first + " " + second + " " + result );
        return super.add(first, second);
    }
}
