package LeetCode;

import java.util.Scanner;

// Return boolean if given number n is comes under integer power of three
public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 2 || n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }
}
