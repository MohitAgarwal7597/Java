package HackerRank;

import java.util.Scanner;

public class onlinecode {

    public static void main(String[] args) {
        int q, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int x1 = x;
            for (int k = 0; k <= s1.length(); k++) {
                char ch = s1.charAt(k);
                System.out.print(ch);
                if (s1.length() == 14) {
                    break;
                }
            }
            for (int j = 1; j >= 1; j++) {
                q = x / 10;
                x = q;
                count++;
                if (x == 0 && q == 0) {
                    break;
                }
            }
            if (count == 1) {
                System.out.println("00" + x1);
            }
            if (count == 2) {
                System.out.println("0" + x1);
            }
            if (count == 3) {
                System.out.println(x1);
            }
        }
        System.out.println("================================");
    }
}
