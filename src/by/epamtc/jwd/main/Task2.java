package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.matrixToString;

public class Task2 {
    private static int[][] formMatrix(int size) {
        if (size % 2 != 0) {
            return null;
        }

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = (i + 1) * (i + 2);
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
