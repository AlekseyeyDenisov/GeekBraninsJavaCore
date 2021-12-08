package com.dw.lessonjavacore.lesson.l13MultiThread_v2.homeWorck;

public abstract class Stage {
    protected int length;
    protected String description;

    public	 String getDescription(){return description;
    }
    public abstract	 void go(Car c);
}

