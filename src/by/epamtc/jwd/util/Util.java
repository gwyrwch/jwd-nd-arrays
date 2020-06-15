package by.epamtc.jwd.util;

import java.util.Arrays;

public class Util {
    public static String matrixToString(int[][] matrix) {
        StringBuilder ans = new StringBuilder();

        for (int[] row: matrix) {
            ans.append(Arrays.toString(row)).append('\n');
        }

        return ans.toString();
    }
}
