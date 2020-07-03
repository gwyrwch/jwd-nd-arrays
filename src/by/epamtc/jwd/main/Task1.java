package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.matrixToString;

public class Task1 {
    private static int[][] formMatrix(int size) {
        if (size % 2 != 0) {
            return null;
        }

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = size - 1; j >= 0; j--) {
                    matrix[i][j] = size - j;
                }
            }
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
