import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import util.Input;
import java.util.Scanner;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {

        int userWins = 0;
        int computerWins = 0;
        boolean playing = true;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Input input = new Input(sc);

        ArrayList<String> computerChoices = new ArrayList<>(Arrays.asList(
                "Rock",
                "Paper",
                "Scissors"
        ));

        do {

            System.out.println("Welcome to a game of Rock, Paper, Scissors! \n\n" +
                    "The rules are simple. Input your choice; \n" +
                    "Rock.\n" +
                    "Paper.\n" +
                    "Scissors. \n" +
                    "If your choice beats the computer you win! \n\n");

            System.out.println("Total current wins are \n" +
                   "UserWins = " + userWins + "\n" +
                   "Computer Wins = " + computerWins + "\n\n");

            System.out.println("What is your choice?");
            var userChoice = input.getString().toLowerCase();
            var computerChoice = computerChoices.get(rand.nextInt(3));


            // UserChoice = Rock
            if (userChoice.equals("rock") && computerChoice.equals("Rock")) {
                System.out.println("It's a tie!");

            } if (userChoice.equals("rock") && computerChoice.equals("Paper")) {
                System.out.println("Paper covers Rock!");
                computerWins++;

            } if (userChoice.equals("rock") && computerChoice.equals("Scissors")) {
                System.out.println("Rock smashes Scissors!");
                userWins++;
            }

            // UserChoice = Paper

            if (userChoice.equals("paper") && computerChoice.equals("Rock")) {
                System.out.println("Paper covers Rock!");
                userWins++;

            } if (userChoice.equals("paper") && computerChoice.equals("Paper")) {
                System.out.println("It's a tie!");

            } if (userChoice.equals("paper") && computerChoice.equals("Scissors")) {
                System.out.println("Paper is cut by Scissors!");
                computerWins++;
            }

            // UserChoice = Scissors

            if (userChoice.equals("scissors") && computerChoice.equals("Rock")) {
                System.out.println("Rock smashes Scissors!");
                computerWins++;

            } if (userChoice.equals("scissors") && computerChoice.equals("Paper")) {
                System.out.println("Scissors cut Paper!");
                userWins++;

            } if (userChoice.equals("scissors") && computerChoice.equals("Scissors")) {
                System.out.println("It's a tie!");
            }

            System.out.println("Do you want to play again? y/n");
            var userPlays = input.getString();
            if (userPlays.equals("n")) {
                playing = false;
            }

        } while (playing);
    }

}
