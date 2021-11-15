package com.dw.lessonjavacore.lesson.l7;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Classwork {
    public static void main(String[] args) {
        //stringBuilderExample();
        //bigNumbers();
        //catsBowls();
        //fightExample();
        //simpleEnumExample();
        //enumExample();
        //localInnerAndNesterExample();


    }

    private static void localInnerAndNesterExample() {
        Frog frog = new Frog();
        Frog.Head head1 = frog.getHead();
        //Frog.Head head2 = new Frog().Head;
        Frog.Head head3 = frog.new Head();
        Frog.Head head4 = new Frog().new Head();
        //Frog.Paw paw2 = frog.new Paw();

        Frog.NestedClassExample nestedClassExample = new Frog.NestedClassExample("Some");
        nestedClassExample.doSomething(frog);

        class LocalExample{
            public String name;
        }
    }

    private static void enumExample() {
        Operator op = Operator.ADD;
        System.out.println(op.operation(20,55));
        op = Operator.MUL;
        System.out.println(op.operation(5,9));
    }

    private static void simpleEnumExample() {
        WeekDay day = WeekDay.FRIDAY;
        System.out.println(day);
        System.out.println(day.ordinal());
        WeekDay day2 = WeekDay.FRIDAY;
        System.out.println(day == day2);
        System.out.println(day.getDayNumber());
        System.out.println(day.getRussianName());
    }


    private static void fightExample() {
        Fighter suZero = new Fighter("Sub Zero", 100, 10);
        Fighter scorpion = new Fighter("Sub Zero", 120, 8);

        while (true){
            scorpion.hit(suZero);
            if (!suZero.isAlive()){
                System.out.println("Sub Zero dead");
                break;
            }
            suZero.hit(scorpion);
            if (!scorpion.isAlive()){
                System.out.println("scorpion  dead");
                break;
            }
        }
    }

    private static void catsBowls() {
        Cat[] cats = {
                new Cat("Barsik",50),
                new Cat("Murzik",100),
                new Cat("Vaska",300)
        };

        Bowl bowl = new Bowl();
        bowl.putFood(500);
        for (Cat cat: cats){
            cat.eat(bowl);
        }
    }

    private static void bigNumbers() {
        BigInteger bi = new BigInteger("516516545");
        BigDecimal bd = new BigDecimal("654468464654.55");
    }

    private static void stringBuilderExample() {
        String s1 = "Example";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 300_000; i++ ){
            s1+=i;
        }
        long delta = System.currentTimeMillis() - startTime;
        System.out.println(delta);

        StringBuilder sb = new StringBuilder("Example");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 300_000; i++ ){
            sb.append(i);
        }
        delta = System.currentTimeMillis() - startTime;
        System.out.println("SB time "+delta);

        System.out.println(s1.equals(sb.toString()));

        StringBuffer sbufer = new StringBuffer("Example");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 300_000; i++ ){
            sbufer.append(i);
        }
        delta = System.currentTimeMillis() - startTime;
        System.out.println("sbufer time "+delta);
    }
}
