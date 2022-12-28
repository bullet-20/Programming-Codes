package assignmentB;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] numbers = {10, 7, 8, 9, 1, 5};

    quickSort(numbers, 0, numbers.length - 1);

    System.out.println(Arrays.toString(numbers));
  }

  public static void quickSort(int[] numbers, int start, int end) {
    if (start < end) {
      int partitionIndex = partition(numbers, start, end);

      quickSort(numbers, start, partitionIndex - 1);
      quickSort(numbers, partitionIndex + 1, end);
    }
  }

  public static int partition(int[] numbers, int start, int end) {
    int pivot = numbers[end];
    int i = start - 1;

    for (int j = start; j < end; j++) {
      if (numbers[j] < pivot) {
        i++;
        swap(numbers, i, j);
      }
    }

    swap(numbers, i + 1, end);
    return i + 1;
  }

  public static void swap(int[] numbers, int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }
}
