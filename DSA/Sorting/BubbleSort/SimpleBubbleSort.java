package Sorting.BubbleSort;

import java.util.Arrays;

public class SimpleBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 485, 629, 866, 684, 613, 65, 238, 636, 670, 621, 827, 550, 903, 20, 51, 516, 480, 1000, 573,
                785 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            // if j loop didn't Swapped any thing than loop break because already sorted:
            if (count == 0) {
                System.out.println("Sorted");
                break;
            }
            count = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    count++;
                    // Swapping Without Using third variable No Extra Spaces
                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                    // Using third varible
                    // int temp = arr[j - 1]; // This will create extra space in memory
                    // arr[j - 1] = arr[j];
                    // arr[j] = temp;
                }
            }
        }
    }

}
