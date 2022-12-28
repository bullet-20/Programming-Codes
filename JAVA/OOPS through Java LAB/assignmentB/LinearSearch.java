package assignmentB;

import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    int target;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the target number: ");
    target = scan.nextInt();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == target) {
        System.out.println("Number found at index: " + i);
        return;
      }
    }
    System.out.println("Number not found in the array.");
  }
}
