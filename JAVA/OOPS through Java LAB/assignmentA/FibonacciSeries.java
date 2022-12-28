package assignmentA;

import java.util.Scanner;

public class FibonacciSeries {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of terms: ");
      int n = scan.nextInt();
      int t1 = 0, t2 = 1;
      System.out.print("Fibonacci series: " + t1 + " " + t2 + " ");
      for (int i = 3; i <= n; i++) {
         int sum = t1 + t2;
         t1 = t2;
         t2 = sum;
         System.out.print(sum + " ");
      }
   }
}