package lab4;

public class Circle {
	Point A;
	double r;
	
	public Cirlce(Point A, double r) {
		this.A = A;
        this.r = r;
	}
	
	public double perimeter() {
		return 2 * r * Math.PI;
	}
	
	public double area() {
		return Math.PI * r * r;
	}
}
