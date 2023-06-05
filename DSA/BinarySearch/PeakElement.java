package DSA.BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = { -5, -3, 0, 1, 5, 6, 8, 9, 10, 15, 50, 55 };

        // find peak element from the array,in this case 15
        System.out.println(findPeak(arr));
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