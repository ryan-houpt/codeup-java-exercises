package shapes;
import util.Input;
import java.util.Scanner;



public class CircleApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input input = new Input(sc);

        System.out.println("What is the radius of the circle");

        double radius = input.getDouble();

        Circle circle = new Circle(radius);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }

}
