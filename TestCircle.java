import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestCircle {	
	 
	@Test
	void testPerimeter() {
		Point A = new Point(0,0);
		double r = 3;
		Circle a = new Circle(A,r);
		assertEquals(a.perimeter(), 6*Math.pi);
	}
	
	@Test
	void testArea() {
		Point A = new Point(0,0);
        double r = 3;
		Triangle a = new Triangle(A,r);
		assertEquals(a.area(), Math.pi*9);
	}
}