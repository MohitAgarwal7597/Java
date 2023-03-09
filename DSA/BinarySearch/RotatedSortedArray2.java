package BinarySearch;

public class RotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = { 38, 39, 40, 48, 50, 60, 100, 1, 5, 6, 8, 9, 10, 15, 20, 25, 30, 35 };
        int target = 101;
        System.out.println(search(nums, target));

    }

    static int search(int[] nums, int target) {
        int ans = 0;
        int pivot = findPivot(nums);
        if (target < nums[0]) {
            ans = findAnswer(nums, target, pivot + 1, nums.length - 1);
        } else if (target > nums[0]) {
            ans = findAnswer(nums, target, 0, pivot);
        } else {
            ans = 0;
        }
        return ans;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[0] > arr[mid]) {
                end = mid - 1;
            } else if (arr[0] < arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findAnswer(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;

    }

}
