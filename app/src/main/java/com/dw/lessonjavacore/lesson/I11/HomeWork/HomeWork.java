package com.dw.lessonjavacore.lesson.I11.HomeWork;


import java.util.ArrayList;
import java.util.Arrays;


public class HomeWork {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4,5,6};
        //swapsElementsArray(array);
        //convertArrayToList(array);

        Apple[] apples = {
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple()
        };
        Orange[] oranges = {
          new Orange(),
          new Orange(),
          new Orange(),
          new Orange()
        };
        Box<Apple> appleBox = new Box<>(apples);
        appleBox.addFruit(new Apple());

        System.out.printf("вес коробки с яблокоми  %s\n", appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>(oranges);
        orangeBox.addFruit(new Orange());

        System.out.printf("вес коробки с апельсинами  %s\n", orangeBox.getWeight());


        System.out.printf("веса коробок   %s\n", orangeBox.compare(orangeBox));

        Box<Apple> appleBox1 = new Box<>();

        appleBox1.pour(appleBox);
        System.out.printf("вес новой коробки с яблокоми  %s старая коробка %s\n",
                appleBox1.getWeight(),
                appleBox.getWeight()
                );





    }





    private static void swapsElementsArray(Integer[] array) {
        for (int i = 0; i < array.length ; i+=2){
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;

        }
        System.out.println(Arrays.toString(array));
    }

    private static <T> ArrayList<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
