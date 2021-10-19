package com.dw.lessonjavacore.lesson.l1_intro;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Первое задание: " +jobOne(2,3,4,2));
        System.out.println("Второе задание: " +jobTwo(12,5));
        jobThree(-13);
        System.out.println("Второе четвертое: " +jobFour(-5));
        jobFive("Василий");
        jobSix(500);
    }

    public static float jobOne (
            float a,
            float b,
            float c,
            float d){
        return a * (b + (c / d));
    }

    public  static boolean jobTwo(int a, int b){
        int result = a + b;
        return result >= 10 && result <= 20;
    }

    public static void jobThree (int a){
        if (a >= 0){
            System.out.println("Положительное  число");
            return;
        }
        System.out.println("Отрицательное  число");
    }
    public static boolean jobFour(int a){
        return a >= 0;
    }

    public static void jobFive(String name){
        System.out.println("«Привет "+ name + "!»");
    }

    public static void jobSix(int year){
        if (year % 4 == 0 && !(year % 100 == 0 && !(year % 400 == 0)))
            System.out.println("Год високосный");
        else
            System.out.println("Год не високосный");
    }

}
