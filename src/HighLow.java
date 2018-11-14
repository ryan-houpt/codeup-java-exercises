import java.util.Scanner;
import java.util.Random;


public class HighLow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int gameNumber = rand.nextInt(100) + 1;
        int userLives = 10;
        int userGuessesTotal = 0;
        int userGuess;


        System.out.println("I have a number that I bet you can't guess! Go ahead... try");

        do {

            System.out.println("What is your guess?");
            userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("I said between 1 and 100!");
            } else if (userGuess > gameNumber) {
                System.out.println("LOWER!");
                userLives--;
                userGuessesTotal++;
            } else if (userGuess < gameNumber) {
                System.out.println("HIGHER!");
                userLives--;
                userGuessesTotal++;
            }
        } while (userGuess != gameNumber && userLives > 0);

        if (userLives == 0) {
            System.out.println("Sorry... you ran out of guesses");
        } else {
            System.out.println("Congrats! You guess the number! It only took you... " + (userGuessesTotal + 1) + " attempts.");
        }


    }



}
