package com.dw.lessonjavacore.lesson.l8.HomeWork;

public class Human implements Partaker {
    private int run;
    private int jump;
    private boolean partakerGame;

    public Human(int run, int jump) {
        partakerGame = true;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public boolean isPartakerGame() {
        return partakerGame;
    }

    @Override
    public void run(int a) {
        if (a > run) {
            System.out.println("Human run left the race ");
            partakerGame = false;
            return;
        }
        System.out.printf("Human run %s\n", a);

    }

    @Override
    public void jump(int a) {
        if (a > jump) {
            System.out.println("Human jump left the race ");
            partakerGame = false;
            return;
        }
        System.out.printf("Human jump %s\n", a);

    }
}
