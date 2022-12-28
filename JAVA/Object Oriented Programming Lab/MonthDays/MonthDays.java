package MonthDays;

public class MonthDays {
  private int month;
  private int year;

  // Constructor that accepts two arguments: month and year
  public MonthDays(int month, int year) {
    this.month = month;
    this.year = year;
  }

  // Method that returns the number of days in the specified month
  public int getNumberOfDays() {
    // Array of the number of days in each month
    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Check if the year is a leap year
    boolean isLeapYear = (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);

    // If the year is a leap year and the month is February, return 29 days
    if (isLeapYear && month == 2) {
      return 29;
    } else {
      // Otherwise, return the number of days in the specified month
      return daysInMonth[month - 1];
    }
  }
}
