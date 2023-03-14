package Practice;

public class Array {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[] { 2, 3, 5, 2, 4, 8, 1 };
        // arr = {2,3,5,2,4,8,1};
        int target = 7;
        int count = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                ans = arr[i] + arr[j];
                if (ans == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
                    count++;
                }
                if (!(ans == target))
                    System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
            }

        }
        System.out.println("Totals of target is: " + count);

    }

}
