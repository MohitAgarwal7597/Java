package Practice;

import java.util.Arrays;
import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        int[] arr = { 4, 2, 9, 5, 6, 7, 11, 5, 6, 7 };
        int[] arr1 = new int[arr.length];
        arr1[arr1.length - 1] = -1;
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            arr1[i] = -1;
            if (st.size() > 0 && st.peek() < arr[i]) {
                while (st.size() > 0 && st.peek() < arr[i]) {
                    st.pop();
                }
            }
            if (st.size() > 0 && st.peek() > arr[i]) {
                arr1[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr1));
        // for (int i = 0; i < arr.length; i++) {
        // boolean s = false;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] > arr[i]) {
        // arr1[i] = arr[j];
        // s = true;
        // break;
        // }
        // }
        // if (s == false) {
        // arr1[i] = -1;

        // }
        // }
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.print(arr1[i] + " ");
        // }
    }
}
