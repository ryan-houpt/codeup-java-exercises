import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f.", pi);


        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter Something: ");
//
//
////        int userInterger = scanner.nextInt();
////        System.out.print(userInterger);
//
////        String wordOne = scanner.next();
////        String wordTwo = scanner.next();
////        String wordThree = scanner.next();
////
////        System.out.println(wordOne);
////        System.out.println(wordTwo);
////        System.out.println(wordThree);
//
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

        System.out.print("Enter a Length and Width: ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        int area = length * width;
        int perimeter = (2 * length) + (2 * width);

        System.out.format("The area is %d%nThe perimeter is %d", area, perimeter);

    }
}
