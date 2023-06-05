package LeetCode;

public class PalindromeOfANumber {
    public static void main(String[] args) {
        System.out.println(

                isPalindrome2(0));
    }

    static public boolean isPalindrome2(int x) {
        // By converting to string
        String num = Integer.toString(x);
        int i = 0;
        int j = num.length() - 1;
        while (i < j) {
            if (num.charAt(i) != num.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static public boolean isPalindrome(int x) {
        int newx = 0;
        int i = x;

        while (x != 0) {
            newx = newx * 10;
            newx += (x % 10);
            x = x / 10;
        }
        if (newx == i) {
            return true;
        }
        return false;
    }
}
