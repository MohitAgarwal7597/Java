package Patterns;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.close();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
                if (i == 1 || i == 2 || i == 4 || i == 5) {
                    break;
                }
            }
            System.out.println();
        }
    }
}

// . . . .
// .
// .
// . . . .
// .
// .
// . . . .
