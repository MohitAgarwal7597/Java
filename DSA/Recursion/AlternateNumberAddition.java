package DSA.Recursion;

// Add Digits Till n but alternate sign. Ex: +1 -2 +3 -4 +5 -6....n
public class AlternateNumberAddition {
    public static void main(String[] args) {
        System.out.println(alternateNumberAddition(-8));
    }

    // Approach 1.(Works For Negative Input As Well)
    // public static int alternateNumberAddition(int n) {
    // if (n == 1 || n == -1) {
    // return n;
    // }
    // if (n < 0) {
    // return n + alternateNumberAddition((n + 1) * (-1));
    // }
    // return n + alternateNumberAddition((n - 1) * (-1));
    // }
    // Approach 2.
    public static int alternateNumberAddition(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return n;
        }
        if (n % 2 == 0) {
            return alternateNumberAddition(n - 1) - n;
        } else {
            return alternateNumberAddition(n - 1) + n;
        }

    }
}