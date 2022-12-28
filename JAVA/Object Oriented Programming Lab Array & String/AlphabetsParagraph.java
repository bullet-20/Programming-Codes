import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlphabetsParagraph {
  public static void main(String[] args) {
    // Read the paragraph from the user
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the paragraph: ");
    String paragraph = scan.nextLine();

    // Split the paragraph into tokens based on the occurrence of particular characters
    String[] tokens = paragraph.split("[^a-zA-Z0-9']+");

    // Sort the tokens and remove duplicates
    List<String> sortedTokens = new ArrayList<>();
    for (String token : tokens) {
      if (!sortedTokens.contains(token)) {
        sortedTokens.add(token);
      }
    }
    sortedTokens.sort(String::compareToIgnoreCase);

    // Print the sorted and deduplicated tokens
    System.out.println("Sorted tokens: " + Arrays.toString(sortedTokens.toArray()));
  }
}
