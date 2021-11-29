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

    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            String word = arr[i];
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }

        for (String s : arr) {
//            map.merge(s, 1, Integer::sum);
            map.merge(s, 1, (value1, value2) -> value1 + value2);
//            map.merge(s, 1, new BiFunction<Integer, Integer, Integer>() {
//                @Override
//                public Integer apply(Integer integer, Integer integer2) {
//                    return integer + integer2;
//                }
//            });
        }
        return map;
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

