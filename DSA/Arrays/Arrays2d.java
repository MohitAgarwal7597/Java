package DSA.Arrays;

import java.util.Scanner;

public class Arrays2d {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner sc = new Scanner(System.in);
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("This is the array");
        System.out.println(arr[1][2]);
    }
}

// class x {
// Arrays2d m = new Arrays2d();
// m.sum();
// }
