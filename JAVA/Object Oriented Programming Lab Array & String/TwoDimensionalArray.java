
public class TwoDimensionalArray {
  public static void main(String[] args) {
    // Create a two-dimensional array with test data
    int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // Demonstrate the getTotal method
    System.out.println("Total of all values in the array: " + getTotal(testArray));

    // Demonstrate the getAverage method
    System.out.println("Average of all values in the array: " + getAverage(testArray));

    // Demonstrate the getRowTotal method
    System.out.println("Total of values in row 0: " + getRowTotal(testArray, 0));

    // Demonstrate the getColumnTotal method
    System.out.println("Total of values in column 1: " + getColumnTotal(testArray, 1));

    // Demonstrate the getHighestInRow method
    System.out.println("Highest value in row 1: " + getHighestInRow(testArray, 1));

    // Demonstrate the getLowestInRow method
    System.out.println("Lowest value in row 2: " + getLowestInRow(testArray, 2));
  }

  // Method to return the total of all values in a two-dimensional array
  public static int getTotal(int[][] array) {
    int total = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        total += array[i][j];
      }
    }
    return total;
  }

  // Method to return the average of all values in a two-dimensional array
  public static double getAverage(int[][] array) {
    int total = getTotal(array);
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      count += array[i].length;
    }
    return (double) total / count;
  }

  // Method to return the total of values in a specific row of a two-dimensional array
  public static int getRowTotal(int[][] array, int row) {
    int total = 0;
    for (int i = 0; i < array[row].length; i++) {
      total += array[row][i];
    }
    return total;
  }

  // Method to return the total of values in a specific column of a two-dimensional array
  public static int getColumnTotal(int[][] array, int column) {
    int total = 0;
    for (int i = 0; i < array.length; i++) {
      total += array[i][column];
    }
    return total;
  }

   // Method to get the highest value in a row of the array
   public static int getHighestInRow(int[][] array, int rowIndex) {
    int highest = array[rowIndex][0];
    for (int value : array[rowIndex]) {
        if (value > highest) {
            highest = value;
        }
    }
    return highest;
}

    // Method to return the lowest value in a specific row of a two-dimensional array
    public static int getLowestInRow(int[][] array, int row) {
      int lowest = array[row][0];
      for (int i = 1; i < array[row].length; i++) {
        if (array[row][i] < lowest) {
          lowest = array[row][i];
        }
      }
      return lowest;
    }
  }
  