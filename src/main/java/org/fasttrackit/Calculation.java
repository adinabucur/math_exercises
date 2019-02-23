package org.fasttrackit;

public class Calculation {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int sum2(int x, int y) {
        return x + y;
    }


    public static void main(String[] args) {
        System.out.println(sum(6, 10));
        System.out.println(division(100, 4));
        System.out.println(multiplication(5, 7));
        int z = sum2(52, 64);
        System.out.println(z);
    }
}






