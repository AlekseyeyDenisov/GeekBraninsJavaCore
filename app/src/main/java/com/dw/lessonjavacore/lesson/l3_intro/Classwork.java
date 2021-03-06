package com.dw.lessonjavacore.lesson.l3_intro;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Classwork   {


    public static void main(String[] args) throws FileNotFoundException {
        //varsAndUtils();
        randomExample();
        //castExample();
        //scannerReadString();
        //ScannerReadNumber();
        //canerReadTextFileExample();
        //stringsComparing();



    }

    private static void stringsMethodExample() {
        stringsMethodExample();
        String s = "Hello world!";
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(8));
        System.out.println(s.contains("wor"));
        System.out.println(s.indexOf("wor"));
        System.out.println(s.startsWith("Hel"));
        System.out.println(s.endsWith("d!"));
        String[] splitted = s.split(" ");
        System.out.println(Arrays.toString(splitted));

        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }

    private static void stringsComparing() {
        Scanner scanner = new Scanner(System.in);
        String s1 = "Hi";
        String s2 = "Hi";
        String s3 = new String("Hi");
        String s4 = new String(s1);
        String s5 = "H";
        String s6 = "i";
        String s7 = s5 + s6;
        char[] chars = {'H','i'};
        String s8 = new String(chars);
        String s9 = new String(new byte[]{72,105}).intern();
        String s10 = scanner.next().intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s7);
        System.out.println(s1 == s8);
        System.out.println(s1 == s9);
        System.out.println(s1 == s10);


//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(s4));
//        System.out.println(s1.equals(s7));
//        System.out.println(s1.equals(s8));
//        System.out.println(s1.equals(s9));
//        System.out.println(s1.equals(s10));
    }

    private void canerReadTextFileExample() {
        File file = new File("");

        try(Scanner scanner = new Scanner(file);   ) {
            while (scanner.hasNext()){
                System.out.println(scanner.hasNext());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void ScannerReadNumber() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
//        int i  = scanner.nextInt();
//        System.out.println(i);
        double d  = scanner.nextDouble();
        System.out.println(d);
    }

    private static void scannerReadString() {
        Scanner scanner = new Scanner(System.in);
        //String s = scanner.next();
        //String s = scanner.nextLine();
        scanner.useDelimiter("__");
        String s = scanner.next();
        System.out.println(s);
    }

    private static void castExample() {
        byte b = 25;
        short s = b;
        int i = b;
        long l = i;
        double d = l;
        //float f = d;
        l = 156;
        b = (byte) l;
        System.out.println(b);
    }

    private static void randomExample() {
        Random rand = new Random();
        //int a = rand.nextInt(100);
        //int a = rand.nextInt(201) + 200;
//        int a = rand.nextInt(401) - 200;
//        System.out.println(a);
        //Double d = rand.nextDouble();

        int d = (int) (Math.random() * 200);
        System.out.println(d);
    }

    private static void varsAndUtils() {
        double[] arr = {1, 2, 3, 4};
        MyArrayUtils.printArray(12, 14, 25);
        String[] strings = {"hi", "h1", "h2"};
        varargMethod("Hello", 20, strings);
        int[] arr1 = MyArrayUtils.generateRandomArray(10);
        MyArrayUtils.printArray(arr1);
    }

    public static void varargMethod(String s, int i, String... arr) {
        System.out.println(s);
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
    }


}
