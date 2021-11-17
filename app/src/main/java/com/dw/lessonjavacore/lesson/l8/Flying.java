package com.dw.lessonjavacore.lesson.l8;

@FunctionalInterface
public interface Flying {
    String SOME_TAPE_STRING = "sfvs sef sfg";
    void fly();
//Java 8+
    default void doSomethingDefault(){
        System.out.println("DEFAULT");
    }
}
