package assignmentB;

import java.util.Scanner;

public class PalindromeNumber {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = scan.nextInt();
      int originalNum = num;
      int reverse = 0;
      while (num > 0) {
         int digit = num % 10;
         reverse = reverse * 10 + digit;
         num /= 10;
      }
      if (reverse == originalNum) {
         System.out.println(originalNum + " is a palindrome number.");
      } else {
         System.out.println(originalNum + " is not a palindrome number.");
      }
   }
}
