package com.dw.lessonjavacore.lesson.l7.homework;

public class Homework {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Vaska", 300),
                new Cat("Murzik", 100),
        };

        Bowl bowl = new Bowl();
        bowl.putFood(150);

        for (Cat cat : cats) {
            cat.eat(bowl);
            if (cat.isHunger()){
                System.out.printf("%s сыт\n", cat.getName());
            }else   {
                System.out.printf("%s остался голодным\n", cat.getName());
                bowl.putFood(cat.getAppetite());
            }
        }
    }
}
