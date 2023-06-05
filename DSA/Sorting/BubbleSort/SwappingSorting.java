package DSA.Sorting.BubbleSort;

import java.util.Scanner;

public class SwappingSorting {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("Enter 10 Elements: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int temp;
        for (int i = 0; i < 10; i++) {
            temp = arr[i];
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] >= arr[j]) {

                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ", ");
        }
        sc.close();
    }
}