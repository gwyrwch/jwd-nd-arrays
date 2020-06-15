package by.epamtc.jwd.main;

import java.util.Arrays;

public class Task1 {
    private static int[][] formMatrix(int n) {
        if (n % 2 != 0)
            return null;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = n - j;
                }
            }
        }

        return matrix;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = formMatrix(n);

        assert matrix != null;

        for (int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
