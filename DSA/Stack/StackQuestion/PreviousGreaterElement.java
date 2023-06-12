package DSA.Stack.StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 6, 10, 45, 8, 2, 6, 0, 7, 3, 5, 9 };
        int res[] = previousGreaterElement(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] previousGreaterElement(int[] arr) {
        if (arr.length < 1) {
            return new int[] {};
        }
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        nge[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            nge[i] = -1;
            if (st.peek() > arr[i]) {
                nge[i] = st.peek();
                st.push(arr[i]);
            } else {
                while (st.size() > 0 && st.peek() < arr[i]) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    nge[i] = st.peek();
                }
                st.push(arr[i]);
            }
        }
        return nge;
    }
}
