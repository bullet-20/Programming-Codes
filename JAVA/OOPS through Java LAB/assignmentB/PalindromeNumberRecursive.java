package assignmentB;

import java.util.Scanner;

public class PalindromeNumberRecursive {
   public static boolean isPalindrome(int num) {
      if (num < 10) {
         return true;
      }
      int digits = 0;
      int temp = num;
      while (temp > 0) {
         digits++;
         temp /= 10;
      }
      int divisor = (int) Math.pow(10, digits - 1);
      int firstDigit = num / divisor;
      int lastDigit = num % 10;
      if (firstDigit != lastDigit) {
         return false;
      }
      int remaining = num % divisor;
      remaining = remaining / 10;
      return isPalindrome(remaining);
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = scan.nextInt();
      if (isPalindrome(num)) {
         System.out.println(num + " is a palindrome number.");
      } else {
         System.out.println(num + " is not a palindrome number.");
      }
   }
}
