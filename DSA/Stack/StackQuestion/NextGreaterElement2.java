package DSA.Stack.StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        // int[] arr = { 0, 1, 8, 2, 6, 0, 7, 3, 5, 9 }; // {8,2,-1,7,9,3,-1,9,-1,-1}
        int[] arr = { 7, 9, 2, 5, 9, 4, 1, 8, 2, 6, 3, 10 };// [18, 18, -1, 10, -1, -1, -1, -1]
        int res[] = nextGreaterElement(arr);
        System.out.println(Arrays.toString(res));

    }

    public static int[] nextGreaterElement(int[] arr) {
        if (arr.length < 2) {
            int[] nge = new int[arr.length];
            Arrays.fill(nge, -1);
            return nge;
        }
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        // next greater element
        nge[nge.length - 1] = -1;
        nge[nge.length - 2] = -1;
        st.push(arr[arr.length - 1]);
        st.push(arr[arr.length - 2]);
        for (int i = arr.length - 3; i >= 0; i--) { // TC->O(n)

            nge[i] = -1; // Default Value

            // greater.
            if (st.peek() > arr[i]) {// if peek is greater, we need to pop form stack till next greater or stack is
                                     // empty
                Stack<Integer> temp = new Stack<>();// Store poped elements
                temp.push(st.pop());
                while (st.size() > 0 && st.peek() < arr[i]) {
                    temp.push(st.pop());
                }
                if (!st.isEmpty()) {// if stack is not empty means peek is next greater element of currect so assign
                                    // it else again push the elements in old stack
                    nge[i] = st.peek();
                }
                while (!temp.isEmpty())
                    st.push(temp.pop());
                st.push(arr[i]);

            } else {

                Stack<Integer> temp = new Stack<>();
                while (st.size() > 0 && st.peek() <= arr[i]) { // TC -> less than O(n)
                    temp.push(st.pop());
                }

                if (!st.isEmpty()) {
                    temp.push(st.pop());
                    while (st.size() > 0 && st.peek() <= arr[i]) {
                        temp.push(st.pop());
                    }
                    if (!st.isEmpty()) {
                        nge[i] = st.peek();
                    }
                    // while (!temp.isEmpty())
                    // st.push(temp.pop());
                }
                while (!temp.isEmpty())
                    st.push(temp.pop());
                st.push(arr[i]);
            }
            // Total TC is less than O(2n). Where is brute force approach takes O(n * n);
        }
        return nge;
    }
}
