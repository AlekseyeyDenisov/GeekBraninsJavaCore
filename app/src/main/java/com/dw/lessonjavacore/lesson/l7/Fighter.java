package com.dw.lessonjavacore.lesson.l7;

public class Fighter {
    private String name;
    public  int health;
    public int damage;

    public Fighter(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void hit(Fighter another){
        try {


        System.out.printf("%s hits %s - %d\n",name,another.name,damage );
        another.health -= damage;
        Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public  boolean isAlive(){
      return health > 0;
    };
}
