/*  average, sum, min and max of N numbers using user input: */

import java.util.Scanner;

public class Main1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = scan.nextInt();

    int sum = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      System.out.print("Enter element " + (i+1) + ": ");
      int num = scan.nextInt();

      sum += num;
      min = Math.min(min, num);
      max = Math.max(max, num);
    }

    double avg = (double) sum / n;

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + avg);
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
  }
}
