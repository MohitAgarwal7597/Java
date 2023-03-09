package DSA.Arrays;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the no. of rows: ");
        n = sc.nextInt();
        System.out.println("Enter the no. of column: ");
        m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter Elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of the matrix;
        int arrT[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrT[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of the matrix is: ");
        for (int i = 0; i < m; i++) {
            System.out.print("|");
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arrT[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }

    }
}
