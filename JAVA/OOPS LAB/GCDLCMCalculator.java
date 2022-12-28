/* Repeat problem 8 for computing greatest common divisor (GCD) and least
common multiple (LCM) for five integers entered from keyboard. (You should
not use the concept of array) */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCDLCMCalculator {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    // get input from the user
    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    try {
      System.out.print("Enter the first integer number: ");
      number1 = Integer.parseInt(reader.readLine());
      System.out.print("Enter the second integer number: ");
      number2 = Integer.parseInt(reader.readLine());
      System.out.print("Enter the third integer number: ");
      number3 = Integer.parseInt(reader.readLine());
      System.out.print("Enter the fourth integer number: ");
      number4 = Integer.parseInt(reader.readLine());
      System.out.print("Enter the fifth integer number: ");
      number5 = Integer.parseInt(reader.readLine());
    } catch (Exception e) {
      System.out.println("Invalid input format");
      return;
    }
    
    // compute the GCD and LCM of the numbers
    int gcd = computeGCD(number1, number2, number3, number4, number5);
    int lcm = computeLCM(number1, number2, number3, number4, number5);
    
    // display the GCD and LCM of the numbers
    System.out.println("GCD of the numbers: " + gcd);
    System.out.println("LCM of the numbers: " + lcm);
  }
  
  // method to compute the GCD of multiple numbers
  public static int computeGCD(int... numbers) {
    int gcd = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      gcd = computeGCD(gcd, numbers[i]);
    }
    return gcd;
  }
  
  // method to compute the GCD of two numbers using the Euclidean algorithm
  public static int computeGCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return computeGCD(b, a % b);
  }
  
  // method to compute the LCM of multiple numbers
  public static int computeLCM(int... numbers) {
    int lcm = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      lcm = computeLCM(lcm, numbers[i]);
    }
    return lcm;
  }
  
  // method to compute the LCM of two numbers
  public static int computeLCM(int a, int b) {
    return (a * b) / computeGCD(a, b);
  }
}
