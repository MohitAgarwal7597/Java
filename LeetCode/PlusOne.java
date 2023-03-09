package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = { 9, 9 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne1(int[] digits) {
        int i = 0;
        for (i = 0; i < digits.length; i++) {
            int add = digits[digits.length - 1 - i] + 1;
            if (add != 10) {
                digits[digits.length - 1 - i] = add;
                break;
            } else {
                digits[digits.length - 1 - i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (i = 0; i < digits.length; i++) {
                arr[arr.length - 1 - i] = digits[digits.length - 1 - i];
            }
            return arr;
        }
        return digits;
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
