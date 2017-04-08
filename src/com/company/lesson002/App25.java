package com.company.lesson002;

// Символы
public class App25 {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a);

        // 1) ASCII - 1 byte
        // 2) UNICODE - UTF16 - 2 byte
        // 3) UNICODE - UTF-8 - 1 byte | 2 byte


        System.out.println((int)a);
        a++;
        System.out.println(a);
        System.out.println((int)a);

        int b = 99;
        a = (char) b;
        System.out.println(a);
    }
}
