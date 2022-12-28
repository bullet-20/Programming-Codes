package Circle;

public class Circle {
  private double radius;
  final double PI = 3.14159;

  // Constructor that accepts the radius of the circle as an argument
  public Circle(double radius) {
    this.radius = radius;
  }

  // No-arg constructor that sets the radius field to 0.0
  public Circle() {
    radius = 0.0;
  }

  // Mutator method for the radius field
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // Accessor method for the radius field
  public double getRadius() {
    return radius;
  }

  // Method that returns the area of the circle
  public double getArea() {
    return PI * radius * radius;
  }

  // Method that returns the diameter of the circle
  public double getDiameter() {
    return radius * 2;
  }

  // Method that returns the circumference of the circle
  public double getCircumference() {
    return 2 * PI * radius;
  }
}
