import java.util.Scanner;

public class PayrollDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Create a Payroll object
    Payroll payroll = new Payroll("John Smith", "123456");

    // Ask the user to enter the data for the employee
    System.out.print("Enter hourly pay rate: ");
    payroll.setHourlyPayRate(scan.nextDouble());
    System.out.print("Enter number of hours worked: ");
    payroll.setHoursWorked(scan.nextDouble());

    // Display the amount of gross pay earned
    
    System.out.println("Gross pay: $" + payroll.getGrossPay());
  }
}
