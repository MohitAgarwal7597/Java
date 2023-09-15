package Practice;

public class SlidingWindowAverage {
    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double total = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < k + i; j++) {
                if (j == nums.length) {
                    break;
                }
                // if (nums[j] < 0) {
                // sum = sum - nums[j];
                // } else {
                sum = sum + nums[j];
                // }
            }
            if (sum > total) {
                total = sum;
            }
        }
        return total / k;
    }
}
