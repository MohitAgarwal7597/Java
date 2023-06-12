package LeetCode;

import java.util.Stack;

public class MaximumFrequencyStack {
    public static void main(String[] args) {
        Stack<int[]> st = new Stack<>();
        int val = 5;
        int[] arr = { val + 1, 5 };
        st.push(arr);
        System.out.println(st.peek()[0]);
    }
}
