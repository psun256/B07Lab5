package Lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testArea() {
		Point p = new Point(0,0); 
		Square s =  new Square(p, 4); 
		assertEquals(s.area(), 16); 
	
	}
	
	@Test
	void testArea2() {
		Point p = new Point(5,5); 
		Square s =  new Square(p, 5); 
		assertEquals(s.area(), 25); 
	
	}
	
	@Test
	void testPerimeter() {
		Point p = new Point(5,5); 
		Square s =  new Square(p, 5); 
		assertEquals(s.perimeter(), 20); 
	
	}
	
	

}
