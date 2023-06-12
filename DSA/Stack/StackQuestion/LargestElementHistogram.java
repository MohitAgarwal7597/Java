package DSA.Stack.StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class LargestElementHistogram {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };
        System.out.println(largestRectangleArea(arr));
    }

    public static int largestRectangleArea(int[] heights) {
        // next smaller
        if (heights.length == 0)
            return -1;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[heights.length];
        nse[nse.length - 1] = heights.length;
        st.push(heights.length - 1);
        for (int i = heights.length - 2; i >= 0; i--) {
            nse[i] = heights.length;
            if (st.size() > 0 && heights[st.peek()] < heights[i]) {
                nse[i] = st.peek();
                st.push(i);
            } else {
                while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    nse[i] = st.peek();
                }
                st.push(i);
            }
        }
        System.out.println(Arrays.toString(nse));
        // previous smaller
        while (st.size() > 0)
            st.pop();
        int[] pse = new int[heights.length];
        pse[0] = -1;
        st.push(0);
        for (int i = 1; i < heights.length; i++) {
            pse[i] = -1;
            if (st.size() > 0 && heights[st.peek()] < heights[i]) {
                pse[i] = st.peek();
            } else {
                while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    pse[i] = st.peek();
                }
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(pse));
        int ans = -1;
        int temp[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            int result = heights[i] * (nse[i] - pse[i] - 1);
            ans = Math.max(ans, result);
            temp[i] = result;
        }
        System.out.println(Arrays.toString(temp));
        return ans;
    }
}
