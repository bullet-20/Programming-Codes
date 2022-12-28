package assignmentA;

import java.util.Scanner;

public class ArmstrongNumber {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = scan.nextInt();
      int originalNum = num;
      int digits = 0;
      while (num > 0) {
         digits++;
         num /= 10;
      }
      int sum = 0;
      num = originalNum;
      while (num > 0) {
         int digit = num % 10;
         sum += Math.pow(digit, digits);
         num /= 10;
      }
      if (sum == originalNum) {
         System.out.println(originalNum + " is an Armstrong number.");
      } else {
         System.out.println(originalNum + " is not an Armstrong number.");
      }
   }
}