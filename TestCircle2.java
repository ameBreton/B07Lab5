package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCircle2 {
	
	@Test
	void testArea() {
		Point p = new Point(2, 2);
		double r = 3.5;
		Circle c = new Circle(p, r);
		assertEquals(Math.PI*12.25, c.area(), 1e-9);
	}
	
	@Test
	void testPerimeter() {
		Point p = new Point(2, 2);
		double r = 3.5;
		Circle c = new Circle(p, r);
		assertEquals(Math.PI*7, c.perimeter(), 1e-9);
	}
	
	@Test
	void testEqualsSameObject() {
		Point p = new Point(2, 2);
		double r = 5.3;
		Circle c = new Circle(p, r);
		assertTrue(c.equals(c));
	}
	
	@Test
	void testEqualsNull() {
		Point p = new Point(2, 2);
		double r = 5.3;
		Circle c = new Circle(p, r);
		assertFalse(c.equals(null));
	}
	
	@Test
	void testEqualsDifferentClass() {
		Point p = new Point(2, 2);
		double r = 5.3;
		Circle c = new Circle(p, r);
		assertFalse(c.equals(2));
	}
	
	@Test
	void testEqualsDifferentCenter() {
		Point p1 = new Point(2, 2);
		double r1 = 5.3;
		Circle c1 = new Circle(p1, r1);
		
		Point p2 = new Point(2, 5);
		double r2 = 5.3;
		Circle c2 = new Circle(p2, r2);
		
		assertFalse(c1.equals(c2));	
	}
	
	@Test
	void testEqualsDifferentRadius() {
		Point p1 = new Point(2, 2);
		double r1 = 5.3;
		Circle c1 = new Circle(p1, r1);
		
		Point p2 = new Point(2, 2);
		double r2 = 5.4;
		Circle c2 = new Circle(p2, r2); 
		
		assertFalse(c1.equals(c2));
	}
	
	@Test
	void testEqualsSameCircle() {
		Point p1 = new Point(2, 3);
		double r1 = 5.3;
		Circle c1 = new Circle(p1, r1);
		
		Point p2 = new Point(2, 3);
		double r2 = 5.3;
		Circle c2 = new Circle(p2, r2); 
		
		assertTrue(c1.equals(c2));
	}
	
	@Test
	void testHashCode() {
		Point p1 = new Point(2, 3);
		double r1 = 5.3;
		Circle c1 = new Circle(p1, r1);
		
		Point p2 = new Point(2, 3);
		double r2 = 5.3;
		Circle c2 = new Circle(p2, r2);
		
		assertEquals(c1.hashCode(), c2.hashCode());
	}
}
