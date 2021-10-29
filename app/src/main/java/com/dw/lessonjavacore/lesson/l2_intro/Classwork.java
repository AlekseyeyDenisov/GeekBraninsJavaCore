package com.dw.lessonjavacore.lesson.l2_intro;

import java.util.Arrays;

public class Classwork {
    public static void main(String[] args) {
        //vendingSWitch(2);
        //whilePre();
        whilePost();
        //simpleForExample();
        //simpleArr();
        //foreachExample();
        //stringArray();

        //int[][] arr = new int[3][3];
        int[][] arr = new int[3][];
        arr[0] = new int[10];
        arr[1] = new int[2];
        arr[2] = new int[5];

        arr[1][1] = 5;

//        int[][] array = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        int[][] array = {
                {1, 2, 3,4,5,6,7,8},
                {4, 5, 6},
                {7, 8, 9,1,2,9,4,9}
        };
        //System.out.println(Arrays.toString(array));
        print2dArray(array);
    }

    public static void print2dArray(int[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y]);
            }
            System.out.println();
        }

    }

    private static void stringArray() {
        String[] strings = {
                "January",
                "February",
                "March",
                "April"
        };
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(Arrays.toString(strings));

    }

    private static void foreachExample() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {

        }
    }

    private static void simpleArr() {

        int a1 = 10;
        int a2 = 20;
        int a3 = 30;
        int a4 = 40;
        int a5 = 50;

        int arr[];
        arr = new int[5];
        arr[0] = a1;
        arr[1] = a2;
        arr[2] = a3;
        arr[3] = a4;
        arr[4] = a5;

        arr[2] = arr[4] + arr[3];
        System.out.println(arr[2]);

        //int[] arr2 = {}; // new int[0];
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // new int[9];

        //System.out.println( arr2.length);
        //System.out.println( arr2.length);
        printArray(arr2);
        printArrayReversed(arr2);

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] * 3;
        }
        printArray(arr2);

        for (int i = 0; i < arr2.length; i += 3) {
            arr2[i] = arr2[i] / 5;
        }
        printArray(arr2);

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 15) {
                arr2[i] = arr2[i] %= 2;
            }
        }
        printArray(arr2);
    }

    public static void printArrayReversed(int[] arr) {

        System.out.print("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void printArray(int[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    private static void simpleForExample() {

        //Инициализация               ;  условия                  ;  Итерация
        for (int i = 0, j = 10, k = 20; i < 10 && j > 0 && k < 100; i++, j--, k *= 1.5) {
            System.out.printf("i = %d, k = %d, k = %d\n", i, j, k);
            /*
             * %d - integers
             * %f - float
             * %b - boolean
             * %c - character
             * %s - string (universal)
             */
            /*
             */
        }

    }

    private static void whilePost() {
        int a = 1;
        do {
            System.out.println(a++);
        } while (a < 11);
    }

    private static void whilePre() {
        int a = 1;

        //while (a < 11){
//        while (true){
//            System.out.println(a++);
//            if (a == 15 ) break;
//        }
        someLabel:
        // лучше не пользоваться

        while (a <= 10) {
            System.out.print(a++ + ":  ");
            int j = 1;
            while (j < 20) {
                System.out.print(j + " ");
                j *= 2;
                if (j == 4) break someLabel;

            }
            System.out.println();
        }
    }

    public static void vendingSWitch(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Give Coca-cola");
                break;
            case 2:
                System.out.println("Give Pepsi");
                break;
            case 3:
                System.out.println("Give Snickers");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Give MArs");
                break;
            default:
                System.out.println("ERROR");
        }

    }
}
