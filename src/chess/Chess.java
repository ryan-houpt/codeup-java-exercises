package chess;
@SuppressWarnings("Duplicates")
public class Chess {

    public static String[][] matrix = {
            {"1C","1H","1B","1K","1Q","1B","1H","1C"},
            {"1P","1P","1P","1P","1P","1P","1P","1P"},
            {"  ","  ","  ","  ","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","  ","  ","  "},
            {"2P","2P","2P","2P","2P","2P","2P","2P"},
            {"2C","2H","2B","2Q","2K","2B","2H","2C"}
    };

    public static void main(String[] args) {

        boolean playing = true;
        boolean playerOneTurn = true;


        do {
            GenerateBoard.generateBoard();
            if (playerOneTurn) {
                PlayerOneTurn.gamePlay();
                playerOneTurn = false;
            } else {
                PlayerTwoTurn.gamePlay();
                playerOneTurn = true;
            }

            if (!CheckBoard.find2DIndex("1K")) {
                System.out.println("Player 2 wins!");
                playing = false;
            }
            if (!CheckBoard.find2DIndex("2K")){
                System.out.println("Player 1 Wins!");
                playing = false;
            }

        } while (playing);
    }

}
