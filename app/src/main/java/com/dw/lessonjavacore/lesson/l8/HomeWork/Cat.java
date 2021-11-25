package com.dw.lessonjavacore.lesson.l8.HomeWork;

public class Cat implements Partaker {
    private int run;
    private int jump;
    private boolean partakerGame;

    public Cat(int run, int jump) {
        partakerGame = true;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void run(int a) {
        if (a > run) {
            System.out.println("Cat run left the race ");
            partakerGame = false;
            return;
        }
        System.out.printf("Cat run %s\n", a);

    }

    @Override
    public void jump(int a) {
        if (a > jump) {
            System.out.println("Cat run left the race ");
            partakerGame = false;
            return;
        }
        System.out.printf("Cat run %s\n", a);

    }

    @Override
    public boolean isPartakerGame() {
        return partakerGame;
    }
}
