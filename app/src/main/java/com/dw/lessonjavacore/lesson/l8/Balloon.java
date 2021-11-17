package com.dw.lessonjavacore.lesson.l8;

public class Balloon implements Flying, Marker{
    @Override
    public void fly() {
        System.out.println("Шарик летит");
    }
}
