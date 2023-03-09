package LinerSearch;

import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {

        int arr[] = { 1, 5, 6, 8, 8, 8, 8, 9, 10, 15, 20 };
        int target = 8;
        int ans[] = searchIndex(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIndex(int arr[], int target) {
        int[] ans = new int[2];
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (target != arr[i]) {
                ans[0] = -1;
                ans[1] = -1;
            }
        }
        for (start = 0; start < arr.length; start++) {
            if (arr[start] == target) {
                ans[1] = start;
            }
        }
        for (end = arr.length - 1; end > 0; end--) {
            if (arr[end] == target) {
                ans[0] = end;
            }
        }
        return ans;

    }
}
