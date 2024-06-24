public class Square {
    Point p;
    double length;

    public Square(Point p, double length) {
        this.p = p;
        this.length = length;    
    }

    public double area() {
        return length*length;
    }

    public double perimeter() {
        return 4*length;
    }
}
