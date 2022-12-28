import java.util.Scanner;

public class Favorite {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Prompt the user to enter their favorite color
    System.out.print("Enter your favorite color: ");
    String color = scan.nextLine();

    // Prompt the user to enter their favorite food
    System.out.print("Enter your favorite food: ");
    String food = scan.nextLine();

    // Prompt the user to enter their favorite animal
    System.out.print("Enter your favorite animal: ");
    String animal = scan.nextLine();

    // Prompt the user to enter the first name of a friend or relative
    System.out.print("Enter the first name of a friend or relative: ");
    String name = scan.nextLine();

    // Print the message using the user's input
    System.out.println("I had a dream that " + name + " ate a " + color + " " + animal + " and said it tasted like " + food + "!");
  }
}
