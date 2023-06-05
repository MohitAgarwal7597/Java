package DSA.Sorting.InsertionSort;

import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 4, 3, 2, 100, -15, 1, 0 };
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else
                    break;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

    }
}