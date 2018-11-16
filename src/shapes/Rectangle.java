package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    public void setWidth() {
        getWidth();
    }

    public void setLength() {
        getLength();
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
