package com.dw.lessonjavacore.lesson.l9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkClass {
    //public static void main(String[] args) throws Exception {
    public static void main(String[] args)  {
        //trowException();
        //trowError();
        //tryWithResourcesExample();



    }

    private static void tryWithResourcesExample() {
        try(Scanner scanner =  new  Scanner(new File("fileNotFile.txt"))){
            while (scanner.hasNextLine()){
                System.out.println(scanner.hasNextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void trowError() {
        try {
            scanFile();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            return;
        }
    }

    private static void scanFile()throws FileNotFoundException {
        Scanner scanner =  new  Scanner(new File("fileNotFile.txt"));
        while (scanner.hasNextLine()){
            System.out.println(scanner.hasNextLine());
        }

    }

    private static void trowException() {
        throw new RuntimeException("Мое исключение");
    }

}


