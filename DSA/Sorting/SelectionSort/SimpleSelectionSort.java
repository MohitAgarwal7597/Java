package Sorting.SelectionSort;

import java.util.Arrays;

public class SimpleSelectionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 10, 9, 2, 6, 10, -15, -1, 61, -101, 15, 21, 25, 16 };
        callFunction(arr);
    }

    static void callFunction(int[] arr) {
        for (int lastIndex = arr.length; lastIndex > 0; lastIndex--) {
            int pointer = findMax(arr, lastIndex, 0);
            swapArray(arr, pointer, lastIndex - 1);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int findMax(int[] arr, int end, int maxIndex) {
        for (int i = 0; i < end; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swapArray(int[] arr, int pointer, int lastIndex) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[pointer];
        arr[pointer] = temp;
    }
}