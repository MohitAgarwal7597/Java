package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class LuckyNumberInTheArray {
    public static void main(String[] args) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        System.out.println(luckyNumbers(matrix));
        for (int[] num : matrix) {
            System.out.println(Arrays.toString(num));
        }
    }

    static ArrayList<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
            int index = 0;
            int check = 0;
            for (index = 0; index < matrix.length; index++) {
                for (check = 0; check < matrix[i].length; check++) {
                    if (min == matrix[index][check]) {
                        break;
                    }

                }
                if (min == matrix[index][check]) {
                    break;
                }
            }
            for (int k = 0; k < matrix.length; k++) {
                if (min < matrix[k][check]) {
                    min = matrix[k][check];
                }
            }
            list.add(min);
        }
        return list;
    }
}
