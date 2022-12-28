import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Prompt the user for the password length
    System.out.print("Enter the desired password length: ");
    int length = scan.nextInt();

    // Prompt the user for whether to include special characters
    System.out.print("Include special characters in the password? (y/n): ");
    boolean includeSpecial = scan.next().equalsIgnoreCase("y");

    // Generate the password
    String password = generatePassword(length, includeSpecial);

    // Print the generated password
    System.out.println("Generated password: " + password);
  }

  public static String generatePassword(int length, boolean includeSpecial) {
    // Set the characters that can be used in the password
    String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    if (includeSpecial) {
      characters += "!@#$%^&*()_+-=[]{}|;':\",./<>?";
    }

    // Create a random number generator
    Random rng = new Random();

    // Create a StringBuilder to hold the password
    StringBuilder password = new StringBuilder();

    // Generate random characters and append them to the password
    for (int i = 0; i < length; i++) {
      password.append(characters.charAt(rng.nextInt(characters.length())));
    }

    // Return the generated password
    return password.toString();
  }
}
