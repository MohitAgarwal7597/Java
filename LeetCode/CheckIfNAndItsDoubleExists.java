package LeetCode;

public class CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        int[] arr = { -2, 0, 10, -19, 4, 6, -8 };
        boolean result = checkIfExist(arr);
        System.out.println(result);
    }

    static public boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i + 1; j--) {
                if (i != j && arr[i] == arr[j] * 2) {
                    return true;
                } else if (i != j && arr[i] * 2 == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
