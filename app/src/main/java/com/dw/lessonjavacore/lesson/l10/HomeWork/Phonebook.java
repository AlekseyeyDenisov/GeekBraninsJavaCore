package com.dw.lessonjavacore.lesson.l10.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String,String> baseUser;

    public Phonebook() {
        Map<String,String> baseUser = new HashMap<>();
        baseUser.put("+7 111 111 11 11", "Ivanov");
        baseUser.put("+7 111 111 11 12", "Petrov");
        baseUser.put("+7 111 111 11 13", "Ivanov");
        baseUser.put("+7 111 111 11 14", "Bender");
        baseUser.put("+7 111 111 11 15", "Fray");
        baseUser.put("+7 111 111 11 16", "Bender");
        this.baseUser = baseUser;
    }
    public void add(String phone,String lastName){
        baseUser.put(phone, lastName);
    }
    public void get(String lastName){
        for (Map.Entry entry : baseUser.entrySet()) {
            if (entry.getValue() == lastName){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        }
    }
}
