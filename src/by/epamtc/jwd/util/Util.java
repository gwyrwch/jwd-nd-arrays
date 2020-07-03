package by.epamtc.jwd.util;

import java.util.Random;

public class Util {
    private static int getRandomInt(int n){
        Random rand = new Random();
        return rand.nextInt() % n;
    }

    private static String arrayToString(int[] arr) {
        StringBuilder ans = new StringBuilder("[");

        for (int i = 0; i < arr.length - 1; i++) {
            ans.append(arr[i]).append(", ");
        }

        ans.append(arr[arr.length - 1]).append("]");

        return ans.toString();
    }

    public static String matrixToString(int[][] matrix) {
        StringBuilder ans = new StringBuilder();

        for (int[] row: matrix) {
            ans.append(arrayToString(row)).append('\n');
        }

        return ans.toString();
    }

    public static int[] getRandomIntArray(int size) {
        int[] arr = new int[size];
        int n = 10;

        for (int i = 0; i < size; i++) {
            arr[i] = getRandomInt(n);
        }

        return arr;
    }

    public static int[][] getRandomMatrix(int n, int m, int bound) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = getRandomInt(bound);
            }
        }

        return matrix;
    }
}
