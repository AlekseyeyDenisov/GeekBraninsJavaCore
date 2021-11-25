package com.dw.lessonjavacore.lesson.l8.HomeWork;

public class HomeWork {

    public static void main(String[] args) {

        Let[] lets = {
                new Wall(1),
                new Treadmill(50),
                new Wall(2),
                new Wall(3),
                new Treadmill(100),
                new Wall(4),
                new Treadmill(140),
                new Wall(5),
                new Treadmill(200),
        };
        Partaker[] partakers = {
                new Cat(110,2),
                new Robot(260,3),
                new Human(110,1),
        };

        for (Let let: lets){
            for (Partaker partaker : partakers){
                if (partaker.isPartakerGame()){
                    if (let instanceof Wall)  {
                        partaker.jump(let.size());
                    }else
                    if  (let instanceof Treadmill){
                        partaker.run(let.size());
                    }
                }

            }
        }

    }
}
