package Lottery;

import java.util.Random;
import java.util.Arrays;

public class Lottery {
  private int[] lotteryNumbers = new int[5];
  private Random random = new Random();

  public Lottery() {
    // Generate random numbers in the range of 0 through 9 for each element in the array
    for (int i = 0; i < lotteryNumbers.length; i++) {
      lotteryNumbers[i] = random.nextInt(10);
    }
  }

  public int compareNumbers(int[] userNumbers) {
    int matchingDigits = 0;
    for (int i = 0; i < lotteryNumbers.length; i++) {
      if (lotteryNumbers[i] == userNumbers[i]) {
        matchingDigits++;
      }
    }
    return matchingDigits;
  }

  public int[] getLotteryNumbers() {
    return Arrays.copyOf(lotteryNumbers, lotteryNumbers.length);
  }
}
