package chess;

import util.Input;

import java.util.Scanner;
@SuppressWarnings("Duplicates")
public class PlayerTwoTurn extends Chess{

    static Scanner sc = new Scanner(System.in);
    static Input input = new Input(sc);

    // Original Piece Location
    static int startingRow = 0;
    static int actualStartingRow = 0;
    static String startingColumnLetter;
    static int actualStartingColumnInt = 0;


    // New Piece Location
    static int movingRow = 0;
    static int actualMovingRow = 0;
    static String movingColumnLetter;
    static int actualMovingColumnInt = 0;



    public static void gamePlay() {

        System.out.println("Player 2 Turn");

        //Get starting Row
        System.out.println("What row is the piece you would like to move in? (1-8)");
        startingRow = input.getInt(1, 8);
        actualStartingRow = startingRow - 1;
        input.getString();

        //Get starting Column
        System.out.println("What column is the piece you would like to move in? (a-h)");
        startingColumnLetter = input.getString().toLowerCase();
        actualStartingColumnInt = generateColumn(startingColumnLetter);
        System.out.println(matrix[actualStartingRow][actualStartingColumnInt]);

        //Get Row to Move too
        System.out.println("Which row would you like to move too? (1-8)");
        movingRow = input.getInt(1, 8);
        actualMovingRow = movingRow - 1;
        input.getString();

        //Get Column to move too
        System.out.println("Which column would you like to move too?");
        movingColumnLetter = input.getString().toLowerCase();
        actualMovingColumnInt = generateColumn(movingColumnLetter);
        System.out.println(matrix[actualMovingRow][actualMovingColumnInt]);

        if (matrix[actualStartingRow][actualStartingColumnInt].equals("2P")) {
            for (int i = 1; i <= 2; i++) {
                if (!matrix[actualStartingRow - i][actualMovingColumnInt].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow - i][actualMovingColumnInt] = "Available";
            }


            if (actualMovingColumnInt == 0) {
                if (actualStartingRow + 1 == actualMovingRow && actualStartingColumnInt - 1 == actualMovingColumnInt) {
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                    matrix[actualMovingRow][actualMovingColumnInt] = "2P";
                }
            }
            if (matrix[actualMovingRow][actualMovingColumnInt].equals("Available")) {
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                matrix[actualMovingRow][actualMovingColumnInt] = "2P";
            } if (actualStartingRow - 1 == actualMovingRow && actualStartingColumnInt + 1 == actualMovingColumnInt || actualStartingColumnInt - 1 == actualMovingColumnInt) {
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                matrix[actualMovingRow][actualMovingColumnInt] = "2P";
            }
            else {
                System.out.println("invalid move!");
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j].replace("Available", "  ");
                }
            }

        }


        if (matrix[actualStartingRow][actualStartingColumnInt].equals("2C")) {

            //iterates Downwards


            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow + i > 7) {
                    break;
                }
                if (!matrix[actualStartingRow + i][actualStartingColumnInt].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow + i][actualStartingColumnInt] = "Available";

            }


            //iterates to the right
            for (int j = 1; j < matrix.length; j++) {

                if (actualStartingColumnInt + j > 7) {
                    break;
                }
                if (!matrix[actualStartingRow][actualStartingColumnInt + j].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow][actualStartingColumnInt + j] = "Available";


            }

            //iterates Upwards

            for (int e = 1; e < matrix.length; e++) {
                if (actualStartingRow - e < 0) {
                    break;
                }
                if (!matrix[actualStartingRow - e][actualStartingColumnInt].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow - e][actualStartingColumnInt] = "Available";

            }


            //iterates to the left

            for (int e = 1; e < matrix.length; e++) {
                if (actualStartingColumnInt - e < 0) {
                    break;
                }
                if (!matrix[actualStartingRow][actualStartingColumnInt - e].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow][actualStartingColumnInt - e] = "Available";

            }


            //If move is valid, moves the piece. If it is taking a piece, it takes the piece, or determines if the move is invalid
            if (matrix[actualMovingRow][actualMovingColumnInt].equals("Available")) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2C";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            }

            if (matrix[actualMovingRow - 1][actualStartingColumnInt].equals("Available") || matrix[actualMovingRow + 1][actualStartingColumnInt].equals("Available") || matrix[actualMovingRow][actualStartingColumnInt - 1].equals("Available") || matrix[actualMovingRow][actualStartingColumnInt + 1].equals("Available")) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2C";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            } else {
                System.out.println("Invalid move!");
            }

            //Erases all traces of Available
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j].replace("Available", "  ");
                }
            }


        }
        if (matrix[actualStartingRow][actualStartingColumnInt].equals("2H")) {

            //Marks available spots
            if (actualStartingRow + 2 <= 7 && actualStartingColumnInt + 1 <= 7) {
                matrix[actualStartingRow + 2][actualStartingColumnInt + 1] = "Available";
            }
            if (actualStartingRow + 2 <= 7 && actualStartingColumnInt - 1 >= 0) {
                matrix[actualStartingRow + 2][actualStartingColumnInt - 1] = "Available";
            }
            if (actualStartingRow + 1 <= 7 && actualStartingColumnInt + 2 <= 7) {
                matrix[actualStartingRow + 1][actualStartingColumnInt + 2] = "Available";
            }
            if (actualStartingRow - 1 >= 0 && actualStartingColumnInt - 2 >= 0) {
                matrix[actualStartingRow - 1][actualStartingColumnInt - 2] = "Available";
            }

            if (actualStartingRow + 1 <= 7 && actualStartingColumnInt - 2 >= 0) {
                matrix[actualStartingRow + 1][actualStartingColumnInt - 2] = "Available";
            }
            if (actualStartingRow - 2 <= 7 && actualStartingColumnInt - 1 >= 0) {
                matrix[actualStartingRow - 2][actualStartingColumnInt - 1] = "Available";
            }

            if (actualStartingRow - 1 >= 0 && actualStartingColumnInt + 2 <= 7) {
                matrix[actualStartingRow - 1][actualStartingColumnInt + 2] = "Available";
            }
            if (actualStartingRow - 2 >= 0 && actualStartingColumnInt + 1 <= 7) {
                matrix[actualStartingRow - 2][actualStartingColumnInt + 1] = "Available";
            }


            if (!matrix[actualMovingRow][actualMovingColumnInt].equals("Available")) {
                System.out.println("Invalid move!");
            } else {
                matrix[actualMovingRow][actualMovingColumnInt] = "2H";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j].replace("Available", "  ");
                }
            }


        }
        if (matrix[actualStartingRow][actualStartingColumnInt].equals("2B")) {

//Two For loops, add a single digit to each one as you iterate through the array. Could be one for loop possibly? will have to play with it.

            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow + i > 7) {
                    break;
                }
                if (actualStartingColumnInt + i > 7) {
                    break;
                }
                if (!matrix[actualStartingRow + i][actualStartingColumnInt + i].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow + i][actualStartingColumnInt + i] = "Available";
            }

            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow - i < 0) {
                    break;
                }
                if (actualStartingColumnInt - i < 0) {
                    break;
                }
                if (!matrix[actualStartingRow - i][actualStartingColumnInt - i].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow - i][actualStartingColumnInt - i] = "Available";

            }

            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow + i > 7) {
                    break;
                }
                if (actualStartingColumnInt - i < 0) {
                    break;
                }
                if (!matrix[actualStartingRow + i][actualStartingColumnInt - i].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow + i][actualStartingColumnInt - i] = "Available";

            }

            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow - i < 0) {
                    break;
                }
                if (actualStartingColumnInt + i > 7) {
                    break;
                }
                if (!matrix[actualStartingRow - i][actualStartingColumnInt + i].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow - i][actualStartingColumnInt + i] = "Available";

            }

            if (matrix[actualMovingRow][actualMovingColumnInt].equals("Available")) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2B";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            }
            if (actualMovingRow == 0) {
                if (matrix[actualMovingRow + 1][actualMovingColumnInt + 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt - 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt + 1].equals("1B") || matrix[actualMovingRow + 1][actualMovingColumnInt - 1].equals("1B")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2B";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid move!");
                }
            }
            if (actualMovingRow == 7) {
                if (matrix[actualMovingRow - 1][actualMovingColumnInt - 1].equals("Available") || matrix[actualMovingRow - 1][actualMovingColumnInt + 1].equals("Available")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2B";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid move!");
                }
            }
            if (actualMovingColumnInt == 0) {
                if (matrix[actualMovingRow - 1][actualMovingColumnInt + 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt + 1].equals("Available")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2B";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid move!");
                }
            }
            if (actualMovingColumnInt == 7) {
                if (matrix[actualMovingRow - 1][actualMovingColumnInt - 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt - 1].equals("Available")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2B";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid move!");
                }
            }
            if (actualMovingRow < 7 && actualMovingRow > 0 && actualMovingColumnInt < 7 && actualMovingColumnInt > 0) {
                if (matrix[actualMovingRow - 1][actualMovingColumnInt - 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt - 1].equals("Available") || matrix[actualMovingRow - 1][actualMovingColumnInt + 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt + 1].equals("Available")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2B";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid Move!");
                }
            }


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j].replace("Available", "  ");
                }
            }
        }

        if (matrix[actualStartingRow][actualStartingColumnInt].equals("1K")) {

// Up, down, left, right, one space

            if (actualMovingRow - 1 == actualStartingRow) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2K";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            } else if (actualMovingRow + 1 == actualStartingRow) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2K";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            } else if (actualMovingColumnInt + 1 == actualStartingColumnInt) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2K";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            } else if (actualMovingColumnInt - 1 == actualStartingColumnInt) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2K";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            } else {
                System.out.println("Invalid move!");
            }

        }
        if (matrix[actualStartingRow][actualStartingColumnInt].equals("2Q")) {

// combines both rook and castle

            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow + i > 7) {
                    break;
                }
                if (actualStartingColumnInt + i > 7) {
                    break;
                }
                if (!matrix[actualStartingRow + i][actualStartingColumnInt + i].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow + i][actualStartingColumnInt + i] = "Available";
            }

            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow - i < 0) {
                    break;
                }
                if (actualStartingColumnInt - i < 0) {
                    break;
                }
                if (!matrix[actualStartingRow - i][actualStartingColumnInt - i].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow - i][actualStartingColumnInt - i] = "Available";

            }

            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow + i > 7) {
                    break;
                }
                if (actualStartingColumnInt - i < 0) {
                    break;
                }
                if (!matrix[actualStartingRow + i][actualStartingColumnInt - i].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow + i][actualStartingColumnInt - i] = "Available";

            }

            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow - i < 0) {
                    break;
                }
                if (actualStartingColumnInt + i > 7) {
                    break;
                }
                if (!matrix[actualStartingRow - i][actualStartingColumnInt + i].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow - i][actualStartingColumnInt + i] = "Available";

            }

            if (matrix[actualMovingRow][actualMovingColumnInt].equals("Available")) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2Q";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            }
            if (actualMovingRow == 0) {
                if (matrix[actualMovingRow + 1][actualMovingColumnInt + 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt - 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt + 1].equals("1B") || matrix[actualMovingRow + 1][actualMovingColumnInt - 1].equals("1B")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2Q";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid move!");
                }
            }
            if (actualMovingRow == 7 && actualMovingColumnInt != 0) {
                if (matrix[actualMovingRow - 1][actualMovingColumnInt - 1].equals("Available")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2Q";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid move!");
                }
            }
            if (actualMovingColumnInt == 0 && actualMovingRow == 7) {
                if (matrix[actualMovingRow - 1][actualMovingColumnInt + 1].equals("Available")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2Q";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid move!");
                }
            }
            if (actualMovingColumnInt == 7) {
                if (matrix[actualMovingRow - 1][actualMovingColumnInt - 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt - 1].equals("Available")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2Q";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid move!");
                }
            }
            if (actualMovingRow < 7 && actualMovingRow > 0 && actualMovingColumnInt < 7 && actualMovingColumnInt > 0) {
                if (matrix[actualMovingRow - 1][actualMovingColumnInt - 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt - 1].equals("Available") || matrix[actualMovingRow - 1][actualMovingColumnInt + 1].equals("Available") || matrix[actualMovingRow + 1][actualMovingColumnInt + 1].equals("Available")) {
                    matrix[actualMovingRow][actualMovingColumnInt] = "2Q";
                    matrix[actualStartingRow][actualStartingColumnInt] = "  ";
                } else {
                    System.out.println("Invalid Move!");
                }
            }




            //iterates Downwards


            for (int i = 1; i < matrix.length; i++) {
                if (actualStartingRow + i > 7) {
                    break;
                }
                if (!matrix[actualStartingRow + i][actualStartingColumnInt].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow + i][actualStartingColumnInt] = "Available";

            }


            //iterates to the right
            for (int j = 1; j < matrix.length; j++) {

                if (actualStartingColumnInt + j > 7) {
                    break;
                }
                if (!matrix[actualStartingRow][actualStartingColumnInt + j].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow][actualStartingColumnInt + j] = "Available";


            }

            //iterates Upwards

            for (int e = 1; e < matrix.length; e++) {
                if (actualStartingRow - e < 0) {
                    break;
                }
                if (!matrix[actualStartingRow - e][actualStartingColumnInt].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow - e][actualStartingColumnInt] = "Available";

            }


            //iterates to the left

            for (int e = 1; e < matrix.length; e++) {
                if (actualStartingColumnInt - e < 0) {
                    break;
                }
                if (!matrix[actualStartingRow][actualStartingColumnInt - e].equals("  ")) {
                    break;
                }
                matrix[actualStartingRow][actualStartingColumnInt - e] = "Available";

            }


            //If move is valid, moves the piece. If it is taking a piece, it takes the piece, or determines if the move is invalid
            if (matrix[actualMovingRow][actualMovingColumnInt].equals("Available")) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2Q";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            }

            if (matrix[actualMovingRow - 1][actualStartingColumnInt].equals("Available") || matrix[actualMovingRow + 1][actualStartingColumnInt].equals("Available") || matrix[actualMovingRow][actualStartingColumnInt - 1].equals("Available") || matrix[actualMovingRow][actualStartingColumnInt + 1].equals("Available")) {
                matrix[actualMovingRow][actualMovingColumnInt] = "2Q";
                matrix[actualStartingRow][actualStartingColumnInt] = "  ";
            } else {
                System.out.println("Invalid move!");
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j].replace("Available", "  ");
                }
            }



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
