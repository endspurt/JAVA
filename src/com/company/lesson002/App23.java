package com.company.lesson002;

import java.util.Scanner;

// Целые типы данных
public class App23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte    a; // 1 byte - 8 bits = -128 .. 127
        short   b; // 2 byte - -32.... 32..
        int     c; // 4 byte - -2 миллиарда .. 2 миллиарда
        long    d; // 8 byte

        c = Integer.MAX_VALUE;
        System.out.println(c);

        c++;
        System.out.println(c);

        d = 125_453_442_14l;


        c = (int) d;

        System.out.println("Enter number");
        c = scanner.nextInt();
        System.out.println(c);
    }
}
