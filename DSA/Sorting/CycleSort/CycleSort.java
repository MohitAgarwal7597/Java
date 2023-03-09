package DSA.Sorting.CycleSort;

import java.util.Arrays;

class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 9, 7, 6, 0, 8, 10, 2, 1, 12, 11 };
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]; // if array is staring from 0 than no need to minus anything from arr[i] else
                                  // minus starting number from arr[i] for correct answer.Ex- Array = {5,4,3,2,1,}
                                  // in this case int correct = arr[i] - 1(because staring element is 1(or minimum
                                  // element is 1))
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
