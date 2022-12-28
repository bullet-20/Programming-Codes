/* Get five integer numbers from the keyboard and check whether these numbers
are prime. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeChecker {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    // get input from the user
    int[] numbers = new int[5];
    for (int i = 0; i < 5; i++) {
      System.out.print("Enter an integer number: ");
      String numberString = reader.readLine();
      try {
        numbers[i] = Integer.parseInt(numberString);
      } catch (Exception e) {
        System.out.println("Invalid input format");
        return;
      }
    }
    
    // check whether the numbers are prime
    for (int number : numbers) {
      if (isPrime(number)) {
        System.out.println(number + " is a prime number");
      } else {
        System.out.println(number + " is not a prime number");
      }
    }
  }
  
  // method to check whether a number is prime
  public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}