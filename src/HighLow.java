import java.util.Scanner;
import java.util.Random;


public class HighLow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int gameNumber = rand.nextInt(100) + 1;
        int userGuesses = 10;
        int userGuess;


        System.out.println("I have a number that I bet you can't guess! Go ahead... try");

        do {

            System.out.println("What is your guess?");
            userGuess = scanner.nextInt();

            if (userGuess > gameNumber) {
                System.out.println("LOWER!");
                userGuesses--;
            } if (userGuess < gameNumber) {
                System.out.println("HIGHER!");
                userGuesses--;
            }

        } while (userGuess != gameNumber && userGuesses > 0);

        if (userGuesses == 0) {
            System.out.println("Sorry... you ran out of guesses");
        } else {
            System.out.println("Congrats! You guess the number! It only took you... " + userGuesses + " trys.");
        }
    }

}
