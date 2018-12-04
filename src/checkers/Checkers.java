package checkers;

public class Checkers {

    public static int[][] matrix = {
            {0, 1 ,0 ,1 ,0 ,1 ,0 ,1},
            {1, 0 ,1 ,0 ,1 ,0 ,1 ,0},
            {0, 1 ,0 ,1 ,0 ,1 ,0 ,1},
            {0, 0 ,0 ,0 ,0 ,0 ,0 ,0},
            {0, 0 ,0 ,0 ,0 ,0 ,0 ,0},
            {2, 0 ,2 ,0 ,2 ,0 ,2 ,0},
            {0, 1 ,0 ,2 ,0 ,2 ,0 ,2},
            {0, 0 ,0 ,0 ,2 ,0 ,2 ,0}
    };

    public static void main(String[] args) {

        boolean playing = true;
        boolean playerOneTurn = true;

        System.out.println("Welcome to checkers!");

            do {
                GenerateBoard.generateBoard();
                if (playerOneTurn) {
                    PlayerOneTurn.gamePlay();
                    playerOneTurn = false;
                } else {
                    PlayerTwoTurn.gamePlay();
                    playerOneTurn = true;
                }

                //checks board to see if Player 1 has any pieces left
                if (!CheckBoard.find2DIndex(1)){
                        System.out.println("Player 2 Wins!");
                        playing = false;
                }
                //checks board to see if Player 2 has any pieces left
                if (!CheckBoard.find2DIndex(2)){
                    System.out.println("Player 1 Wins!");
                        playing = false;
                }

            } while (playing);

    }

}

