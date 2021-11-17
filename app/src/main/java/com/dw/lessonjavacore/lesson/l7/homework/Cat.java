package com.dw.lessonjavacore.lesson.l7.homework;

public class Cat {
    private String name;
    private int appetite;
    private boolean hunger = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public  void eat(Bowl bowl){
        if (bowl.footAmount > appetite){
            bowl.decreaseFood(appetite);
            hunger = true;
        }

    }
    public boolean isHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
