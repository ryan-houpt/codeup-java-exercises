package checkers;

import util.Input;

import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class PlayerOneTurn extends Checkers {

    static Scanner sc = new Scanner(System.in);
    static Input input = new Input(sc);

    // Original Piece Location
    static int startingRow = 0;
    static int actualStartingRow = 0;
    static String startingColumnString;
    static int startingColumnInt = 0;


    // New Piece Location
    static int movingRow = 0;
    static int actualMovingRow = 0;
    static String movingColumnString;
    static int movingColumnInt = 0;


    public static void gamePlay() {


        System.out.println("Player 1 turn");
        //Gets Starting Row
        System.out.println("What is the row for the piece you would like to move? (1-8)");
        startingRow = input.getInt();
        actualStartingRow = startingRow - 1;
        input.getString();
        System.out.println(actualStartingRow);

        //Gets starting Column
        System.out.println("What is the column for the piece you would like to move? (a-h)");
        startingColumnString = input.getString().toLowerCase();
        startingColumnInt = generateColumn(startingColumnString);
        System.out.println(startingColumnInt);




        //Gets Row to Move too
        System.out.println("Which row do you want to move too? (1-8)");
        movingRow = input.getInt();
        actualMovingRow = movingRow - 1;
        input.getString();
        System.out.println(actualMovingRow);

        //Gets Column to Move too
        System.out.println("Which column do you want to move too? (a-h)");
        movingColumnString = input.getString().toLowerCase();
        movingColumnInt = generateColumn(movingColumnString);
        System.out.println(movingColumnInt);



        //Checks to see if the play is valid
        if (matrix[actualStartingRow][startingColumnInt] != 1) {
            System.out.println("That's not a valid movie!");
            GenerateBoard.generateBoard();
            gamePlay();
        }
        else if (matrix[actualMovingRow + 1][movingColumnInt + 1] != 1 && matrix[actualMovingRow - 1][movingColumnInt - 1] != 1 && matrix[actualMovingRow + 1][movingColumnInt - 1] != 1 && matrix[actualMovingRow - 1][movingColumnInt + 1] != 1) {
            System.out.println("That's not a valid movie!");
            matrix[actualStartingRow][startingColumnInt] = 1;
            GenerateBoard.generateBoard();
            gamePlay();
        }
        else if (matrix[actualMovingRow][movingColumnInt] == 1) {
            System.out.println("You can't move onto your own square!");
            GenerateBoard.generateBoard();
            gamePlay();
        }
        //Logic for Player 1 Jumps
        else if (matrix[actualMovingRow][movingColumnInt] == 2) {
            System.out.println("JUMP!");
            matrix[actualStartingRow][startingColumnInt] = 0;
            if (matrix[actualMovingRow + 1][movingColumnInt + 1] != 0 && matrix[actualMovingRow - 1][movingColumnInt - 1] != 0 && matrix[actualMovingRow + 1][movingColumnInt - 1] != 0 && matrix[actualMovingRow - 1][movingColumnInt + 1] != 0) {
                System.out.println("Invalid Move!");
            }
            if (matrix[actualMovingRow - 1][movingColumnInt + 1] == 0) {
                matrix[actualMovingRow + 1][movingColumnInt - 1] = 1;
                matrix[actualStartingRow][startingColumnInt] = 0;
                matrix[actualMovingRow][movingColumnInt] = 0;


            } else if (matrix[actualMovingRow - 1][movingColumnInt - 1] == 0) {
                matrix[actualMovingRow + 1][movingColumnInt + 1] = 1;
                matrix[actualStartingRow][startingColumnInt] = 0;
                matrix[actualMovingRow][movingColumnInt] = 0;


            }

        }
        else {
            matrix[actualMovingRow][movingColumnInt] = 1;
            matrix[actualStartingRow][startingColumnInt] = 0;
        }

    }

    public static int generateColumn (String column) {
        int output = 0;
        switch (column) {
            case "a":
                output = 0;
                break;
            case "b":
                output = 1;
                break;
            case "c":
                output = 2;
                break;
            case "d":
                output = 3;
                break;
            case "e":
                output = 4;
                break;
            case "f":
                output = 5;
                break;
            case "g":
                output = 6;
                break;
            case "h":
                output = 7;
                break;
        }
        return output;
    }
}
