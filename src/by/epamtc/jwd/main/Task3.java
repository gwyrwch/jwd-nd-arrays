package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.matrixToString;

public class Task3 {
    private static int[][] formMatrix(int n) {
        if (n % 2 != 0) {
            return null;
        }

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                matrix[i][j] = 1;
            }

            matrix[n - i - 1] = matrix[i].clone();
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 4   ;
        int[][] matrix = formMatrix(n);

        assert matrix != null;
        System.out.println(matrixToString(matrix));
    }
}
