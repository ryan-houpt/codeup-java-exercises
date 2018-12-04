package checkers;

public class GenerateBoard extends Checkers {

    public static void generateBoard() {


        System.out.println("+ A + B + C + D + E + F + G + H +");
        for (int[] row : matrix) {
            System.out.println("+---+---+---+---+---+---+---+---+");

            System.out.print("| ");

            for (int n : row) {

                System.out.print(n + " | ");

            }

            System.out.println();
        }

        System.out.println("+---+---+---+---+---+---+---+---+");

    }

}
