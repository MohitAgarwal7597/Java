package DSA.Recursion;

// Print all valid pattern of paranthesis.
// ex: n = 2 
// Valid Patterns will be: 
// (()) , ()()
public class ParanthesisPrint {
    public static void main(String[] args) {
        printParenthesis(2, 0, 0, "");
    }

    public static void printParenthesis(int n, int oc, int cc, String ans) {
        if (n == oc && n == cc) {
            System.out.println(ans);
            return;
        }
        if (oc < n) {
            printParenthesis(n, oc + 1, cc, ans + "(");
        }
        if (cc < oc) {
            printParenthesis(n, oc, cc + 1, ans + ")");
        }
    }
}
