package assignmentB;

import java.util.Scanner;

public class PrimeNumbersFunction {
  public static void main(String[] args) {
    int start, end;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the start of the interval: ");
    start = scan.nextInt();
    System.out.print("Enter the end of the interval: ");
    end = scan.nextInt();

    displayPrimeNumbers(start, end);
  }

  public static void displayPrimeNumbers(int start, int end) {
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
