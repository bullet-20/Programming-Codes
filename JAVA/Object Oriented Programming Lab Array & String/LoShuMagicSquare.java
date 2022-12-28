import java.util.Scanner;

public class LoShuMagicSquare {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

    // Input magic square
    int[][] magicSquare = new int[3][3];
    System.out.println("Enter the elements of the magic square:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            magicSquare[i][j] = scan.nextInt();
        }
    }

    // Check if magic square is Lo Shu Magic Square
    if (isLoShuMagicSquare(magicSquare)) {
        System.out.println("The magic square is a Lo Shu Magic Square.");
    } else {
        System.out.println("The magic square is not a Lo Shu Magic Square.");
    }
}

public static boolean isLoShuMagicSquare(int[][] magicSquare) {
    // Check if all values in magic square are from 1 to 9
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (magicSquare[i][j] < 1 || magicSquare[i][j] > 9) {
                return false;
            }
        }
    }

    // Check if sum of rows, columns, and diagonals is equal
    int sum = magicSquare[0][0] + magicSquare[0][1] + magicSquare[0][2];
    for (int i = 0; i < 3; i++) {
        // Check rows
        if (magicSquare[i][0] + magicSquare[i][1] + magicSquare[i][2] != sum) {
            return false;
        }
        // Check columns
        if (magicSquare[0][i] + magicSquare[1][i] + magicSquare[2][i] != sum) {
            return false;
        }
    }
    // Check diagonals
    if (magicSquare[0][0] + magicSquare[1][1] + magicSquare[2][2] != sum) {
        return false;
    }
    if (magicSquare[0][2] + magicSquare[1][1] + magicSquare[2][0] != sum) {
        return false;
    }

    return true;
}
}