package Practice;

import java.util.Scanner;

class MatrixInput {
    static int[] matrix1 = new int[9];
    static int[] matrix2 = new int[9];
    static int[] matrix3 = new int[9];

    public void matrixInput() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.println("Matrix 1: Enter " + (i + 1) + " Element");
            matrix1[i] = sc.nextInt();
        }
        for (int j = 0; j < 9; j++) {
            System.out.println("Matrix 2: Enter " + (j + 1) + " Element");
            matrix2[j] = sc.nextInt();
        }
    }

    public void matrixMultiplicaion() {
        for (int i = 0; i < 9; i++) {
            matrix3[i] = (matrix1[i] + matrix2[i]);
        }
    }

    public void matrixShow(int[] arr) {
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i] + " ");
            if (i == 2 || i == 5 || i == 8) {
                System.out.println();
            }
        }
    }
}

public class Matrix extends MatrixInput {
    public static void main(String[] args) {
        MatrixInput m = new MatrixInput();
        m.matrixInput();
        m.matrixShow(matrix1);
        m.matrixShow(matrix2);
        m.matrixMultiplicaion();
        m.matrixShow(matrix3);

    }

}
