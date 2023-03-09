package Patterns;

public class HollowRhombus {
    public static void main(String[] args) {
        int n, m;
        n = 1;
        m = 5;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j == 1 || j == 2 || j == 3) {
                    break;
                } else {
                    if (i == j || i == 1 || i == 4 || (j == m && i == n))
                        System.out.print("* ");

                }
                System.out.print(" ");
                n++;
                m++;
                System.out.println();
            }
        }
    }
}