package com.dw.lessonjavacore.lesson.l10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class WorkClass {
    public static void main(String[] args) {
        //listsExample();
        //setExample();
        hashMapExample();



    }

    private static void hashMapExample() {
        Map<String,Integer> map = new HashMap<>();
        //Map<String,Integer> map = new LinkedHashMap<>();//сохраняет порядок добавление
        //Map<String,Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        //map.put("A", 4);
        map.putIfAbsent("A", 4);
       // map.forEach((k,v)-> System.out.println(k + ": " + v));
//        for (Map.Entry entry : map.entrySet()){
//            System.out.println(entry.getKey() + ": "+ entry.getValue());
//        }


        System.out.println(map.get("C"));
        System.out.println(map.get("W"));
        System.out.println(map.getOrDefault("W",99));
        System.out.println(map);
    }

    private static void setExample() {
        //Set<String> set = new HashSet<>();//map
        //Set<String> set = new LinkedHashSet<>();//сохраняет порядок сохранение объектов map
        Set<String> set = new TreeSet<>();//нельзя null,сортировка
        set.add("January");
        set.add("February");
        //set.add(null);
        set.add("March");
        set.add("January");
        //set.add(null);
        System.out.println(set);
//         set.remove("February");
//        System.out.println(set);

//        for (String s : set){
//            System.out.println(s);
//
//        }
//        set.forEach(s->System.out.println(s));
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }

    private static void listsExample() {
        List<String> list = new ArrayList<>();
        //List<String> list = new LinkedList<>();//как стэк
        //List<String> list = new Vector<>();//Устраревший
        list.add("January");
        list.add("February");
        list.add(null);
        list.add("March");
        list.add("January");
        list.add(null);

        list.add(2, "April");
        list.addAll(Arrays.asList("May", "June"));
        list.remove(3);
        list.remove("January");
        list.set(4, "September");
        //System.out.println(list.get(5));
        //System.out.println(list.indexOf("January"));

        list.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s + " month";
            }
        });

//        for (int i = 0; i< list.size(); i++){
//
//            System.out.println(list.get(i));
//        }

//        for (String s: list){
//            System.out.println(s);
//        }
//        Iterator iterator = list.iterator();

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.remove();
//
//
//        }

//        ListIterator iter = list.listIterator();
//        while (iter.hasNext()){
//            iter.next();
//            iter.set("SSSS");
//        }
        // list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);

        //System.out.println(list);
    }
}
