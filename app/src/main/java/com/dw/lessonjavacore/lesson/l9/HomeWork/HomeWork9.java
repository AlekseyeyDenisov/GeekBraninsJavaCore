package com.dw.lessonjavacore.lesson.l9.HomeWork;

public class HomeWork9 {
    public static void main(String[] args) {
        String[][] arrayString = {{"18","28","8","5"},{"28","fgf","90","3"},{"45","3","14","86"},{"45","3","14","86"}};
        squareTwoStringArray(arrayString);
    }

    private static void squareTwoStringArray(String[][] arrayString) {
        if (arrayString.length != 4 || arrayString[0].length != 4) {
            throw new MyArraySizeException();
        }else {
            int[][] arrayInt = new int[4][4];
            for (int i = 0; i < arrayString.length; i++){
                for (int ii = 0; ii < arrayString[0].length; ii++){
                    try {
                        arrayInt[i][ii] = Integer.parseInt(arrayString[i][ii]);
                    }
                    catch (NumberFormatException  e)
                    {
                        throw new MyArrayDataException("error element [" + i+"]["+ ii+ "]");
                    }
                }
            }

        }
    }
}
