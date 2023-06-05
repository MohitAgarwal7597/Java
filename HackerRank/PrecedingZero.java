package HackerRank;

import java.util.Scanner;

public class PrecedingZero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int j, num, q, count = 0;
            System.out.println("Enter Number: ");
            num = sc.nextInt();
            int num1 = num;
            for (j = 1; j >= 1; j++) {
                q = num / 10;
                num = q;
                count++;
                if (num == 0 && q == 0) {
                    break;
                }

            }
            System.out.println("count is: " + count);
            // if (count == 0) {
            // System.out.println("000");
            // }
            if (count == 1) {
                System.out.println("00" + num1);
            }
            if (count == 2) {
                System.out.println("0" + num1);
            }
            if (count == 3) {
                System.out.println(num1);
            }
            sc.close();
        }
    }
}
