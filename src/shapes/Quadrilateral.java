package shapes;
import util.Input;

import java.util.Scanner;


abstract class Quadrilateral implements Measurable {

    public int length;
    public int width;
    Scanner sc = new Scanner(System.in);
    Input input = new Input(sc);

    public Quadrilateral (int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        System.out.println("What is the length");
        length = input.getInt();
        return length;
    }

    public int getWidth() {
        System.out.println("What is the width");
        length = input.getInt();
        return width;
    }

    public abstract void setWidth();

    public abstract void setLength();
}
