package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.matrixToString;

public class Task3 {
    private static int[][] formMatrix(int size) {
        if (size % 2 != 0) {
            return null;
        }

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size - i; j++) {
                matrix[i][j] = 1;
            }

            matrix[size - i - 1] = matrix[i].clone();
        }

        return matrix;
    }

    public static void main(String[] args) {
        int size = 4;
        int[][] matrix = formMatrix(size);

        assert matrix != null;
        System.out.println(matrixToString(matrix));
    }
}
