package DSA.Stack.StackQuestion;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String s = "9+5-(2*(4/2+3*4)/6)";
        System.out.println(infix(s));
    }

    public static String infix(String s) {
        Stack<String> val = new Stack<>();
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char che = s.charAt(i);
            int ascii = che;
            if (ascii >= 48 && ascii <= 57) { // Character is Number
                String str = "" + che;
                val.push(str);
            } else { // Character is Operator
                if (ch.isEmpty() || ch.peek() == '(') {
                    ch.push(che);
                } else if (che == '(') {
                    ch.push(che);
                } else if (che == ')') {
                    while (ch.peek() != '(') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char op = ch.pop();
                        val.push(op + v1 + v2);
                    }
                    ch.pop();// poping '('
                } else if (che == '+' || che == '-') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char op = ch.pop();
                    val.push(op + v1 + v2);
                    ch.push(che);
                } else if (che == '*' || che == '/') {
                    if (ch.peek() == '+' || ch.peek() == '-') {
                        ch.push(che);
                    } else {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char op = ch.pop();
                        val.push(op + v1 + v2);
                        ch.push(che);
                    }
                }
            }
        }
        while (val.size() > 1) {
            // work
            String v2 = val.pop();
            String v1 = val.pop();
            char op = ch.pop();
            val.push(op + v1 + v2);
        }
        return val.peek();
    }
}
