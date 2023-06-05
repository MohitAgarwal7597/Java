package DSA.BinarySearch;

//Problem. Return the first occurence of given target if target dosen't exists return -1
public class LowerBound {
    public static void main(String[] args) {
        int[] arr = { 6, 6, 7, 7, 7, 7, 7, 7, 7 };
        int target = 9;
        int ans = lowerBound(arr, target);
        System.out.println(ans);
    }

    public static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                result = mid;
                end = mid - 1;
            }

        }
        return result;
    }
}
