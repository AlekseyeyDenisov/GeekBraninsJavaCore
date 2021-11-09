package com.dw.lessonjavacore.lesson.l5;

public class Person {
    private String lastnameName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String lastnameName, String position, String email, String phone, int salary, int age) {
        this.lastnameName = lastnameName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print(){
        System.out.println("ФИО: " +lastnameName);
        System.out.println("Email: " +email );
        System.out.println("Телефон: " +phone );
        System.out.println("Зарплата: " +salary );
        System.out.println("Возраст: " +age );
    }

    public int getAge() {
        return age;
    }
}
