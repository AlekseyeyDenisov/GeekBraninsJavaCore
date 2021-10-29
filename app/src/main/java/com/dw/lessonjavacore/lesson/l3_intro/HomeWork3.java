package com.dw.lessonjavacore.lesson.l3_intro;


import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        gameNumber();
        gameString();
    }

    private static void gameString() {
        String[] array = getArrayString();
        int crypticIntWord = MyArrayUtils.randomExample(array.length - 1);
        String crypticWord = array[crypticIntWord];
        System.out.println(crypticWord);

        System.out.println("Отгадайте одно из заданных слов");
        MyArrayUtils.printArray(array);
        if (startGame(crypticWord))
            System.out.println("Вы отгадали");
    }

    private static Boolean startGame(String crypticWord) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userWord = scanner.next();
            if (userWord.equals(crypticWord)) {
                return true;
            } else {
               comparisonOfWords(crypticWord,userWord);
            }
        }
    }

    private static void comparisonOfWords(String crypticWord,String userWord) {
        char[] chars = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',};
        for (int i = 0; i < crypticWord.length(); i++) {
            if (crypticWord.charAt(i) == userWord.charAt(i)){
                chars[i] =  userWord.charAt(i);
            }
            else{
                System.out.println(chars);
                return;
            }
        }
    }


    private static String[] getArrayString() {
        return new String[]{
                "apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
    }

    private static void gameNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начнем игру.\n Отгадайте число от 0 до 9, Вам дается 3 попытки");
        while (true) {
            checkNumber();
            System.out.println("Повторить игру еще раз? \n 1 – да / 0 – нет");
            int result = scanner.nextInt();
            if (result != 1) return;
        }
    }

    private static boolean checkNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = MyArrayUtils.randomExample(9);
        //System.out.println(number);
        for (int i = 0; i < 3; i++) {
            int gameRound = i + 1;
            System.out.println("Попытка №" + gameRound);
            int result = scanner.nextInt();
            if (number == result) {
                System.out.println("Вы отгадали");
                return true;
            } else if (number < result) {
                System.out.println("Ваше число больше");
            } else System.out.println("Ваше число меньше");
            if (i == 2) System.out.println("Вы проиграли");
        }
        return true;
    }


}
