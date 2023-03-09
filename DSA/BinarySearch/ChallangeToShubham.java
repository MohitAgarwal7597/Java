package DSA.BinarySearch;

public class ChallangeToShubham {
    public static void main(String[] rdx) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }
        };

        int target = 9;
        multiDimensionalArray(arr, target);

    }

    static int[] multiDimensionalArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;
            int mid = -1;
            while (start <= end) {
                mid = (start + end) / 2;
                if (arr[i][mid] == target) {
                    return new int[] { i, mid };
                } else if (arr[i][mid] > target) {
                    end = mid - 1;
                } else if (arr[i][mid] < target) {
                    start = mid + 1;
                }

            }
        }
        return new int[] { -1, -1 };
    }
}