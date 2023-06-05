package LeetCode;

// Return boolean if given number n is comes under integer power of two
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(654132));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n <= 0) {
            return false;
        } else {
            if (n % 2 == 1) {
                return false;
            }
        }
        return isPowerOfTwo(n / 2);
    }
}
