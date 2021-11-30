package com.dw.lessonjavacore.lesson.I11.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Box<T extends Fruit> {

    private ArrayList<T> box;


    @SafeVarargs
    public Box(T... fruits) {
        this.box = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;

        for (T fruit : box) {

            weight += fruit.getWeight();
        }

        return weight;
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public boolean compare(Box<?> other) {
        return Math.abs(this.getWeight() - other.getWeight()) < 0.001;
    }

    public void pourTo(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }
}
