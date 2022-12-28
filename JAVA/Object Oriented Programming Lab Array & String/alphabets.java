import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class alphabets {
  public static void main(String[] args) {
    // The paragraph to be converted to tokens
    String paragraph = "abcdefghijklmnopqrstuvwxyz";

    // The size of the tokens
    int tokenSize = 3;

    // Calculate the number of tokens
    int numTokens = paragraph.length() / tokenSize;
    if (paragraph.length() % tokenSize > 0) {
      numTokens++;
    }

    // Extract the tokens from the paragraph
    String[] tokens = new String[numTokens];
    for (int i = 0; i < numTokens; i++) {
      int startIndex = i * tokenSize;
      int endIndex = Math.min(startIndex + tokenSize, paragraph.length());
      tokens[i] = paragraph.substring(startIndex, endIndex);
    }

    // Sort the tokens in ascending order
    Arrays.sort(tokens);

    // Remove the duplicate tokens
    Set<String> set = new HashSet<>(Arrays.asList(tokens));
    String[] sortedArray = set.toArray(new String[0]);

    // Print the sorted array
    for (String s : sortedArray) {
      System.out.println(s);
    }
  }
}
