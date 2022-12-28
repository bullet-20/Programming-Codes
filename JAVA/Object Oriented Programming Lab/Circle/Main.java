package Circle;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Ask the user for the circle's radius
    System.out.print("Enter the radius of the circle: ");
    double radius = scan.nextDouble();

    // Create a Circle object
    Circle circle = new Circle(radius);

    // Report the circle's area, diameter, and circumference
    System.out.println("Area: " + circle.getArea());
    System.out.println("Diameter: " + circle.getDiameter());
    System.out.println("Circumference: " + circle.getCircumference());
  }
}
