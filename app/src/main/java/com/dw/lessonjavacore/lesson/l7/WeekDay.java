package com.dw.lessonjavacore.lesson.l7;

public enum WeekDay {
    MONDAY(1,"Понедельник"),
    TUESDAY(2,"Вторник"),
    WEDNESDAY(3,"Среда"),
    THURSDAY(4,"Четверг"),
    FRIDAY(5,"Пятница"),
    SATURDAY(6,"Суббота"),
    SUNDAY(6,"Воскресенье");

    private  int dayNumber;
    private String russianName;


    WeekDay(int dayNumber, String russianName) {
        this.dayNumber = dayNumber;
        this.russianName = russianName;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public String getRussianName() {
        return russianName;
    }
}
