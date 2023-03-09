package LeetCode;

import java.util.Arrays;

public class CopyingArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] copy = new int[arr.length];
        for (int i : arr) {
            int k = 0;
            copy[k] = arr[i];
            k++;
        }
        System.out.println(Arrays.toString(copy));
    }
}
