package com.dw.lessonjavacore.lesson.l10.HomeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeWork {


    public static void main(String[] args) {
        //taskOne();
        Phonebook phonebook = new Phonebook();
        phonebook.add("+7 222 222 22 22","Fray");
        phonebook.get("Ivanov");
        phonebook.get("Fray");

    }

    private static void taskOne() {
        List<String> listArray =
                Arrays.asList(
                        "May", "June", "Book",
                        "Table", "Cat", "Doc",
                        "Table", "Loop", "January",
                        "Table", "March", "January",
                        "April","February" );
        Set set = new HashSet();
        set.addAll(listArray);
        System.out.println(set);

        Map<String,Integer> map = new HashMap();
        for (int x = 0; x < listArray.size(); x++) {
            map.put(listArray.get(x), 0);
        }
        for (int x = 0; x < listArray.size(); x++) {
            map.put(listArray.get(x), map.get(listArray.get(x)) + 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() > 1){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        }
    }


}

