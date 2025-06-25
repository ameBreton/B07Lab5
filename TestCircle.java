class TestCircle{

  @test
  void testarea(){
    Point p1 = new Point(1.0，2.0);
    Circle c1 = new Circle(p1,2);
    double area = c1.area();
    assertequals(area, 4*math.PI);
  }
    
  @test
  void testperimeter{
    Point p1 = new Point(1.0，2.0);
    Point p2 = new Point(3.0,2.0);
    Circle c1 = new Circle(p1,p2);//c1.r == 1?
    double perimeter = c1.perimeter();
    assertequals(perimeter, 2* math.PI * 1);    
  }

  @test
  void testequals_A{
    Point p1 = new Point(1.0，2.0);
    Point p2 = new Point(2,0, 1.0);
    Circle c1 = new Circle(p1,1);
    Circle c2 = new Circle(p2,1);
    asserfalse(c1.equals(c2));//c1.A!=c2.A
  }
  @test
  void testequals_B{
    Point p1 = new Point(1.0，2.0);
    Point p2 = new Point(1.0, 2.0);
    Circle c1 = new Circle(p1,2);
    Circle c2 = new Circle(p2,1);
    asserfalse(c1.equals(c2));//c1.r!=c2.r
  }

  @test
  void testequals_C{
    Point p1 = new Point(1.0，2.0);
    Circle c1 = new Circle(p1,2);
    Circle c2 = c1
    asserTrue(c1.equals(c2));//exactly the same
  }

  @test
  void testequals_D{
    Point p1 = new Point(1.0，2.0);
    Circle c1 = new Circle(p1,2);
    Circle c2 = null
    asserfalse(c1.equals(c2));//null
  }

  @test
  void testequals_E{
    Point p1 = new Point(1.0，2.0);
    Circle c1 = new Circle(p1,2);
    asserTrue(c1.equals(1));//point.getclass()!=int.getclass()
  }




  
}
