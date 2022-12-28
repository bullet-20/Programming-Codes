package StringUtils;

/* design a String class that perform String Method (Equal, Reverse
the string, change case, trim etc.) */

public class StringUtils {
  // method to check if two strings are equal
  public static boolean isEqual(String str1, String str2) {
    return str1.equals(str2);
  }
  
  // method to reverse a string
  public static String reverse(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }
  
  // method to convert a string to uppercase
  public static String toUpperCase(String str) {
    return str.toUpperCase();
  }
  
  // method to convert a string to lowercase
  public static String toLowerCase(String str) {
    return str.toLowerCase();
  }
  
  // method to trim leading and trailing whitespace from a string
  public static String trim(String str) {
    return str.trim();
  }
}
