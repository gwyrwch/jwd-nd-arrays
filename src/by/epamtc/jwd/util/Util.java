package by.epamtc.jwd.util;

import java.util.Arrays;
import java.util.Random;

public class Util {
    public static String matrixToString(int[][] matrix) {
        StringBuilder ans = new StringBuilder();

        for (int[] row: matrix) {
            ans.append(Arrays.toString(row)).append('\n');
        }

        return ans.toString();
    }

    private static int getRandomInt(int n){
        Random rand = new Random();
        return rand.nextInt() % n;
    }

    public static int[] getRandomIntArray(int size) {
        int[] arr = new int[size];
        int n = 10;

        for (int i = 0; i < size; i++) {
            arr[i] = getRandomInt(n);
        }

        return arr;
    }

    public static int[][] getRandomMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        int rnd = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = getRandomInt(rnd);
            }
        }

        return matrix;
    }
}
