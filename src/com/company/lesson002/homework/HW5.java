package com.company.lesson002.homework;

import java.awt.*;
import java.util.Scanner;

//Логические условия
//Пользователь вводит информацию о квартире:
//1) цена
//2) кол-во комнат
//3) этаж (1-9)
// Проверить лог. условия
//1) Находится между 3-9 этажом и количество комнат больше 2
//2) не первый этаж и цена меньше 1500_000
//3) количество комнат больше 3 или цена не больше 1000_000
public class HW5 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double price;
        int room, floor;

        System.out.println(" Enter the number of floors");
        floor = console.nextInt();
        System.out.println(" Enter the number of room");
        room = console.nextInt();
        System.out.println(" Enter the number of price");
        price = console.nextDouble();

        if (2 < floor && floor < 10 && room > 2)
            System.out.println("->Находится между 3-9 этажом и количество комнат больше 2 ");
        if (floor != 1 && price < 1_500_000)
            System.out.println("->не первый этаж и цена меньше 1_500_000 ");
        if ( room >3 && price <= 1_000_000)
                   System.out.println("->количество комнат больше 3 или цена не больше 1_000_000 ");
                else System.out.println("nothing found");
    }
}