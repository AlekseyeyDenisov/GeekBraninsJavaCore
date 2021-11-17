package com.dw.lessonjavacore.lesson.l8;

import java.util.Arrays;
import java.util.Comparator;

public class Classwork {
    public static void main(String[] args) {
        //simplePoleInterface();
        //simpleAnonymousExample();
        //interfaceExample();
        //lambdaExample();
        //lambdasExample();

        System.out.println(Flying.SOME_TAPE_STRING);
        Swain swain = new Swain();
        swain.doSomethingDefault();
        Helicopter helicopter = new Helicopter();
        helicopter.doSomethingDefault();




    }

    private static void lambdasExample() {

        String [] strings = {"January","February","March", "April"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.length() - t1.length();
            }
        });

        Arrays.sort(strings,(s1,s2)->s1.length() - s2.length());
    }

    private static void lambdaExample() {

        Summator sum = new Summator();
        calc(22,33,sum);

        calc(10, 5, new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a / b;
            }
        });

        calc( 6, 14, (x,y)-> x * y);
    }

    public static  void calc(int a, int b, Calculator calculator){
        System.out.printf("Calculating...\n a = %d, b = %d result = %d\n",
                a, b, calculator.calculate(a,b));
    }

    private static void interfaceExample() {
        Flying[] flyings = {
                new Balloon(),
                new Helicopter(),
                new Swain(),
                new Flying() {
                    @Override
                    public void fly() {
                        System.out.println("Anonymous fly");
                    }
                },
                () -> System.out.println("Lambda fly")
        };

        for (Flying flying: flyings){
            flying.fly();
            if (flying instanceof Marker){
                System.out.println("Marker found");
            }
//            System.out.println(flying instanceof Flying);
//            System.out.println(flying instanceof Helicopter);

        }

//        Marker m = new Marker(){};
//        System.out.println(m);

    }

    private static void simpleAnonymousExample() {
        //все остальные методы и поля безсмыслены
        Flying anon = new Flying(){
            @Override
            public void fly() {

            }
        };
    }

    private static void simplePoleInterface() {
        Flying swan = new Swain();
        if (swan instanceof Moving){
            Moving m = (Moving) swan;
            m.crawl();
            m.walk();
            m.run();
        }
    }
}
