package ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class _3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        fillTheMatrix(matrix, scanner);

        int primaryDiagonalSum = getPrimaryDiagonalSum(matrix);
        int secondaryDiagonalSum = getSecondaryDiagonalSum(matrix);

        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }

    private static int getSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        int counter = 0;
        for (int index = matrix.length - 1; index >= 0 ; index--) {
            int num = matrix[index][counter];
            sum += num;
            counter++;
        }

        return sum;
    }

    private static int getPrimaryDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int index = 0; index < matrix.length; index++) {
          int num = matrix[index][index];
          sum += num;
        }
        
        return sum;
    }

    private static void fillTheMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {

                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
