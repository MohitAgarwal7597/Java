package LeetCode;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 4, 6 },
                { 8, 6, 9 },
                { 7, 2, 1 }
        };
        int[][] ans = transpose(arr);
        for (int[] arr1 : ans) {
            System.out.println(Arrays.toString(arr1));
        }

    }

    static int[][] transpose(int[][] matrix) {
        int[][] duplicate = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                duplicate[i][j] = matrix[j][i];
            }
        }
        return duplicate;
    }
}
