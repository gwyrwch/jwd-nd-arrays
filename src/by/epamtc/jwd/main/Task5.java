package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.getRandomMatrix;
import static by.epamtc.jwd.util.Util.matrixToString;

public class Task5 {
    private static int[][] findMatrixProduct(int[][] matrixA, int[][] matrixB) {
        if (matrixA == null || matrixB == null) {
            return null;
        }

        if (matrixA[0].length != matrixB.length) {
            return null;
        }

        int n = matrixA.length;
        int m = matrixB[0].length;
        int[][] mRes = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    mRes[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return mRes;
    }


    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int p = 2;
        int bound = 10;

        int[][] matrixA = getRandomMatrix(n, m, bound);
        System.out.println(matrixToString(matrixA));

        int[][] matrixB = getRandomMatrix(m, p, bound);
        System.out.println(matrixToString(matrixB));

        int[][] mProduct = findMatrixProduct(matrixA, matrixB);
        System.out.println(matrixToString(mProduct));
    }
}
