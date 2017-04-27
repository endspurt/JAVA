package com.company.lesson002.homework;


// Текстовая-игра
// Есть жизни героя и жизни пративника
// пользователю предлагается действия
// 1) Показать информацию о герое
// 2) Показать информацию о пративнике
// 3) Ударить противника, урон (10-20), но тогда и противник ударит тебя(20-30)
// 4) Выпить зелье, восстанавливает здоровье до 100
// 5) ударить, но укланиться за щитом, герой наносит (10-20), есть вероятность 70% укланиться от удара,
// но если герой не уклонился он получает увеличенный урон 2
// Если убили героя, написать вы проиграли, если убили противника, написать пративник мертв

import java.awt.image.SampleModel;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

import static java.lang.Math.*;


public class HW6 {

    public static void main(String[] args) {


        int Samuray = 100;
        int Ninya = 100;
        int probaPercent, damagePercentEnemy, damagePercentOwn, punch;


        System.out.println("Показать информацию о герое Samuray: " + Samuray + "Unit");
        System.out.println("Показать информацию о пративнике Ninya: " + Ninya + "Unit");

        Scanner console = new Scanner(System.in);
        System.out.println("Ударить противника?");
        punch = console.nextInt();

        if ( punch ==1){
            damagePercentEnemy=0;
            Random damage = new Random();
            damagePercentEnemy = damage.nextInt(12) + 9;
            System.out.println("герой наносит урон: " + damagePercentEnemy + " Unit");
            //Samuray -= damagePercentOwn;

            damagePercentOwn=0;
            Random damage2 = new Random();
            damagePercentOwn = damage2.nextInt(12) + 19;
            System.out.println("противник наносит урон: " + damagePercentOwn + " Unit");
            //Ninya-=damagePercentEnemy;


        }

        Random probability = new Random();
        probaPercent = probability.nextInt(101);
        System.out.println("вероятность укланиться от удара: " + probaPercent + "%");

        System.out.println();


        }
    }






