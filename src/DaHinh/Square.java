package DaHinh;

public class Square extends Rectangle {
    private double size;

    public Square(){

    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double width, double length, double size1) {
        super(color, filled, width, length);
        this.size = size1;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    double getArea() {
        return size*size;
    }
    @Override
    double getPerimeter() {
        return 4 * size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                "} " + super.toString();
    }
}
