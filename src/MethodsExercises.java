import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static void Addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void Subtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    public static void Multiplication(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    public static void Division(int num1, int num2) {
        System.out.println(num1 / num2);
    }
    public static void Modulus(int num1, int num2) {
        System.out.println(num1 % num2);
    }


    public static void Factorial(int num1) {
        int i, factorial = 1;
        for (i = 1; i <= num1; i++){
             factorial = i * factorial;
        }
        System.out.println(factorial);
    }

    public static void DiceRoll() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many dice are on this die?");
        int sides = scanner.nextInt();
        scanner.nextLine();

        int diceOne = rand.nextInt(sides) + 1;
        int diceTwo = rand.nextInt(sides) + 1;

        int diceAdded = diceOne + diceTwo;

        System.out.println("You rolled two " + sides + " die, and rolled a " + diceOne + " and " + diceTwo + " for a total of " + diceAdded);

        System.out.println("Would you like to roll again? yes/no");
        String userResponse = scanner.nextLine();
        if (userResponse.equals("yes")) {
            DiceRoll();
        } else {
            System.out.println("Have a great day!");
        }
    }

    public static void main(String[] args) {
        Addition(5, 6);
        Subtraction(4, 2);
        Multiplication(4, 2);
        Division(10, 5);
        Modulus(10, 5);
        Factorial(4);
        DiceRoll();
    }


}
