package com.dw.lessonjavacore.lesson.l1_intro;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Задание №1 " +jobOne(2,3,4,2));
        System.out.println("Задание №2 " +jobTwo(12,5));
        jobThree(-13);
        System.out.println("Задание №4 " +jobFour(-5));
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
        String jobNumber = "Задание №3 ";
        if (a >= 0){
            System.out.println(jobNumber +"Положительное  число");
            return;
        }
        System.out.println(jobNumber +"Отрицательное  число");
    }
    public static boolean jobFour(int a){
        return a >= 0;
    }

    public static void jobFive(String name){
        String jobNumber = "Задание №5 ";
        System.out.println(jobNumber +"«Привет "+ name + "!»");
    }

    public static void jobSix(int year){
        String jobNumber = "Задание №6 ";
        if (year % 4 == 0 && !(year % 100 == 0 && !(year % 400 == 0)))
            System.out.println(jobNumber + "Год високосный");
        else
            System.out.println(jobNumber + "Год не високосный");
    }


}
