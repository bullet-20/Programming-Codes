/* You are required to repeat the problem 5 with constraint that, use buffer class
(bufferedReader) in place of Scanner class for taking the input from keyboard */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class BufferReader {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    // get input from the user
    System.out.print("Enter your name: ");
    String name = reader.readLine();
    System.out.print("Enter your father's name: ");
    String fatherName = reader.readLine();
    System.out.print("Enter your date of birth (dd/mm/yyyy): ");
    String dobString = reader.readLine();
    
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

/* This program is similar to the previous one(Record.java), except that it uses the BufferedReader class to get 
input from the keyboard and reads the input as a string using the readLine method.*/