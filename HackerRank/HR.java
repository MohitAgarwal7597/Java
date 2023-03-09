package HackerRank;

import java.util.Scanner;

public class HR {
    public static void main(String[] args) {
        int i = 0, j, num, q, count = 0;
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
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

    }
}

// package HackerRank;

// import java.util.Scanner;

// public class HackerRankDigitCounting {

// public static void main(String[] args) {
// int q, count = 0;
// Scanner sc = new Scanner(System.in);
// System.out.println("================================");
// for (int i = 0; i < 3; i++) {
// // String s1 = sc.neit();
// int x = sc.nextInt();
// for (int j = 1; j >= 1; j++) {
// q = i / 10;
// i = q;
// count++;
// if (i == 0 && q == 0) {
// break;
// }
// }
// if (count == 0) {
// System.out.println("000");
// }
// if (count == 1) {
// System.out.println("00" + x);
// }
// if (count == 2) {
// System.out.println("0" + x);
// }
// if (count == 3) {
// System.out.println(i);
// }
// }
// System.out.println("================================");

// }
// }
