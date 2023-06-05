package DSA.Recursion;

// Return k times multiplication of  n. For example if n = 4 and k = 5 than output should be 5 times multipliction of 4
/*
4
8
12
16
20
*/
public class K_TimesMultiplication {
    public static void main(String[] args) {
        k_TimesMultiplication(8, 10);
    }

    public static int k_TimesMultiplication(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return n;
        }
        k_TimesMultiplication(n, k - 1);
        System.out.println(n * k);
        return 0;
    }
}
