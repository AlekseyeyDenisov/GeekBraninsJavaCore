package com.dw.lessonjavacore.lesson.l6;


public class Dog extends Animal {
    private static int counter;

    private int maxRun = 500;
    private int maxSwim = 10;

    public Dog(String name) {
        super(name);
        counter++;
    }

    public int getNumDog() {
        return counter;
    }


    @Override
    public void run(int length) {
        if (length > maxRun) {
            System.out.printf("%s неможет так далеко бежать", name);
        } else if (length < 0) {
            System.out.printf("%s неможет бежать назад", name);
        } else {
            System.out.printf("%s пробежал %s", name, length);
        }
        System.out.println("");

    }

    public void swim(int length) {
        if (length > maxSwim) {
            System.out.printf("%s неможет так далеко плыть", name);
        } else if (maxSwim < 0) {
            System.out.printf("%s неможет плыть назад", name);
        } else {
            System.out.printf("%s плывет %s", name, length);
        }
        System.out.println("");
    }
}
