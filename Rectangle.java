public class Rectangle{
  Point A; // one vertex
  Point B; // the other one
  
  public Rectangle(Point A, Point B){
    this.A = A;
    this.B = B;
  }

  public double length(){
    // returns the size of the horizontal side of the rectangle
    return Math.abs(A.x - B.x);
  }

  public double width(){
    // returns the size of the vertical side of the rectangle
    return Math.abs(A.y - B.y);
  }
  
  public double perimeter(){
    // returns the perimeter of the rectangle
    return this.width()*2 + this.length()*2;
  }

  public double area(){
    return this.width()*this.length();
  }
  
  public boolean isSquare(){
    // returns whether or not the rectangle is a square
    return this.length() == this.width();
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(obj == null){
      return false;
    }
    if(obj.getClass() != this.getClass()){
      return false;
    }
    Square other = (Square)obj;
    if(this.length() != other.length()){
      return false;
    }
    if(this.width() != other.width()){
      return false;
    }
    return true;
  }
}
