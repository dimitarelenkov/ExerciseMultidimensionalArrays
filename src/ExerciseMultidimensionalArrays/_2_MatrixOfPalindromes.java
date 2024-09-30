package ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class _2_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);


         String[][] matrix = new String[rows][cols];

        fillMatrix(matrix);

        printMatrix(matrix);
    }

    private static void fillMatrix(String[][] matrix) {
        int asciiValueA = 97;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                char firstLetter = (char) (asciiValueA + row);
                char middleLetter = (char) (asciiValueA + row + col);
                char lastLetter = (char) (asciiValueA + row);

                String palindrome = String.format("%c%c%c", firstLetter, middleLetter, lastLetter);
                matrix[row][col] = palindrome;
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
