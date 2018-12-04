package chess;

public class GenerateBoard extends Chess{

    public static void generateBoard() {


        System.out.println("+ A  + B  + C  +  D +  E +  F + G  +  H");
        for (String[] row : matrix) {
            System.out.println("+----+----+----+----+----+----+----+----+");

            System.out.print("| ");

            for (String n : row) {

                System.out.print(n + " | ");

            }

            System.out.println();
        }

        System.out.println("+----+----+----+----+----+----+----+----+");

    }

}
