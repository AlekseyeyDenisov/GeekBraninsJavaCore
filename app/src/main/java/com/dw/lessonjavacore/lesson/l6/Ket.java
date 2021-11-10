package com.dw.lessonjavacore.lesson.l6;

public class Ket extends Animal {
    private static int counter;
    private int maxRun = 200;

    public Ket(String name) {
        super(name);
        counter++;
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


    public  int getNumKet() {
        return counter;
    }
}
