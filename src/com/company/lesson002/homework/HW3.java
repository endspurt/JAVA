package com.company.lesson002.homework;

import java.util.Scanner;

// Вещественные числа
// https://ru.wikipedia.org/wiki/%D0%93%D1%80%D0%B0%D0%B2%D0%B8%D1%82%D0%B0%D1%86%D0%B8%D1%8F
// Запрограммировать рассчет гравитации
// можно использовать массу Земли и Луны и растояние между ними
public class HW3 {

    public static void main(String[] args) {

        double earth = 5.972e24;
        double moon = 7.348e22;
        double distance = 3844e5;
        double G = 6.67e-11;
        double F =0;

        F= (G * earth*moon)/(distance*distance);

        System.out.println("Gravity:"+F+" N");


        // erde 5,972 × 10^24 kg
        // mond 7,348 * 10^22 kg
        // entfernung 384.400 km
        // G=6,67*10^-11 m^3/kg*sec^2
        // F= G * (m1*m2)/ r*r





    }



}


