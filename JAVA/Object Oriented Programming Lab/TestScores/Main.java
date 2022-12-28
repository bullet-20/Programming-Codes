package TestScores;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ask the user to enter three test scores
    System.out.print("Enter test score 1: ");
    double score1 = input.nextDouble();
    System.out.print("Enter test score 2: ");
    double score2 = input.nextDouble();
    System.out.print("Enter test score 3: ");
    double score3 = input.nextDouble();

    // Create an instance of the TestScores class
    TestScores scores = new TestScores(score1, score2, score3);

    // Display the average of the scores, as reported by the TestScores object
    System.out.println("Average score: " + scores.getAverage());
  }
}
