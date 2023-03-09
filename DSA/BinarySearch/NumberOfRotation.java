package DSA.BinarySearch;

class NumberOfRotation {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 8, 9, 10, 15, 20, 25, 30, 35, 38, 39, 40 };
        System.out.println(findRotation(arr) + 1);

    }

    static int findRotation(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] < arr[0]) {
                end = mid - 1;
            } else if (arr[mid] > arr[0]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
// static int findRotation(int[] arr) {
// int start = 0;
// int end = arr.length - 1;
// while (start <= end) {
// int mid = start + (end - start) / 2;
// if (mid < end && arr[mid] > arr[mid + 1]) {
// return mid;
// } else if (mid > start && arr[mid] < arr[mid - 1]) {
// return mid - 1;
// } else if (arr[0] > arr[mid]) {
// end = mid - 1;
// } else if (arr[0] < arr[mid]) {
// start = mid + 1;
// }
// }
// return -1;
// }