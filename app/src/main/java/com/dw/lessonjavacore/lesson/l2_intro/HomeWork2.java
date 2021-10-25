package com.dw.lessonjavacore.lesson.l2_intro;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        arrayIntegerReplace();
        fillTheArray();
        numberSelection();
        squareTwoIntegerArray(10);
        minimumMaximumElements();



    }

    private static void minimumMaximumElements() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int varMinimum = arr[0];
        int varMaximum = arr[0];
        for (int i = 0; i < arr.length; i++){
                if (varMinimum > arr[i]){
                    varMinimum = arr[i];
                }else if (varMaximum < arr[i]){
                    varMaximum = arr[i];
                }
        }
        System.out.println("Минимальное значение " + varMinimum);
        System.out.println("Максимальное значение " + varMaximum);
    }

    private static void squareTwoIntegerArray(int var) {
        int[][] array = new int[var][var];
        for (int x = 0, i = 0; x < array.length; x++, i++) {
            for (int y = 0; y < array[x].length; y++) {
                int rev = var - 1 - i;
                if (y == i || y == rev){
                    array[x][y] = 1;
                }else {
                    array[x][y] = 0;
                }
            }
        }
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

    private static void numberSelection() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("numberSelection before " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("numberSelection prepend " + Arrays.toString(arr));
    }

    private static void fillTheArray() {
        int[] arr = new int[8];
        System.out.print("fillTheArray ");
        for (int i = 0, ii = 0; i < arr.length; i++, ii += 3) {
            arr[i] = ii;
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    private static void arrayIntegerReplace() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("arrayIntegerReplace before " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println("arrayIntegerReplace prepend " + Arrays.toString(arr));
    }


}
