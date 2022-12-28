package RectangleThree;

/* create a Simple class to find out the Area and perimeter of rectangle and
box using super and this keyword */

public class Rectangle {
  // instance variables
  protected double length;
  protected double width;
  
  // constructor
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  
  // methods
  public double getArea() {
    return length * width;
  }
  
  public double getPerimeter() {
    return 2 * (length + width);
  }
}

class Box extends Rectangle {
  // instance variable
  protected double height;
  
  // constructor
  public Box(double length, double width, double height) {
    super(length, width);
    this.height = height;
  }
  
  // method
  public double getVolume() {
    return getArea() * height;
  }
}