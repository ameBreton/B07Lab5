public class Rectangle{
  Point A; // one vertex
  Point B; // the other one
  
  public Rectangle(Point A, Point B){
    this.A = A;
    this.B = B;
  }

  public double length(){
    // returns the size of the horizontal side of the rectangle
    return A.x + B.x;
  }

  public double width(){
    // returns the size of the vertical side of the rectangle
    return A.y + B.y;
  }
  
  public double perimeter(){
    // returns the perimeter of the rectangle
    return this.width()*2 + this.length()*2;
  }
  public boolean isSquare(){
    // returns whether or not the rectangle is a square
    return this.length() == this.width();
  }
}
