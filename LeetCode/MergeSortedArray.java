package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int n = 3;
        int[] nums2 = { 2, 5, 6 };
        merge1(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        for (int i = 0; i < m + n; i++) {
            arr[i] = nums1[i];
        }
        int j = 0;
        int k = 0;
        for (int i = 0; i < m + n; i++) {
            if ((k == n) || ((j != m) && (j < arr.length) && (k < nums2.length) && (arr[j] <= nums2[k]))) {
                nums1[i] = arr[j];
                j++;
            } else if ((j == m) || ((k != n) && (j < arr.length) && (k < nums2.length) && (arr[j] > nums2[k]))) {
                nums1[i] = nums2[k];
                k++;
            }
        }

    }

    // Another Approach
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m;
        for (int j = 0; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
