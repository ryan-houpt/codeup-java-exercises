package shapes;

public class Square extends Quadrilateral {


    public Square(int sides) {
        super(sides, sides);
    }

    public void setWidth() {
        getWidth();
    }

    public void setLength() {
        getLength();
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
}
