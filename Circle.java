package lab4;

public class Circle{
  Point A;
  double r;
  
  public Circle(Point A, double r){
    this.A = A;
    this.r = r;
  }
  
  public Circle(Point A, Point B){
    this.A = A;
    this.r = A.distance(B); //A be center, B is a point on circle
  }
  
  public double area(){
    return this.r * this.r * Math.PI;
  }
  
  public double perimeter(){
    return this.r * 2 * Math.PI;
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
    Circle other = (Circle)obj;
    if(!this.A.equals(other.A)){
      return false;
    }
    if(Math.abs(this.r - other.r) >= 1e-9){
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
      return A.hashCode() * 31 + (int) (r * 700 * r);
  }
}
