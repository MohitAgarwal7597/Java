package PWAssignmentProblems.Assignment17;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        String s = "This is a string which is written by me just to check the program if its working fine or not";
        s = s.toUpperCase();
        s = s.replaceAll(" ", "");
        char[] c = new char[s.length()];
        c = s.toCharArray();
        int[] n = new int[c.length];
        for (int k = 0; k < c.length; k++) {
            n[k] = c[k];
        }
        BubbleSort(n);
        for (int k : n) {
            System.out.print((char) k + " ");
        }
    }

    static void BubbleSort(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                System.out.println("Sorted");
                break;
            }
            count = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    count++;
                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                }
            }
        }
    }
}
