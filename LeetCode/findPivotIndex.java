package LeetCode;

import java.util.Arrays;

public class findPivotIndex {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int[] sumRight = new int[nums.length];
        int[] sumLeft = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int k = nums.length - i - 1;
            int rightSum = 0;
            int leftSum = 0;
            for (int j = i; j < nums.length; j++) {
                rightSum += nums[j];
                leftSum += nums[k];
                k--;
            }
            sumRight[i] = rightSum;
            sumLeft[nums.length - i - 1] = leftSum;
        }
        System.out.println(Arrays.toString(sumRight));
        System.out.println(Arrays.toString(sumLeft));
        for (int i = 0; i < nums.length; i++) {
            if (sumRight[i] == sumLeft[i]) {
                return i;
            }
        }
        return -1;
    }
}
