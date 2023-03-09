package Patterns;

import java.util.Scanner;

public class Letter_B_C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || i == 0 || j == n || i == n || i == (n - 1) / 2)
                    System.out.print('*');
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Pattern C
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || i == 0 || i == n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}