package com.company.lesson002;

// Boolean
public class App26 {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        // < > <= >= != ==
        // && || !

        double d1 = 1.0/3.0;
        double d2 = 1.0/3.0 + 1e-300;

        double eps = 1e-9;

        boolean test = Math.abs(d1 - d2) <= eps;

        System.out.println(test);

    }
}
