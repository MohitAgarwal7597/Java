package Patterns;

import java.util.Scanner;

public class V_Pattern {
    public static void main(String[] args) {
        int i = 1,j = 1,n,m,row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        n = 1;
        m = (row * 2) - 1;
        for (i = 1; i <= row; i++){
            for(j = 1; j<= (row * 2) - 1; j++){
                if(i == j || (i == n && j == m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
                n++;
                m--;
            System.out.println();
        }
    }
}
