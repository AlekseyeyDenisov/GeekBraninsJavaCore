package com.dw.lessonjavacore.lesson.l8.HomeWork;

public class Robot implements Partaker {
    private int run;
    private int jump;
    private boolean partakerGame;

    public Robot(int run, int jump) {
        partakerGame = true;
        this.run = run;
        this.jump = jump;
    }


    @Override
    public void run(int a) {
        if (a > run) {
            System.out.println("Robot run left the race ");
            partakerGame = false;
            return;
        }
        System.out.printf("Robot run %s\n", a);
    }

    @Override
    public void jump(int a) {
        if (a > jump) {
            System.out.println("Robot jump left the race ");
            partakerGame = false;
            return;
        }
        System.out.printf("Robot jump %s\n", a);

    }

    @Override
    public boolean isPartakerGame() {
        return partakerGame;
    }
}
