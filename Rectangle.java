package lab4;

public class Rectangle {
    private Point pivot; // Top left corner
    private double height;
    private double width;
    private double rotation; // in radian, i.e., 2pi is 360 degrees

    public Rectangle(Point pivot, double height, double width, double rotation) {
        this.pivot = pivot;
        this.height = height;
        this.width = width;
        this.rotation = rotation;
    }

    public double perimeter() {
        return 2 * (height + width);
    }

    public double area() {
        return height * width;
    }

    public boolean isSquare() {
        return height == width;
    }
}
