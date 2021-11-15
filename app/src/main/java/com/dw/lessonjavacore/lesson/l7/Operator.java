package com.dw.lessonjavacore.lesson.l7;

public enum Operator {
    ADD{
        public int operation(int x, int y){
         return x + y;
        }
    },
    MUL{
        public int operation(int x, int y){
            return x * y;
        }
    };

    public abstract int operation(int x, int y);
}
