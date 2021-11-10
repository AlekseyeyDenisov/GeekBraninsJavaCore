package com.dw.lessonjavacore.lesson.l6;

public abstract class Animal {
    protected String name;
    public abstract void run(int length);
    //public abstract void swim(int length);

    public Animal(String name) {
        this.name = name;

    }



}
