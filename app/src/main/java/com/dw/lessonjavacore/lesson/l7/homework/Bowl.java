package com.dw.lessonjavacore.lesson.l7.homework;

public class Bowl {
    public int footAmount;

    public void decreaseFood (int amount){
        footAmount -= amount;
        System.out.printf("Food decreased for %d, %d left\n", amount, footAmount);
    }

    public void  putFood(int amount){
        footAmount += amount;
        System.out.printf("Food increased for %d, %d now\n", amount, footAmount);
    }

}
