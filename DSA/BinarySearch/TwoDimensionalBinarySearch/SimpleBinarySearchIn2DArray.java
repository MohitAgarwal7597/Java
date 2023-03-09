package DSA.BinarySearch.TwoDimensionalBinarySearch;

import java.util.Arrays;

public class SimpleBinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 48, 56, 66 },
                { -5, -2, 0 }
        };
        int target = 0;
        System.out.println(Arrays.toString(BinarySearch(arr, target)));
    }

    static int[] BinarySearch(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length - 1;
            int mid = 0;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (target < arr[i][mid]) {
                    end = mid - 1;
                } else if (target > arr[i][mid]) {
                    start = mid + 1;
                } else {
                    return new int[] { i, mid };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
