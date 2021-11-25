package com.dw.lessonjavacore.lesson.l8.HomeWork;

public class Treadmill implements Let {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public int size() {
        return length;
    }
}
