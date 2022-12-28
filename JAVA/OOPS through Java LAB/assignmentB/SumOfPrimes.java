package assignmentB;

import java.util.Scanner;

public class SumOfPrimes {
  public static void main(String[] args) {
    int number;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = scan.nextInt();

    if (isSumOfPrimes(number)) {
      System.out.println(number + " can be expressed as the sum of two prime numbers.");
    } else {
      System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
    }
  }

  public static boolean isSumOfPrimes(int number) {
    for (int i = 2; i <= number / 2; i++) {
      if (isPrime(i) && isPrime(number - i)) {
        return true;
      }
    }
    return false;
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
