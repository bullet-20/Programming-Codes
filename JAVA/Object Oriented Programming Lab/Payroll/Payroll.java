public class Payroll {
  private String name;
  private String idNumber;
  private double hourlyPayRate;
  private double hoursWorked;

  // Constructor that accepts the employee's name and ID number as arguments
  public Payroll(String name, String idNumber) {
    this.name = name;
    this.idNumber = idNumber;
  }

  // Accessor and mutator methods for the fields
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getIdNumber() {
    return idNumber;
  }
  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }
  public double getHourlyPayRate() {
    return hourlyPayRate;
  }
  public void setHourlyPayRate(double hourlyPayRate) {
    this.hourlyPayRate = hourlyPayRate;
  }
  public double getHoursWorked() {
    return hoursWorked;
  }
  public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  // Method that returns the employee's gross pay, which is calculated as the
  // number of hours worked multiplied by the hourly pay rate
  public double getGrossPay() {
    return hoursWorked * hourlyPayRate;
  }
}
