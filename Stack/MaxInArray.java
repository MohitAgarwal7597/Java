import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int arr[];
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter Elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    continue;
                } else {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > 0) {
        System.out.print(arr[1]);
        // }
        // }
    }
}
