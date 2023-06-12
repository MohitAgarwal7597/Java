package DSA.Stack.StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElementUsingIndex {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 2, 6 };
        System.out.println(Arrays.toString(previousSmallerElementUsingIndex(arr)));
    }

    public static int[] previousSmallerElementUsingIndex(int[] arr) {
        if (arr.length == 0)
            return new int[] {};
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[arr.length];
        pse[0] = -1;
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            pse[i] = -1;
            if (st.size() > 0 && arr[st.peek()] < arr[i]) {
                pse[i] = arr[st.peek()];
            } else {
                while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    pse[i] = arr[st.peek()];
                }
            }
            st.push(i);
        }
        return pse;
    }
}
