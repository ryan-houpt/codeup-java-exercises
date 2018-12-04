package checkers;

import util.Input;

import java.util.Scanner;
@SuppressWarnings("Duplicates")
public class PlayerTwoTurn extends Checkers{

    static boolean playerOneTurn = true;
    static boolean playerTwoTurn = false;
    static Scanner sc = new Scanner(System.in);
    static Input input = new Input(sc);
    static int startingArray;

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


        System.out.println("Player 2 turn");
        //Gets Starting Row
        System.out.println("What is the row for the piece you would like to move? (1-8)");
        startingRow = input.getInt(1, 8);
        actualStartingRow = startingRow - 1;
        input.getString();

        //Gets starting Column
        System.out.println("What is the column for the piece you would like to move? (a-h)");
        startingColumnString = input.getString().toLowerCase();
        startingColumnInt = generateColumn(startingColumnString);


        //Gets Row to Move too
        System.out.println("Which row do you want to move too? (1-8)");
        movingRow = input.getInt(1, 8);
        actualMovingRow = movingRow - 1;
        input.getString();

        //Gets Column to Move too
        System.out.println("Which column do you want to move too? (a-h)");
        movingColumnString = input.getString().toLowerCase();
        movingColumnInt = generateColumn(movingColumnString);


        //Checks to see if the play is valid
        if (matrix[actualStartingRow][startingColumnInt] != 2) {
            System.out.println("That's not a valid movie!");
            GenerateBoard.generateBoard();
            gamePlay();
        }
        else if (matrix[actualMovingRow + 1][movingColumnInt + 1] != 2 && matrix[actualMovingRow - 1][movingColumnInt - 1] != 2 && matrix[actualMovingRow + 1][movingColumnInt - 1] != 2 && matrix[actualMovingRow - 1][movingColumnInt + 1] != 2) {
            System.out.println("That's not a valid movie!");
            matrix[actualStartingRow][startingColumnInt] = 2;
            GenerateBoard.generateBoard();
            gamePlay();
        }
        else if (matrix[actualMovingRow][movingColumnInt] == 2) {
            System.out.println("You can't move onto your own square!");
            GenerateBoard.generateBoard();
            gamePlay();
        }
        //Logic for Player 1 Down and to the right
        else if (matrix[actualMovingRow][movingColumnInt] == 1) {
            System.out.println("JUMP!");
            matrix[actualStartingRow][startingColumnInt] = 0;
            if (matrix[actualMovingRow + 1][movingColumnInt + 1] != 0 && matrix[actualMovingRow - 1][movingColumnInt - 1] != 0 && matrix[actualMovingRow + 1][movingColumnInt - 1] != 0 && matrix[actualMovingRow - 1][movingColumnInt + 1] != 0) {
                System.out.println("Invalid Move!");
            }
            if (matrix[actualMovingRow + 1][movingColumnInt - 1] == 0) {
                matrix[actualMovingRow - 1][movingColumnInt + 1] = 2;
                matrix[actualStartingRow][startingColumnInt] = 0;
                matrix[actualMovingRow][movingColumnInt] = 0;


            } else if (matrix[actualMovingRow + 1][movingColumnInt + 1] == 0) {
                matrix[actualMovingRow - 1][movingColumnInt - 1] = 2;
                matrix[actualStartingRow][startingColumnInt] = 0;
                matrix[actualMovingRow][movingColumnInt] = 0;


            }
        }

        else {
            matrix[actualMovingRow][movingColumnInt] = 2;
            matrix[actualStartingRow][startingColumnInt] = 0;
        }

    }

    private static int generateColumn (String column) {
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
