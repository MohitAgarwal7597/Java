package DSA.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        run();

    }

    static void run() {
        System.out.println("Enter Size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Size Must Be Greater than zero");
        } else {
            int[] arr = new int[size];
            System.out.println("Enter " + size + " elements in sorted way: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter Element You Want Index Of: ");
            int target = sc.nextInt();
            System.out.println(search(arr, target));
        }
    }

    static int search(int[] ar, int target) {

        if (ar.length <= 0) {
            return -1;
        }
        if (ar[1] > ar[ar.length - 1]) {
            int start = 0;
            int end = ar.length - 1;
            int mid = 0;
            while (start <= end) {
                mid = (start + end) / 2;
                if (ar[mid] == target) {
                    return mid;
                } else if (ar[mid] < target) {
                    end = mid - 1;
                } else if (ar[mid] > target) {
                    start = mid + 1;
                }
            }
            return mid;

        } else if (ar[1] < ar[ar.length - 1]) {

            int start = 0;
            int end = ar.length - 1;
            int mid = 0;
            while (start <= end) {
                mid = (start + end) / 2;
                if (ar[mid] == target) {
                    return mid;
                } else if (ar[mid] > target) {
                    end = mid - 1;
                } else if (ar[mid] < target) {
                    start = mid + 1;
                }
            }
            return mid;
        }
        return -1;
    }
}
