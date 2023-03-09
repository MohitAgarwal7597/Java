package DSA.BinarySearch.TwoDimensionalBinarySearch;

import java.util.Arrays;

public class RolColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 5, 7, 8, 9 },
                { 2, 10, 11, 15, 18 },
                { 3, 12, 19, 25, 30 },
                { 4, 13, 20, 26, 31, 32 },
        };
        int target = 32;
        System.out.println(Arrays.toString(findInMatrix(arr, target)));
    }

    static int[] findInMatrix(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            col = arr[row].length - 1;
            if (target == arr[row][col]) {
                return new int[] { row, col };
            } else if (target > arr[row][col]) {
                row++;
            } else if (target < arr[row][col]) {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }

}
