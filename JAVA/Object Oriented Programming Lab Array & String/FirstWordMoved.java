import java.util.Scanner;

public class FirstWordMoved {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Prompt the user to enter a line of text
    System.out.print("Enter a line of text. No punctuation please: ");
    String line = scan.nextLine();

    // Find the index of the first space in the line
    int spaceIndex = line.indexOf(" ");

    // Extract the first word and the rest of the line
    String firstWord = line.substring(0, spaceIndex);
    String restOfLine = line.substring(spaceIndex + 1);

    // Reassemble the line with the first word moved to the end
    String rephrasedLine = restOfLine + " " + firstWord;

    // Capitalize the first word of the rephrased line
    rephrasedLine = rephrasedLine.substring(0, 1).toUpperCase() + rephrasedLine.substring(1);

    // Display the rephrased line
    System.out.println("I have rephrased that line to read: " + rephrasedLine);
  }
}
