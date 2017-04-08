package com.company.lesson002;

import java.util.Scanner;

// Вещественные числа
public class App24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double  a; // 8 byte
        float   b; // 4 byte

        a = 1e300;
        a = 1e-300;

        a = 1.0/3.0;
        b = 1.0f/3.0f;

        System.out.println(a);
        System.out.println(b);

    }
}
