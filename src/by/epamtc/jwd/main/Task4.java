package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.getRandomIntArray;
import static by.epamtc.jwd.util.Util.matrixToString;

public class Task4 {
    private static int[][] formMatrix(int[] nums) {
        if (nums.length % 2 != 0) {
            return null;
        }

        int n = nums.length;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) Math.pow(nums[j], i + 1);
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[] nums = getRandomIntArray(4);
        int[][] matrix = formMatrix(nums);

        assert matrix != null;
        System.out.println(matrixToString(matrix));

    }
}
