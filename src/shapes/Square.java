package shapes;

public class Square extends Rectangle {

    public Square (int side) {
        super(side, side);
    }

    public int getArea(int side) {
        return side * 4;
    }

}
