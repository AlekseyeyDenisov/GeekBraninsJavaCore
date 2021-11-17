package com.dw.lessonjavacore.lesson.l8.HomeWork;

public class Wall implements Let {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int size() {
        return height;
    }
}
