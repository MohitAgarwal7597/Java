package DSA.Stack.StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 8, 2, 6, 0, 7, 3, 5, 9 };
        int res[] = nextGreaterElement(arr);
        System.out.println(Arrays.toString(res));

    }

    public static int[] nextGreaterElement(int[] arr) {
        if (arr.length == 0)
            return new int[] {};
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        // next greater element
        nge[nge.length - 1] = -1;
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) { // TC->O(n)
            // if no greater value than -1
            nge[i] = -1;
            // if peek is greater it mean current element is smaller and peek is its next
            // greater.
            if (st.peek() > arr[i]) {
                nge[i] = st.peek();
                st.push(arr[i]);
                // if peek is not greater than pop till peek is greater or stack is empty
            } else {
                // if stack is empty means no greater element exists
                while (st.size() > 0 && st.peek() < arr[i]) { // TC -> less than O(n)
                    st.pop();
                }
                // if not empty means peek is next greater to that element.
                if (!st.isEmpty()) {
                    nge[i] = st.peek();
                }
                st.push(arr[i]);
            }
            // Total TC is less than O(2n). Where is brute force approach takes O(n * n);
        }
        return nge;
    }
}
