package com.dw.lessonjavacore.lesson.l5;

public class HomeWork5 {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Director", "ivivan@mailbox.com", "892312312", 60000, 50);
        persArray[1] = new Person("Petrov Petr", "Engineer", "petrov@mailbox.com", "892312323", 50000, 35);
        persArray[2] = new Person("Loginov Dmitry", "Driver", "loginov@mailbox.com", "892312334", 30000, 42);
        persArray[3] = new Person("Blinov Andrey", "Engineer", "blinov@mailbox.com", "892312345", 50000, 37);
        persArray[4] = new Person("Voronov Viktor", "Driver", "voronov@mailbox.com", "892312356", 30000, 48);

        printPersonOlderInt(persArray,40);

    }

    private static void printPersonOlderInt(Person[] persArray, int age) {
        for (int i = 0; i < persArray.length; i++ ){
        //for (Person )
            if (persArray[i].getAge() > age){
                persArray[i].print();
            }
        }
    }
}
