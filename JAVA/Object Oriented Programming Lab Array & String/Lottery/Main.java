package Lottery;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Lottery lottery = new Lottery();
    Scanner scan = new Scanner(System.in);

    int[] userNumbers = new int[5];
    System.out.println("Enter your lottery picks (5 numbers between 0 and 9):");
    for (int i = 0; i < userNumbers.length; i++) {
      userNumbers[i] = scan.nextInt();
    }

    int matchingDigits = lottery.compareNumbers(userNumbers);
    System.out.println("Number of matching digits: " + matchingDigits);
    if (matchingDigits == 5) {
      System.out.println("Congratulations! You are a grand prize winner!");
    }

    int[] winningNumbers = lottery.getLotteryNumbers();
    System.out.print("Winning numbers: ");
    for (int i = 0; i < winningNumbers.length; i++) {
      System.out.print(winningNumbers[i] + " ");
    }
    System.out.println();
  }
}
