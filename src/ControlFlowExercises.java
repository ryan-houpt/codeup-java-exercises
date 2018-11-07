import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int i = 5;
////
////        while (i <= 15) {
////            System.out.println(i++);

//            int x = 2;
//
//            do {
//           System.out.println(x *= x);
//        }while(x < 65536);


//        for (int x = 1; x < 100; x += 1) {
//         if (x % 3 == 0 && x % 5 == 0) {
//             System.out.println("Fizz Buzz");
//             continue;
//         }
//            if (x % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            } if (x % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            } if (x % 3 != 0 && x % 5 != 0) {
//                System.out.println(x);
//            }
//        }

//
//        String graph = "number | squared | cubed\n" + "------ | ------- | -----\n";
//
//        System.out.print("Enter a number");
//        int userNumber = scanner.nextInt();
//        int squared = 1;
//        int cubed = 1;
//
//        for (int end = 1; end <= userNumber; end++) {
//            squared = end * end;
//            cubed = end * end * end;
//            graph += end + "      |" + squared + "        |" + cubed + "\n";
//
//        }
//
//        System.out.println(graph);


//        System.out.print("Enter a grade");
        String grade = "";
        String grades = "";
        boolean enteringGrades;

        System.out.print("Do you need to enter grades?");
        do {
            if (scanner.nextLine().equals("yes")) {
                System.out.print("Please enter a grade");
                int userGradeNumber = scanner.nextInt();
                if (userGradeNumber <= 100 && userGradeNumber >= 88) {
                    grade = "A";
                    grades += grade + ", ";
                }
                if (userGradeNumber <= 87 && userGradeNumber >= 80) {
                    grade = "B";
                    grades += grade + ", ";
                }
                if (userGradeNumber <= 79 && userGradeNumber >= 67) {
                    grade = "C";
                    grades += grade + ", ";
                }
                if (userGradeNumber <= 66 && userGradeNumber >= 60) {
                    grade = "D";
                    grades += grade + ", ";
                }
                if (userGradeNumber <= 59 && userGradeNumber >= 0) {
                    grade = "F";
                    grades += grade + ", ";
                }
                System.out.print("Do you need to enter another grade?");
                if (scanner.nextLine().equals("no")) {
                    enteringGrades = false;
                } else {
                    enteringGrades = true;
                }
            } else {
                enteringGrades = false;
            }
        } while (enteringGrades);

        System.out.println("The grades are " + grades);

    }
}
