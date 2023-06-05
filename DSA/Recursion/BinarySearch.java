package DSA.Recursion;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 5, 9, 15, 20, 26, 30 };
        int target = 0;
        int ans = binarySearch(0, arr.length - 1, target, arr);
        System.out.println(ans);

    }

    static int binarySearch(int start, int end, int target, int[] arr) {
        int mid = start + (end - start) / 2;
        if (target < arr[mid] && end > 0) {
            end = mid - 1;
        } else if (target > arr[mid] && start < arr.length - 1) {
            start = mid + 1;
        } else if (target == arr[mid]) {
            return mid;
        } else {
            return -1;
        }
        return binarySearch(start, end, target, arr);
    }
}