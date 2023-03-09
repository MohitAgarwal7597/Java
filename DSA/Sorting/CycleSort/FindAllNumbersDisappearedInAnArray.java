package DSA.Sorting.CycleSort;

import java.util.ArrayList;
// import java.util.List;
import java.util.Arrays;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1, 0 };
        System.out.println(findDisappearedNumbers(arr));
        System.out.println(Arrays.toString(arr));
    }

    static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                list.add(i);
            }
        }
        return list;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
