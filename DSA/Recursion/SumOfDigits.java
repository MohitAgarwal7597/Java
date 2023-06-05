package DSA.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(11111, 0));
    }

    public static int sumOfDigits(int n, int add) {
        int num = n % 10;
        if (num == 0) {
            return add;
        }
        add = add + num;
        return sumOfDigits(n / 10, add);
    }
}
