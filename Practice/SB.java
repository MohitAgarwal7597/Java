package Practice;

import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        String palidrome = "avba";
        System.out.println(isPalindrome(palidrome));
        String a = "Mohit";
        String b = "Mohit";
        // System.out.println(a == b);
        a = "Agarwal";
        String c = new String("Akash");
        // System.out.println(c);
        c = "Kunal";
        // System.out.println(
        // StringBuilder class
        StringBuilder builder = new StringBuilder(); // It is mutable and it doesn't create new object on new object
                                                     // creation(check once);
        builder.append("mohit ");
        builder.append("Agartwal"); // Appended to builder without creating new object.
        System.out.println(builder);
        System.out.println(builder.capacity());
        System.out.println(builder.isEmpty());
        System.out.println(builder.lastIndexOf(" "));
        System.out.println(builder.indexOf("t", 5));

    }

    // check for palindrome of a string;
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
