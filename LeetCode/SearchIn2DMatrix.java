package LeetCode;

//Problem Statement:
//Return Boolean If Target Present In A 2D Array
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int arr[][] = { { -3, -1, 0, 1 },
                { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 }
        };
        int target = 0;
        System.out.println(searchMatrix(arr, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        // ****Approach 1.(Work For Different Column No. As Well)
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid < matrix[i].length && matrix[i][mid] == target) {
                    return true;
                } else if (mid < matrix[i].length && matrix[i][mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;

        // ****Approach 2.(Only If No. Of Column Are Same In Each Row)
        // int row = matrix.length;
        // int col = matrix[0].length;
        // int start = 0;
        // int end = (row * col) - 1;

        // while (start <= end) {
        // int mid = start + (end - start) / 2;
        // int midVal = matrix[mid / col][mid % col];

        // if (target == midVal) {
        // System.gc();
        // return true;
        // } else if (target < midVal) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // }
        // return false;

    }
}