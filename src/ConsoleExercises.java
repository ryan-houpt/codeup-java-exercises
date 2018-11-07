import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %.2f.", pi);


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

//        System.out.print("Enter a Length and Width: ");
//        int length = scanner.nextInt();
//        int width = scanner.nextInt();
//
//        int area = length * width;
//        int perimeter = (2 * length) + (2 * width);
//
//        System.out.format("The area is %d%nThe perimeter is %d", area, perimeter);


//        ================================= CONSOLE IO BONUSES
//        BONUS 1
//        Prompt the user to enter a favorite quote
//        Output the quote
//        Ask them to enter how many words are in the quote
//        Output the number they entered
//        Output if the number they entered indeed matched the number of words

//        System.out.print("Enter your favorite quote: ");
//        String userQuote = scanner.nextLine();
//        System.out.print("How many words are in that quote?");
//        int userNumber = scanner.nextInt();
//
//      String[] words = userQuote.split("\\s+");
//      int actualWords = words.length;
//
//        if (actualWords == userNumber) {
//            System.out.println("Thats right!");
//        } else {
//            System.out.println("Liar!");
//        }


//        BONUS 2
//        Prompt the user to enter a list of top three favorite foods separated by only spaces
//        Use the printf() to output the three top foods with the format:
//        1) FirstFood
//        2) SecondFood
//        3) ThirdFood

//        System.out.println("What are your three favorite foods?");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//        System.out.printf("1) %s \n2) %s \n3) %s", firstWord, secondWord, thirdWord);


//        BONUS 3
//        Prompt the user to enter a grocery list of three items
//        Each item should only be separated by a comma (no spaces)
//        You will need to use the .useDelimiter() method on your scanner object
//        Output the result as a comma-separated list using printf()

        scanner.useDelimiter(",");

        System.out.println("Enter your grocery list");
        String groceryList = scanner.nextLine();
        String groceryListDisplay = "Your grocery list is : ";

        String[] listWords = groceryList.split(",");
      int groceryListLength = listWords.length;

        System.out.println(groceryListLength);

        System.out.println(listWords[1]);

        for (int x = 0; x < groceryListLength; x++) {
            groceryListDisplay += listWords[x] + ", ";
        }

        System.out.println(groceryListDisplay);

    }
}
