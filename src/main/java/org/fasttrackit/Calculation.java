package org.fasttrackit;

public class Calculation {

    public static int sum(int x, int y) {
        return x + y;
    }
    public static  double sum (double x, double y){
        return x+y;
    }


    public static double multiplication(double a, double b) {
        return a * b;
    }
    public  static int multiplication (int a, int b){
        return a*b;
    }

    public static int division(int x, int y) {
        return x / y;
    }
    public static double division(double x, double y) {
        return x / y;
    }

    public static int sum2(int x, int y) {
        return x + y;
    }
    public static double sum2(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(sum(6, 10));
        System.out.println(sum(10.34,15.63));

        System.out.println(multiplication(3.2, 7.98));
        System.out.println(multiplication(5, 7));


        System.out.println(division(100, 4));
        System.out.println(division(10.2, 2.5));


        int z = sum2(52, 64);
        System.out.println(z);

        double t = sum2(13.33,12.66);
        System.out.println(t);
    }
}






