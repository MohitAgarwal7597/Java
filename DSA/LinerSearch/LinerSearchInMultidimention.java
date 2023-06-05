package DSA.LinerSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinerSearchInMultidimention {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element To Search: ");
        int target = sc.nextInt();
        int[][] arr = {
                { 1, 5, 9 },
                { 7, 5, 3, 1, 5 },
                { 4, 5 }
        };
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int ar[][], int target) {
        if (ar.length == 0)
            return new int[] { -1, -1 };
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
