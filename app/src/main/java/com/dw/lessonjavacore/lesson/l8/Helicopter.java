package com.dw.lessonjavacore.lesson.l8;

public class Helicopter implements Flying {
    @Override
    public void fly() {
        System.out.println("Верталет летит");
    }

    @Override
    public void doSomethingDefault() {
        //Flying.super.soSomethingDefault();
        System.out.println(" NO DEFAULT");
    }
}
