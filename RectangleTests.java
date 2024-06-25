package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTests {

	@Test
	void test_perimeter() {
		Rectangle rec = new Rectangle(new Point(0, 5), 5, 3, 0);

		assertEquals(rec.perimeter(), 16);
	}

	@Test
	void test_area() {
		Rectangle rec = new Rectangle(new Point(0,0), 12, 4, 1);

		assertEquals(rec.area(), 48);
	}

	@Test
	void test_if_is_square() {
		Rectangle rec = new Rectangle(new Point(2,3), 2, 2, 0);

		assertTrue(rec.isSquare());
	}

	@Test
	void test_if_is_not_square() {
		Rectangle rec = new Rectangle(new Point(4,6), 19, 1, 2);

		assertFalse(rec.isSquare());
	}
}
