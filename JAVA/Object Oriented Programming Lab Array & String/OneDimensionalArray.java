
public class OneDimensionalArray {
  public static void main(String[] args) {
    // Initialize the array with test data
    int[] testData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Print the total of the values in the array
    System.out.println("Total: " + getTotal(testData));

    // Print the average of the values in the array
    System.out.println("Average: " + getAverage(testData));

    // Print the highest value in the array
    System.out.println("Highest: " + getHighest(testData));

    // Print the lowest value in the array
    System.out.println("Lowest: " + getLowest(testData));
  }

  // Method to return the total of the values in the array
  public static int getTotal(int[] array) {
    int total = 0;
    for (int value : array) {
      total += value;
    }
    return total;
  }

  // Method to return the average of the values in the array
  public static double getAverage(int[] array) {
    return (double) getTotal(array) / array.length;
  }

  // Method to return the highest value in the array
  public static int getHighest(int[] array) {
    int highest = array[0];
    for (int value : array) {
      if (value > highest) {
        highest = value;
      }
    }
    return highest;
  }

  // Method to return the lowest value in the array
  public static int getLowest(int[] array) {
    int lowest = array[0];
    for (int value : array) {
      if (value < lowest) {
        lowest = value;
      }
    }
    return lowest;
  }
}
