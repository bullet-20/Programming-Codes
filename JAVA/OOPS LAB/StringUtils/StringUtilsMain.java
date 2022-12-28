package StringUtils;

public class StringUtilsMain {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "hello";
    String str3 = "  Hello World!  ";
    
    // check if two strings are equal
    System.out.println("Are str1 and str2 equal? " + StringUtils.isEqual(str1, str2));
    System.out.println("Are str1 and str2 equal (ignore case)? " + StringUtils.isEqual(str1.toLowerCase(), str2.toLowerCase()));
    
    // reverse a string
    System.out.println("Reverse of str1: " + StringUtils.reverse(str1));
    
    // convert a string to uppercase and lowercase
    System.out.println("str1 in uppercase: " + StringUtils.toUpperCase(str1));
    System.out.println("str1 in lowercase: " + StringUtils.toLowerCase(str1));
    
    // trim leading and trailing whitespace from a string
    System.out.println("str3 after trimming: " + "|" + StringUtils.trim(str3) + "|");
  }
}
