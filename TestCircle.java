package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCircle{

  @Test
  void testarea(){
    Point p1 = new Point(1,2.0);
    Circle c1 = new Circle(p1,2);
    double area = c1.area();
    assertEquals(area, 4* Math.PI);
  }
    
  @Test
  void testperimeter(){
    Point p1 = new Point(1.0,2.0);
    Point p2 = new Point(3.0,2.0);
    Circle c1 = new Circle(p1,p2);//c1.r == 1?
    double perimeter = c1.perimeter();
    assertNotEquals(perimeter,2* Math.PI * 1);    
  }

  @Test
  void testequals_A(){
    Point p1 = new Point(1.0,2.0);
    Point p2 = new Point(2.0,1.0);
    Circle c1 = new Circle(p1,1);
    Circle c2 = new Circle(p2,1);
    assertFalse(c1.equals(c2));//c1.A!=c2.A
  }
  @Test
  void testequals_B(){
    Point p1 = new Point(1.0,2.0);
    Point p2 = new Point(1.0, 2.0);
    Circle c1 = new Circle(p1,2);
    Circle c2 = new Circle(p2,1);
    assertFalse(c1.equals(c2));//c1.r!=c2.r
  }

  @Test
  void testequals_C(){
Point p1 = new Point(1.0,2.0);
    Circle c1 = new Circle(p1,2);
    Circle c2 = c1;
    assertTrue(c1.equals(c2));//exactly the same
  }

  @Test
  void testequals_D(){
    Point p1 = new Point(1.0,2.0);
    Circle c1 = new Circle(p1,2);
    Circle c2 = null;
    assertFalse(c1.equals(c2));//null
  }

  @Test
  void testequals_E(){
    Point p1 = new Point(1.0,2.0);
    Circle c1 = new Circle(p1,2);
    assertFalse(c1.equals(1));//point.getclass()!=int.getclass()
  }

  @Test
  void testhashCode() {
	  
	  Point p1 = new Point(1.0,2.0);
	  Point p2 = new Point(3,4);
	  Circle c1 = new Circle(p1,2);
	  Circle c2 = new Circle(p1,p2);
	  assertNotEquals(c1.hashCode(), c2.hashCode());
  } 
}
