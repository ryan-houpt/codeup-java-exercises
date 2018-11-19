package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication{

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student Joe = new Student("Joe");
        Joe.addGrade(10);
        Joe.addGrade(10);
        Joe.addGrade(10);
        Student Billy = new Student("Billy");
        Billy.addGrade(15);
        Billy.addGrade(15);
        Billy.addGrade(15);
        Student Jeffrey = new Student("Jeffrey");
        Jeffrey.addGrade(50);
        Jeffrey.addGrade(50);
        Jeffrey.addGrade(50);
        Student Mark = new Student("Mark");
        Mark.addGrade(50);
        Mark.addGrade(50);
        Mark.addGrade(50);

        students.put("Joe", Joe);
        students.put("Bob", Billy);
        students.put("Jeff", Jeffrey);
        students.put("Mark", Mark);


        boolean browsing = true;
        Scanner sc = new Scanner(System.in);
        Input input = new Input(sc);


       do {
           System.out.println("Welcome!\n\n" +
                   "Here are the github usernames of our students: \n\n"
                   + students.keySet() + "\n\n" +
                   "What would you like to do? \n" +
                   "Check grades? (grades)\n" +
                   "Add a student (add)\n");

           String userDecision = input.getString().toLowerCase();

           if (userDecision.equals("grades")) {

               System.out.println("Which student did you want to see grades for? \n\n"
               + students.keySet());

               String userInput = input.getString();

               Object selectedStudent = students.get(userInput).grades;


               System.out.println(selectedStudent);

           } if (userDecision.equals("add")) {

               System.out.println("What is the name of the new student?");
               String newStudentName = input.getString();
               Student newestStudent = new Student(newStudentName);
               System.out.println("What grade did " + newStudentName + " get?");
               int newStudentGrade = input.getInt();
               newestStudent.addGrade(newStudentGrade);
               students.put(newStudentName, newestStudent);
               System.out.println("New student added!");

           }

           System.out.println("\n" +
                   " Would you like to search grades or add another name? y/n");

           String choice = input.getString();
           if (choice.equals("n")) {
               browsing = false;
           }

       } while (browsing);



    }

}
