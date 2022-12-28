/* compute perimeter of a rectangle where length and breadth
are taken as float and double respectively from the keyboard. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PerimeterOfRectangle {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    // get input from the user
    System.out.print("Enter the length of the rectangle (float): ");
    String lengthString = reader.readLine();
    System.out.print("Enter the breadth of the rectangle (double): ");
    String breadthString = reader.readLine();
    
    // parse the input strings
    float length = 0;
    double breadth = 0;
    try {
      length = Float.parseFloat(lengthString);
      breadth = Double.parseDouble(breadthString);
    } catch (Exception e) {
      System.out.println("Invalid input format");
      return;
    }
    
    // compute the perimeter of the rectangle
    double perimeter = 2 * (length + (int)breadth);
    
    // display the perimeter
    System.out.println("Perimeter of the rectangle: " + perimeter);
  }
}

/* This program uses the BufferedReader class to get input from the keyboard and reads the 
input as a string using the readLine method. It then parses the input strings using the parseFloat and 
parseDouble methods of the Float and Double classes, respectively. Finally, it calculates the perimeter 
of the rectangle by casting the breadth value to an int and multiplying it by 2. */