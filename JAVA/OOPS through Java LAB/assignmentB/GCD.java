package assignmentB;

import java.util.Scanner;

public class GCD {
   public static int findGCD(int num1, int num2) {
      if (num2 == 0) {
         return num1;
      }
      return findGCD(num2, num1 % num2);
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int num1 = scan.nextInt();
      System.out.print("Enter second number: ");
      int num2 = scan.nextInt();
      int gcd = findGCD(num1, num2);
      System.out.println("GCD of " + num1 + " and " + num2 + ": " + gcd);
   }
}
