package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class ReversingOfArray {
    static void swap(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size of Array: ");
        size = sc.nextInt();
        System.out.println("Enter " + size + " elements: ");
        int[] arr = new int[size];
        int num;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        swap(arr);
        System.out.println(Arrays.toString(arr));

    }

}