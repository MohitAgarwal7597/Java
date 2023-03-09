package DSA.BinarySearch;

public class FindElementWithoutUsingLenthVersion2 {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 45, 10, 11, 12, 15, 17, 18, 20, 25, 26, 28, 123, 159, 1576 };
        int target = 45;

        System.out.println(searchIndex(arr, target));
    }

    static int start = 0;
    static int end = 1;
    static int mid = 0;
    static int ans = -1;

    static int searchIndex(int[] arr, int target) {
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        if (mid != target) {
            start = mid + 1;
            try {
                end = end + 1;
                return searchIndex(arr, target);
            } catch (Exception e) {
                ans = -1;
            }
        } else
            return mid;
        return ans;
    }
}