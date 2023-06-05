package LeetCode;

// Return boolean if given number n is comes under integer power of four
public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 2 || n < 1 || n == 3) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);

    }

}
