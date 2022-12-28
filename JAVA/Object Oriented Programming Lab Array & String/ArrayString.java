/* create array of string of 10 elements. Further sort the
array in ascending order. */

import java.util.Arrays;

public class ArrayString {
  public static void main(String[] args) {
    // Create an array of strings
    String[] array = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "huckleberry", "ice cream", "jicama"};

    // Sort the array in ascending order
    Arrays.sort(array);

    // Print the sorted array
    for (String s : array) {
      System.out.println(s);
    }
  }
}
