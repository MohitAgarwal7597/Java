package PWMockTest;

import java.util.Arrays;

public class ZerosInEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 5 };
        System.out.println(Arrays.toString(arrange(arr)));
    }

    public static int[] arrange(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
        return arr;
    }
}
