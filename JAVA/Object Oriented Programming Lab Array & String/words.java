/* You are given a paragraph consisting of words, Convert this paragraph to
tokens (word) to be stored in array of string in sorted order where sorted
array does not have duplicate words. */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class words {
  public static void main(String[] args) {
    // The paragraph to be converted to tokens
    String paragraph = "This is a paragraph consisting of words. It will be converted to tokens and stored in an array of strings, sorted in ascending order, with no duplicate words.";

    // Split the paragraph into words using the space character as a delimiter
    String[] words = paragraph.split(" ");

    // Sort the words in ascending order
    Arrays.sort(words);

    // Remove the duplicate words
    Set<String> set = new HashSet<>(Arrays.asList(words));
    String[] sortedArray = set.toArray(new String[0]);

    // Print the sorted array
    for (String s : sortedArray) {
      System.out.println(s);
    }
  }
}
