package com.dw.lessonjavacore.lesson.l6;

public class Homework {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Bobik");
        Dog dogBarbos = new Dog("Barbos");
        Ket ketMurka = new Ket("Murka");
        Ket ketVaska = new Ket("Vaska");
        Ket ketRed = new Ket("Vaska");

        dogBarbos.run(200);
        dogBarbos.swim(5);
        ketVaska.run(250);
        System.out.println("Количество сабак "+ dogBobik.getNumDog() );
        System.out.println("Количество кошек "+ ketMurka.getNumKet() );

    }
}
