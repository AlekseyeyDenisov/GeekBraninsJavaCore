package com.dw.lessonjavacore.lesson.l8;

public class Swain implements Flying, Moving{

    @Override
    public void fly() {
        System.out.println("Лебедь летает");
    }

    @Override
    public void walk() {
        System.out.println("Лебедь ходит");
    }

    @Override
    public void run() {
        System.out.println("Лебедь бежит");
    }

    @Override
    public void crawl() {
        System.out.println("Лебедь не может ползти");
    }
}
