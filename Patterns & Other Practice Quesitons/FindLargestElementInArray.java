package Practice;

public class FindLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 8, 9, 10, 5 };

        System.out.println(Base.largestInArray(arr));
    }

    static int largestInArray(int[] arr) {
        int max = 0;
        for (int n : arr) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }
}

class Base extends FindLargestElementInArray {
    // @Override
    static int largestInArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("This is Base Class");
        return max;
    }
}
