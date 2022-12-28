import java.util.Scanner;

public class JaggedArray {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

    // Input original jagged array
    System.out.println("Enter the number of rows for the original jagged array:");
    int rows = scan.nextInt();
    int[][] jaggedArray = new int[rows][];

    System.out.println("Enter the elements of the original jagged array:");
    for (int i = 0; i < rows; i++) {
        System.out.println("Enter the number of columns for row " + (i+1) + ":");
        int cols = scan.nextInt();
        jaggedArray[i] = new int[cols];

        for (int j = 0; j < cols; j++) {
            jaggedArray[i][j] = scan.nextInt();
        }
    }

    // Transpose jagged array
    int[][] transposeArray = new int[jaggedArray[0].length][jaggedArray.length];
    for (int i = 0; i < jaggedArray.length; i++) {
        for (int j = 0; j < jaggedArray[i].length; j++) {
            transposeArray[j][i] = jaggedArray[i][j];
        }
    }

    // Merge original and transpose arrays
    int[][] mergedArray = new int[rows + transposeArray.length][];
    for (int i = 0; i < rows; i++) {
        mergedArray[i] = jaggedArray[i];
    }
    for (int i = rows; i < rows + transposeArray.length; i++) {
        mergedArray[i] = transposeArray[i - rows];
    }

    // Print original array
    System.out.println("Original Jagged Array:");
    for (int i = 0; i < jaggedArray.length; i++) {
        for (int j = 0; j < jaggedArray[i].length; j++) {
            System.out.print(jaggedArray[i][j] + " ");
        }
        System.out.println();
    }

    // Print transpose array
    System.out.println("Transpose Jagged Array:");
    for (int i = 0; i < transposeArray.length; i++) {
        for (int j = 0; j < transposeArray[i].length; j++) {
            System.out.print(transposeArray[i][j] + " ");
        }
        System.out.println();
    }

    // Print merged array
    System.out.println("Merged Jagged Array:");
    for (int i = 0; i < mergedArray.length; i++) {
        for (int j = 0; j < mergedArray[i].length; j++) {
            System.out.print(mergedArray[i][j] + " ");
        }
        System.out.println();
    }
}
}