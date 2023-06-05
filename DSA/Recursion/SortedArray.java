package DSA.Recursion;

//Return true if array is sorted othewise false.
public class SortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 11, 7, 10, };
        System.out.println(sortedArray(arr, 0));
    }

    private static boolean sortedArray(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        } else if (arr[i] > arr[i + 1]) {
            return false;
        } else {
            return sortedArray(arr, i + 1);
        }
    }
}
