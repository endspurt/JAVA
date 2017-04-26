package com.company.lesson002.homework;

import java.util.Scanner;

import java.text.DateFormat;

// Целые числа
// Пользователь вводит с клавиатуры количество евро и стоимость товара
// Расчитать сколько можно купить товара и сколько останется сдача
public class HW2 {

    public static void main(String[] args) {

        double money, price, article, buy, balannce;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter money");
        money = console.nextDouble();

        System.out.println("Enter price");
        price = console.nextDouble();

        buy = money / price ;
        article = (int) buy;
        System.out.println("Total: " + article+ "Unit");
        balannce = buy-article;
        System.out.printf("Balance: %.2f %s" , balannce, "$/€");// xotel format sdelat'
    }
}
