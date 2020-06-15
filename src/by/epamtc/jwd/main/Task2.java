package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.matrixToString;

public class Task2 {
    private static int[][] formMatrix(int n) {
        if (n % 2 != 0) {
            return null;
        }

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = (i + 1) * (i + 2);
        }

        return matrix;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = formMatrix(n);

        assert matrix != null;
        System.out.println(matrixToString(matrix));
    }
}
