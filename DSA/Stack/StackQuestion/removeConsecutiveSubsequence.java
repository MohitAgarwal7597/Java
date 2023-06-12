package DSA.Stack.StackQuestion;

//Remove number if they are consecutive
import java.util.Stack;

class removeConsecutiveSequence {
    static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0 || arr[i] != st.peek())
                st.push(arr[i]);
            else if (arr[i] == st.peek()) {
                if (i == arr.length - 1 || arr[i + 1] != st.peek())
                    st.pop();
            }
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 7, 7, 7, 4, 4, 5, 2 };
        int[] res = remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}