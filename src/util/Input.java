package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = getString();
        return (userInput.equals("y") || userInput.equals("yes"));
    }

    public int getInt() {
        if (!scanner.hasNextInt()) {
            System.out.println("Not a valid integer. Try again.");
            scanner.nextLine();
            return getInt();
        }
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        int userInt =  getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        else {
            System.out.println("Number out of range");
            return getInt(min, max);
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Whats your number");
        do {
            System.out.println("Whats your guess");
        } while (scanner.nextInt() < min && scanner.nextInt() > max);
        System.out.println("You did it!");
        return scanner.nextInt();
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

}
