package LinerSearch;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 9, 4, 0, 10, 2 };
        System.out.println(findLargestElement(arr));

    }

    static int findLargestElement(int[] arr) {
        for (int i = 0; i < 1;) {
            for (int j = i + 1; j < arr.length - i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            return arr[i];
        }
        return 0;
    }
}
