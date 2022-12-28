package Employee;

public class Employee extends EmployeeMain {
  private String name;
  private int idNumber;
  private String department;
  private String position;
  
  // Constructor that accepts name, ID number, department, and position
  public Employee(String name, int idNumber, String department, String position) {
    this.name = name;
    this.idNumber = idNumber;
    this.department = department;
    this.position = position;
  }
  
  // Constructor that accepts name and ID number
  public Employee(String name, int idNumber) {
    this(name, idNumber, "", "");
  }
  
  // No-arg constructor
  public Employee() {
    this("", 0, "", "");
  }
  
  // Mutator methods
  public void setName(String name) {
    this.name = name;
  }
  
  public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }
  
  public void setDepartment(String department) {
    this.department = department;
  }
  
  public void setPosition(String position) {
    this.position = position;
  }
  
  // Accessor methods
  public String getName() {
    return name;
  }
  
  public int getIdNumber() {
    return idNumber;
  }
  
  public String getDepartment() {
    return department;
  }
  
  public String getPosition() {
    return position;
  }
}
