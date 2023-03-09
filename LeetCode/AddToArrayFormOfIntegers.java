package LeetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class AddToArrayFormOfIntegers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] nums = { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3 };
        int k = 516;
        list = addToArrayForm(nums, k);
        System.out.println(list);
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        String numbers = "";
        for (int i = 0; i < num.length; i++) {
            numbers = numbers + Integer.toString(num[i]);
        }

        BigInteger bn = new BigInteger(numbers);
        // long ans = bn.Long.parseLong(numbers);
        long ans = bn.valueOf(numbers);
        // ans = bn.longValue();
        ans = ans + k;
        String finalAnswer = Long.toString(ans);
        for (int i = 0; i < finalAnswer.length(); i++) {
            int temp = finalAnswer.charAt(i) - '0';
            list.add(temp);
        }
        return list;
    }
}