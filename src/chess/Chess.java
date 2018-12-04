package chess;

public class Chess {

    public static String[][] matrix = {
            {"1C","  ","  ","1K","1Q","1R","1H","1C"},
            {"  ","  ","  ","  ","  ","  ","1P","1P"},
            {"  ","  ","  ","  ","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","  ","  ","2C"},
            {"  ","  ","  ","1B","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","  ","  ","1H"},
            {"  ","  ","  ","  ","  ","  ","  ","  "}
    };

    public static void main(String[] args) {

        boolean playing = true;


        do {
            GenerateBoard.generateBoard();
            PlayerOneTurn.gamePlay();
        } while (playing);
    }

}
