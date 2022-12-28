package Employee;

public class EmployeeMain {
  public static void main(String[] args) {
    // Create three Employee objects
    Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
    Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
    Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
    
    // Display the data for each employee
    System.out.println("Name: " + employee1.getName());
    System.out.println("ID number: " + employee1.getIdNumber());
    System.out.println("Department: " + employee1.getDepartment());
    System.out.println("Position: " + employee1.getPosition());
    
    System.out.println("Name: " + employee2.getName());
    System.out.println("ID number: " + employee2.getIdNumber());
    System.out.println("Department: " + employee2.getDepartment());
    System.out.println("Position: " + employee2.getPosition());
    
    System.out.println("Name: " + employee3.getName());
    System.out.println("ID number: " + employee3.getIdNumber());
    System.out.println("Department: " + employee3.getDepartment());
    System.out.println("Position: " + employee3.getPosition());
  }

}