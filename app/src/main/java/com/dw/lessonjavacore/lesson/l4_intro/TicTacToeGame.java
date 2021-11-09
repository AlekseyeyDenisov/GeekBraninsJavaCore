package com.dw.lessonjavacore.lesson.l4_intro;


import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    private static char DOT_X = 'X';
    private static char DOT_0 = '0';
    private static char DOT_EMPTY = '.';
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAi;
    private static int roundCounter;
    private static int amountOfChips;



    public static void main(String[] args) {
        play();

    }

    private static void play() {
        while (true) {
            playRound();
            System.out.printf("SCORE: HUMAN AI\n" +
                    "       %d    %d\n", scoreHuman, scoreAi);
            System.out.printf("Wanna play again? Y or N >>>");
            if (!scanner.next().toLowerCase().equals("y")) {
                System.out.println("Good bye!");
                break;
            }
        }
    }


    private static void playRound() {
        System.out.printf("Round № %d\n", roundCounter++);
        initField(5, 5,4);
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkAll(DOT_X)) break;
            aiTurn();
            printField();
            if (checkAll(DOT_0)) break;
        }

    }

    private static boolean checkAll(char dot) {
        if (checkWin(dot)) {
            if (dot == DOT_X) {
                System.out.println("Human WIN!!");
                scoreHuman++;
            } else {
                System.out.println("Ai WIN!!");
                scoreAi++;
            }
            return true;
        }
        if (checkDraw()) return true;
        return false;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCallEmpty(y, x)) return false;
            }
        }
        System.out.print("DRAW");
        return true;

    }


    private static boolean checkWinHorAndVer(char dot) {
        int winHor = 0;
        int winVer = 0;
        for (int y = 0; y < fieldSizeY; y++){
            for (int x = 0;x < fieldSizeX; x++ ){
                if (field[y][x] == dot) winHor++;
                else winHor = 0;
                if (winHor == amountOfChips) return true;

                if (field[x][y] == dot) winVer++;
                else winVer = 0;
                if (winVer == amountOfChips) return true;
            }
        }
        return false;
    }



    private static boolean checkWinDiagonals(char dot) {
        int leftRight = 0;
        int rightleft = 0;
        for (int y = 0;y < fieldSizeY; y++){
            for (int x = 0; x < fieldSizeX; x++){
                int g = y + x;
                if (g < fieldSizeY){
                    if (field[x][g] == dot) leftRight++;
                    else leftRight = 0;
                    if (leftRight == amountOfChips) return true;
                    System.out.println("leftRight "+leftRight);

                    if (field[g][x] == dot) rightleft++;
                    else rightleft = 0;
                    if (rightleft == amountOfChips) return true;
                    System.out.println("rightleft "+rightleft);
                }
            }

        }
        return false;
    }

    private static boolean checkWin(char dot) {
        if (checkWinHorAndVer(dot)) return true;
        if (checkWinDiagonals(dot)) return true;
//        //hor
//        if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
//        if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
//        if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;
//        //ver
//        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
//        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
//        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;
//        //dia
//        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
//        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) return true;
        return false;
    }

    private static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCallEmpty(y, x));
        field[y][x] = DOT_0;
    }

    private static void humanTurn() {
        int x;
        int y;

        boolean isFirstTry = true;
        do {
            if (!isFirstTry) {
                System.out.println("Wrong coordinates, try again!");
            }
            isFirstTry = false;
            System.out.print("Pleas enter coordinate of your turn x & y  split by whitespace >>>");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCallEmpty(y, x));
        field[y][x] = DOT_X;
    }

    private static boolean isCallEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }


    private static void initField(int sizeX, int sizeY,int chips) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        amountOfChips = chips;
        field = new char[sizeY][sizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }

    }

    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }
}
