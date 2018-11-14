
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

//    public static void Addition(int num1, int num2) {
//        System.out.println(num1 + num2);
//    }
//    public static void Subtraction(int num1, int num2) {
//        System.out.println(num1 - num2);
//    }
//    public static void Multiplication(int num1, int num2) {
//        System.out.println(num1 * num2);
//    }
//    public static void Division(int num1, int num2) {
//        System.out.println(num1 / num2);
//    }
//    public static void Modulus(int num1, int num2) {
//        System.out.println(num1 % num2);
//    }
//
//
//    public static void Factorial(int num1) {
//        int i, factorial = 1;
//        for (i = 1; i <= num1; i++){
//             factorial = i * factorial;
//        }
//        System.out.println(factorial);
//    }
//
//    public static void DiceRoll() {
//        Scanner scanner = new Scanner(System.in);
//        Random rand = new Random();
//
//        System.out.println("How many dice are on this die?");
//        int sides = scanner.nextInt();
//        scanner.nextLine();
//
//        int diceOne = rand.nextInt(sides) + 1;
//        int diceTwo = rand.nextInt(sides) + 1;
//
//        int diceAdded = diceOne + diceTwo;
//
//        System.out.println("You rolled two " + sides + " die, and rolled a " + diceOne + " and " + diceTwo + " for a total of " + diceAdded);
//
//        System.out.println("Would you like to roll again? yes/no");
//        String userResponse = scanner.nextLine();
//        if (userResponse.equals("yes")) {
//            DiceRoll();
//        } else {
//            System.out.println("Have a great day!");
//        }
//    }
//


//    ------ 1 ------
//    Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string, should return how many of that vowel is in the string. Given a string, use all of the these vowel counting methods to output the count of each vowel in a word.
//    EXAMPLE...
//    INPUT: countVowels("cat")
//    OUTPUT:
//            |======== VOWEL COUNT ========|
//            | A's | E's | I's | O's | U's |
//            | 1   | 0   | 0   | 0   | 0   |
//            |=============================|
//    countVowels() will use...
//    countAs(),
//    countEs(),
//    countIs(),
//    countOs(),
//    and countUs()

//    public static int countAs(String word) {
//        String toLower = word.toLowerCase();
//        int countA = toLower.length() - toLower.replace("a", "").length();
//        return countA;
//    }
//
//    public static int countEs(String word) {
//        String toLower = word.toLowerCase();
//        int countE = toLower.length() - toLower.replace("e", "").length();
//        return countE;
//    }
//    public static int countIs(String word) {
//        String toLower = word.toLowerCase();
//        int countI = toLower.length() - toLower.replace("i", "").length();
//        return countI;
//    }
//    public static int countOs(String word) {
//        String toLower = word.toLowerCase();
//        int countO = toLower.length() - toLower.replace("o", "").length();
//        return countO;
//    }
//    public static int countUs(String word) {
//        String toLower = word.toLowerCase();
//        int countU = toLower.length() - toLower.replace("u", "").length();
//        return countU;
//    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
        System.out.println("What is your word?");

        String userWord = scanner.nextLine();
//
//        int A = countAs(userWord);
//        int E = countEs(userWord);
//        int I = countIs(userWord);
//        int O = countOs(userWord);
//        int U = countUs(userWord);
//
//
//        System.out.println("" +
//                "  |======== VOWEL COUNT ========|\n" +
//                "  | A's | E's | I's | O's | U's |\n" +
//                "  | "+A+"   | "+E+"   | "+I+"   | "+O+"   | "+U+"   |\n" +
//                "  |=============================|");

        int userGuesses = 10;





    }


}
