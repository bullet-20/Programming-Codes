package assignmentB;

import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    int target;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the target number: ");
    target = scan.nextInt();

    int start = 0;
    int end = numbers.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (numbers[mid] == target) {
        System.out.println("Number found at index: " + mid);
        return;
      } else if (numbers[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    System.out.println("Number not found in the array.");
  }
}
