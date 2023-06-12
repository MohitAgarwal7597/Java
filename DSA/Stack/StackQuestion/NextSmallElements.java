package DSA.Stack.StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallElements {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 3 };
        System.out.println(Arrays.toString(nextSmallElements(arr)));
    }

    public static int[] nextSmallElements(int[] arr) {
        if (arr.length == 0)
            return new int[] {};
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[arr.length];
        nse[nse.length - 1] = -1;
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            nse[i] = -1;
            if (st.size() > 0 && st.peek() < arr[i]) {
                nse[i] = st.peek();
                st.push(arr[i]);
            } else {
                while (st.size() > 0 && st.peek() >= arr[i]) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    nse[i] = st.peek();
                }
                st.push(arr[i]);
            }
        }
        return nse;
    }

}
