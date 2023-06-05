package Swapping;

import java.util.Scanner;

public class TwoSwapAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        sc.close();
        b = a * b;
        a = b / a;
        b = b / a;

        System.out.println("----------\na = " + a + "\nb = " + b + "\n----------\nSwapped!");
    }
}
