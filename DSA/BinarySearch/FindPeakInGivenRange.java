package DSA.BinarySearch;

public class FindPeakInGivenRange {
    public static void main(String[] args) {
        int start, end;
        int[] arr = { -5, -3, 0, 1, 5, 6, 8, 9, 10, 15, 50, 55, 49, 45, 20, 2 };
        int target = 15;
        int peak = findPeak(arr);
        start = 0;
        end = peak;
        int ans = oderAgnosticBinarySearch(arr, target, start, end);
        if (ans == -1) {
            start = peak;
            end = arr.length - 1;
            ans = oderAgnosticBinarySearch(arr, target, start, end);
            System.out.println(ans);
        } else
            System.out.println(ans);
    }

    static int oderAgnosticBinarySearch(int[] ar, int target, int start, int end) {
        if (ar.length == 0) {
            return -1;
        } else if (ar[start] < ar[end]) {
            int mid = 0;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (ar[mid] < target) {
                    start = mid + 1;
                } else if (ar[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;

        } else {
            int mid = 0;
            while (start <= end) {
                mid = (start + end) / 2;
                if (ar[mid] > target) {
                    start = mid + 1;
                } else if (ar[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // start can also be returned;
    }
}