package Patterns;

import java.util.Scanner;

class Draw {
    int x = 1;

    void draw(int n) {
        int y = n + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                if ((i == 1 && k <= n) || (i == x && k == 1) || i == n || k == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            x++;
            y++;
            ;
        }
    }
}

public class Rhombus {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Draw d = new Draw();
        d.draw(n);
        sc.close();
    }
}
