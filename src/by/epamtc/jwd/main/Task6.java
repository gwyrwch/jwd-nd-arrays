package by.epamtc.jwd.main;

import static java.lang.System.exit;

public class Task6 {
    private static int[][] square;
    private static boolean[] used;

    private static boolean isCorrect(int[][] square) {
        int sum = 0;

        for (int i = 0; i < square.length; i++) {
            sum += square[0][i];
        }

        for (int i = 0; i < square.length; i++) {
            int curSumRow = 0;
            int curSumCol = 0;

            for (int j = 0; j < square.length; j++) {
                curSumRow += square[i][j];
                curSumCol += square[j][i];
            }

            if (curSumCol != sum || curSumRow != sum) {
                return false;
            }
        }

        return true;
    }

    private static void printSquare(int[][] square) {
        for (int[] row : square) {
            for (int k = 0; k < square.length; k++) {
                System.out.print(row[k] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    private static void bruteForce(int n, int i) {
        if (i == n * n) {
            if (isCorrect(square)) {
                printSquare(square);
                exit(0);
            }

            return;
        }

        for (int x = 1; x <= n * n; x++) {
            if (used[x - 1]) {
                continue;
            }

            used[x - 1] = true;
            square[i / n][i % n] = x;
            bruteForce(n, i + 1);
            used[x - 1] = false;
        }
    }

    public static void main(String[] args) {
        int size = 3;

        square = new int[size][size];
        used = new boolean[size * size];
        bruteForce(size, 0);
    }
}
