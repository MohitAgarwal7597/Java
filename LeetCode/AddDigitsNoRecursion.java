package LeetCode;

public class AddDigitsNoRecursion {
    public static void main(String[] args) {
        System.out.println(addDigits(998));
    }

    public static int addDigits(int n) {
        if (n < 10) {
            return n;
        } else if (n % 9 == 0) {
            return 9;
        } else {
            return n % 9;
        }
    }
}
