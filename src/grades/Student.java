package grades;

import java.util.ArrayList;
import util.Input;

public class Student {

    private String studentName;
    public static ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return studentName;
    }


    public void addGrade(int grade) {
      grades.add(grade);
    }


    public double getGradeAverage() {
        double sum = 0;
        for(int i = 0; i < grades.size(); i++)
        {
            sum += grades.get(i);
        }
        return sum / (grades.size());
    }


    public static void main(String[] args) {

        Student Bob = new Student("Bob");

        Bob.addGrade(5);
        Bob.addGrade(10);
        Bob.addGrade(20);

        System.out.println(Bob.getGradeAverage());

        System.out.println(grades);


    }
}
