package com.dw.lessonjavacore.lesson.l1_intro;

public class HelloWorld {

    public static void main(String[] args) {
        //printHelloWorld();
        //basicVariable();
        //arithmeticOps();
        //booleanConditions();
        //ifs();
        //System.out.println(calcSum(10,14));

        String s = "Hi" + " fff " + (14 + 14);
        System.out.println(s);

    }
    public static int calcSum (int a,int b){
        return a + b;
    }



    private static void ifs() {
        int a = 10;
        if (a < 20) System.out.println("one");
        else if(a < 50)  System.out.println("two");
        else if(a < 100)  System.out.println("three");
        else   System.out.println("noting");
    }

    private static void booleanConditions() {
        boolean b = (10*2) == 20;
        boolean b1 = (10*2) != 20;
        boolean b2 = 5<5;
        boolean b3 = 5>5 ;

        boolean logic= 2*3 < 14 && 10==10;
    }

    private static void arithmeticOps() {
        int a = 2+2-2*2/3;
        int b = 11 % 3;//остаток 2
        int a2 = 1;
        a++;
        ++a;
        a--;
        --a;
    }

    private static void basicVariable() {
        byte byteVAr = 99; //8 bit
        short shortVar = 512; //16 bit
        int integerVar = 2_110_000_000; //32 bit
        long longVar = 2_510_000_000L;//64 bit

        double doubleVar = 10.87777; //64 bit
        float floatVar = 0.21F; //32 bit

        boolean booleanVar = true; // false

        char charVar = 70;  // 0..6535
        char charVar2 = 'Q';
        char charVar3 = '\u0000';
        char charVar4 = '\u2235';

        String stringVar = new String("Some text");
        String s = "My super string";


        System.out.println(s);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }


}
