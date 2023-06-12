package DSA.Stack.StackQuestion;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String s = "9+5-(2*(4/2+3*4)/6)";
        System.out.println(infix(s));
    }

    public static int infix(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char che = s.charAt(i);
            int ascii = che;
            if (ascii >= 48 && ascii <= 57) { // Character is Number
                val.push(ascii - 48);
            } else { // Character is Operator
                if (ch.isEmpty() || ch.peek() == '(') {
                    ch.push(che);
                } else if (che == '(') {
                    ch.push(che);
                } else if (che == ')') {
                    while (ch.peek() != '(') {
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if (ch.peek() == '+')
                            val.push(v1 + v2);
                        if (ch.peek() == '-')
                            val.push(v1 - v2);
                        if (ch.peek() == '*')
                            val.push(v1 * v2);
                        if (ch.peek() == '/')
                            val.push(v1 / v2);
                        ch.pop();
                    }
                    ch.pop();
                } else if (che == '+' || che == '-') {
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (ch.peek() == '+')
                        val.push(v1 + v2);
                    if (ch.peek() == '-')
                        val.push(v1 - v2);
                    if (ch.peek() == '*')
                        val.push(v1 * v2);
                    if (ch.peek() == '/')
                        val.push(v1 / v2);
                    ch.pop();
                    ch.push(che);
                } else if (che == '*' || che == '/') {
                    if (ch.peek() == '+' || ch.peek() == '-') {
                        ch.push(che);
                    } else {
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if (ch.peek() == '*')
                            val.push(v1 * v2);
                        if (ch.peek() == '/')
                            val.push(v1 / v2);
                        ch.pop();
                        ch.push(che);
                    }
                }
            }
        }
        while (val.size() > 1) {
            // work
            int v2 = val.pop();
            int v1 = val.pop();

            if (ch.peek() == '+')
                val.push(v1 + v2);
            if (ch.peek() == '-')
                val.push(v1 - v2);
            if (ch.peek() == '*')
                val.push(v1 * v2);
            if (ch.peek() == '/')
                val.push(v1 / v2);
            ch.pop();
        }
        return val.peek();
    }
}
