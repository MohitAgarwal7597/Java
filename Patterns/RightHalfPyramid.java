package Patterns;

class Main {
    public static void main(String[] args) {
        int i, j, k, count = 1;
        for (i = 5; i >= 1; i--) {
            for (j = i; j >= 5; j--) {
                // System.out.print(" ");
            }
            for (k = 1; k <= count; k++) {
                System.out.print("* ");
            }
            System.out.println();
            count++;
        }

    }
}