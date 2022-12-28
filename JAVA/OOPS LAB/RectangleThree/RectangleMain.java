package RectangleThree;

public class RectangleMain {
  public static void main(String[] args) {
    // create a rectangle object
    Rectangle rect = new Rectangle(5, 10);
    System.out.println("Area of rectangle: " + rect.getArea());
    System.out.println("Perimeter of rectangle: " + rect.getPerimeter());
    
    // create a box object
    Box box = new Box(5, 10, 15);
    System.out.println("Volume of box: " + box.getVolume());
  }
}