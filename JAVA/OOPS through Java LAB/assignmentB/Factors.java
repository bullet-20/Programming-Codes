package assignmentB;

import java.util.Scanner;

public class Factors {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = scan.nextInt();
      System.out.print("Factors of " + num + ": ");
      for (int i = 1; i <= num; i++) {
         if (num % i == 0) {
            System.out.print(i + " ");
         }
      }
   }
}