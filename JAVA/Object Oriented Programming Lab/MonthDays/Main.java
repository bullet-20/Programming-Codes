package MonthDays;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Ask the user to enter the month and the year
    System.out.print("Enter a month (1-12): ");
    int month = scan.nextInt();
    System.out.print("Enter a year: ");
    int year = scan.nextInt();

    // Create a MonthDays object
    MonthDays monthDays = new MonthDays(month, year);

    // Display the number of days in the specified month
    System.out.println(monthDays.getNumberOfDays() + " days");
  }
}
