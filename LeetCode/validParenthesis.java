package LeetCode;

import java.util.Stack;

//Return boolean if the input string have valid brackets pattern
public class validParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()))"));
    }

    public static int isValid(String s) {
        // int j = 0;
        // int[] n = new int[s.length() / 2];
        // if (s.length() % 2 != 0) {
        // return false;
        // }
        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}' && j == 0)
        // {
        // return false;
        // }
        // else if (s.charAt(i) == '(') {
        // if (j < n.length) {
        // n[j] = 1;
        // j++;
        // } else {
        // return false;
        // }
        // } else if (s.charAt(i) == '[') {
        // if (j < n.length) {
        // n[j] = 2;
        // j++;
        // } else {
        // return false;
        // }
        // } else if (s.charAt(i) == '{') {
        // if (j < n.length) {
        // n[j] = 3;
        // j++;
        // } else {
        // return false;
        // }
        // } else if (s.charAt(i) == ')') {
        // if (j > 0) {
        // if (n[j - 1] == 1) {
        // j--;
        // } else {
        // return false;
        // }
        // } else {
        // return false;
        // }
        // } else if (s.charAt(i) == ']') {
        // if (j > 0) {
        // if (n[j - 1] == 2) {
        // j--;
        // } else {
        // return false;
        // }
        // } else {
        // return false;
        // }
        // } else if (s.charAt(i) == '}') {
        // if (j > 0) {
        // if (n[j - 1] == 3) {
        // j--;
        // } else {
        // return false;
        // }
        // } else {
        // return false;
        // }
        // }
        // if (i == s.length() - 1 && j != 0) {
        // return false;
        // }

        // }
        // return true;
        // }
        // Approach 1.
        Stack stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            }
            if (s.charAt(i) == '{') {
                stack.push('{');
            }
            if (s.charAt(i) == '[') {
                stack.push('[');
            }
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    if ((char) stack.peek() == '(') {
                        stack.pop();
                        count++;
                    } else {
                        stack.push(')');
                    }
                } else
                    stack.push(')');
            }
            if (s.charAt(i) == ']') {
                if (!stack.isEmpty()) {
                    if ((char) stack.peek() == '[') {
                        stack.pop();
                        count++;
                    } else {
                        stack.push(']');

                    }
                } else
                    stack.push(']');
            }
            if (s.charAt(i) == '}') {
                if (!stack.isEmpty()) {
                    if ((char) stack.peek() == '{') {
                        stack.pop();
                        count++;
                    } else {
                        stack.push('}');

                    }
                } else
                    stack.push('}');
            }
        }

        return count * 2;
    }
}
