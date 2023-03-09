package Practice;

import java.util.Arrays;

public class WheatherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat = { { 0, 1 }, { 1, 0 } };
        int[][] target = { { 1, 0 }, { 0, 1 } };
        System.out.println(findRotation(mat, target));

    }

    static boolean findRotation(int[][] mat, int[][] target) {
        int[][] temp = new int[mat.length][mat.length];
        // Transpose Of Matrix
        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j < mat.length; j++) {
        // temp[i][j] = mat[j][i];
        // }
        // }

        // Swapping of elements
        // int index = 0;
        // while (index < mat.length) {
        // int start = 0;
        // int end = mat.length - 1;
        // while (start < end) {
        // int element = temp[index][start];
        // temp[index][start] = temp[index][end];
        // temp[index][end] = element;
        // start++;
        // end--;
        // }
        // index++;
        // }
        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j < mat.length + 1 / 2; j++) {
        // int first = temp[i][j];
        // temp[i][j] = temp[i][mat.length - 1 - j];
        // temp[i][mat.length - 1 - j] = first;
        // }
        // }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                temp[i][j] = mat[mat.length - 1 - i][j];
            }
        }
        for (int[] arr : temp) {
            System.out.println(Arrays.toString(arr));

        }
        // Checking Wheater New Matrix in same as target Matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (temp[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
