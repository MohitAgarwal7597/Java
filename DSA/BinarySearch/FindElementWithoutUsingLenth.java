package DSA.BinarySearch;

class FindElementWithoutUsingLenth {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 5, 10, 15, 56, 78, 100 };
        int target = 15;
        System.out.println();
    }

    static int start = 0;
    static int end = 1;
    static int newMid = -9999;

    static int updateStartEnd(int start, int end, int target, int newMid) {
        while (target != newMid) {
            int newStart = end + 1;
            int newEnd = (end - start + 1) * 2;
            return binarySearch(null, target);
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int mid = start + (end - start) / 2;
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
        return -1;
    }
}