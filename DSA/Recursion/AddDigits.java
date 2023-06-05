package DSA.Recursion;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(999));
    }
    // Approach 1.
    // public static int addDigits(int num) {
    // int copy = num;
    // int count = 0;
    // while (num != 0) {
    // num = num / 10;
    // count++;
    // }
    // int add = 0;
    // if (count > 1) {
    // while (copy != 0) {
    // add = add + (copy % 10);
    // copy = copy / 10;
    // }
    // } else {
    // return copy;
    // }
    // if (add % 10 == add) {
    // return add;
    // }
    // return addDigits(add);
    // }

    // Approach 2.
    public static int addDigits(int num) {
        int sum = 0;
        if (num == 0)
            return 0;
        if (num % 9 == 0) {
            sum = 9;
        } else {
            sum = num % 9;
        }
        if (sum > 9) {
            return addDigits(sum);
        }
        System.gc();
        return sum;
    }
}
