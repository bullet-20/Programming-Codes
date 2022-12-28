/* maintain your own record that includes your name, father’s
name, date of birth, age */

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Record {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    // get input from the user
    System.out.print("Enter your name: ");
    String name = scan.nextLine();
    System.out.print("Enter your father's name: ");
    String fatherName = scan.nextLine();
    System.out.print("Enter your date of birth (dd/mm/yyyy): ");
    String dobString = scan.nextLine();
    
    // parse the date of birth string
    Date dob = null;
    try {
      Calendar calendar = Calendar.getInstance();
      int day = Integer.parseInt(dobString.substring(0, 2));
      int month = Integer.parseInt(dobString.substring(3, 5));
      int year = Integer.parseInt(dobString.substring(6));
      calendar.set(year, month - 1, day);
      dob = calendar.getTime();
    } catch (Exception e) {
      System.out.println("Invalid date of birth format");
      return;
    }
    
    // compute the current age
    Calendar today = Calendar.getInstance();
    Calendar dobCalendar = Calendar.getInstance();
    dobCalendar.setTime(dob);
    int ageYears = today.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
    int ageMonths = today.get(Calendar.MONTH) - dobCalendar.get(Calendar.MONTH);
    int ageDays = today.get(Calendar.DAY_OF_MONTH) - dobCalendar.get(Calendar.DAY_OF_MONTH);
    if (ageDays < 0) {
      ageMonths--;
      ageDays += today.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
    if (ageMonths < 0) {
      ageYears--;
      ageMonths += 12;
    }
    
    // display the personal record
    System.out.println("Name of the student: " + name);
    System.out.println("Father's name: " + fatherName);
    System.out.println("Date of birth: " + dobString);
    System.out.println("Age: " + ageYears + " years, " + ageMonths + " months, " + ageDays + " days");
  }
}
