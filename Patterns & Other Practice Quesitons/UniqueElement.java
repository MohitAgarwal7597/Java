package Practice;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 4, 1, 2, 3, 2, 5, 7, 5, 7 };
        int i, j;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            if (i == arr.length - 1)
                break;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        {
            for (i = 0; i < arr.length; i++) {
                if (arr[i] > 0)
                    ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
