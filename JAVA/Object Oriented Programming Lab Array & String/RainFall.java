import java.util.Arrays;

public class RainFall {
  // Array to store the rainfall for each month
  private double[] rainfall;

  // Constructor that initializes the rainfall array with the given values
  public RainFall(double[] rainfall) {
    this.rainfall = rainfall;
  }

  // Method to return the total rainfall for the year
  public double getTotalRainfall() {
    double total = 0;
    for (double rain : rainfall) {
      total += rain;
    }
    return total;
  }

  // Method to return the average monthly rainfall
  public double getAverageRainfall() {
    return getTotalRainfall() / rainfall.length;
  }

  // Method to return the month with the most rain
  public int getMonthWithMostRain() {
    int index = 0;
    double maxRain = rainfall[0];
    for (int i = 1; i < rainfall.length; i++) {
      if (rainfall[i] > maxRain) {
        maxRain = rainfall[i];
        index = i;
      }
    }
    return index + 1;
  }

  // Method to return the month with the least rain
  public int getMonthWithLeastRain() {
    int index = 0;
    double minRain = rainfall[0];
    for (int i = 1; i < rainfall.length; i++) {
      if (rainfall[i] < minRain) {
        minRain = rainfall[i];
        index = i;
      }
    }
    return index + 1;
  }

  // Method to return a string representation of the object
  public String toString() {
    return Arrays.toString(rainfall);
  }
  
  public static void main(String[] args) {
    // Create an instance of the RainFall class with the given rainfall values
    RainFall rainfall = new RainFall(new double[] {2.3, 3.5, 1.2, 4.5, 3.5, 2.3,
        3.5, 1.2, 4.5, 3.5, 2.3, 3.5});
  
    // Print the total rainfall for the year
    System.out.println("Total rainfall: " + rainfall.getTotalRainfall());
  
    // Print the average monthly rainfall
    System.out.println("Average monthly rainfall: " + rainfall.getAverageRainfall());
  
    // Print the month with the most rain
    System.out.println("Month with most rain: " + rainfall.getMonthWithMostRain());
  
    // Print the month with the least rain
    System.out.println("Month with least rain: " + rainfall.getMonthWithLeastRain());
  }
  
}
