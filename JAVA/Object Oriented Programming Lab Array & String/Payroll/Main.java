package Payroll;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Payroll payroll = new Payroll();
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < payroll.employeeId.length; i++) {
      int id = payroll.employeeId[i];
      System.out.println("Enter hours worked for employee " + id + ": ");
      int hours = scan.nextInt();
      while (hours < 0) {
        System.out.println("Hours worked must be a positive number. Please try again.");
        hours = scan.nextInt();
      }
      payroll.setHours(id, hours);

      System.out.println("Enter pay rate for employee " + id + ": ");
      double payRate = scan.nextDouble();
      while (payRate < 6.00) {
        System.out.println("Pay rate must be at least 6.00. Please try again.");
        payRate = scan.nextDouble();
      }
      payroll.setPayRate(id, payRate);
    }

    payroll.calculateWages();

    for (int i = 0; i < payroll.employeeId.length; i++) {
      int id = payroll.employeeId[i];
      double grossPay = payroll.getGrossPay(id);
      System.out.println("Employee ID: " + id + ", Gross Pay: " + grossPay);
    }
  }
}