package Practice;

import java.util.Arrays;

public class SB1 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3 };
        StringBuilder builder = new StringBuilder();
        String numbers = new String("");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
        }
        int ans = Integer.parseInt(builder.toString());
        ans = ans + 1;
        String finalAnswer = String.valueOf(ans);
        char[] nums = new char(arr.length + 1);
        finalAnswer.toCharArray();
        System.out.println(Arrays.toString(nums));

        System.out.println(builder.insert(arr.length, 1));
        // builder.append(numbers);
        // System.out.println(numbers);
    }

}
