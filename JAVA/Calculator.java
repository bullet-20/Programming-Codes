import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the first number:");
    double num1 = scan.nextDouble();

    System.out.println("Enter the second number:");
    double num2 = scan.nextDouble();

    System.out.println("Enter the operation (+, -, *, /):");
    char operation = scan.next().charAt(0);

    double result;

    switch (operation) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        System.out.println("Invalid operator");
        return;
    }

    System.out.println("Result: " + result);
  }
}
