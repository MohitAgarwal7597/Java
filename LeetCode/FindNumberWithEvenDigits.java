package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

class FindNumberWithEvenDigits {
    public static void main(String[] args) {
        int[] arr = new int[] { 425, 25, 1, 895, 159, 145365, 1245, 36, 45, 954, 20, 52, 4, 9, 11 };
        System.out.println(find(arr));

    }

    static int find(int[] ar) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int finalCount = 0;
        for (int i = 0; i < ar.length; i++) {
            int copy = ar[i];
            int count = 0;
            for (int j = 0; j < 10; j++) {
                int temp = ar[i] / 10;
                ar[i] = temp;
                count++;
                if (temp == 0) {
                    break;
                }
            }
            if (count % 2 == 0) {
                finalCount++;
                list.add(copy);

            }
        }
        System.out.println(list);
        return finalCount;
    }
}