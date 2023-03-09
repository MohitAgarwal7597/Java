package LinerSearch;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 9, 20, 46, 74, 25, 26 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Item To Search: ");
        int target = sc.nextInt();
        System.out.println("At " + (search(arr, target)) + " Postion");
    }

    static int search(int[] ar, int target) {
        if (ar.length == 0)
            return -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
