package DSA.Stack.StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElements {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 2, 6 };
        System.out.println(Arrays.toString(previousSmallerElements(arr)));
    }

    public static int[] previousSmallerElements(int[] arr) {
        if (arr.length == 0)
            return new int[] {};
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[arr.length];
        pse[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            pse[i] = -1;
            if (st.size() > 0 && st.peek() < arr[i]) {
                pse[i] = st.peek();
            } else {
                while (st.size() > 0 && st.peek() >= arr[i]) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    pse[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        return pse;
    }
}
