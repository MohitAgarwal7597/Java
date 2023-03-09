package Patterns;

import java.util.Scanner;

public class G_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int newRow = rows-1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows ; j++){
                if((i == 0 && j == newRow/2) || (j == newRow / 4 && i == 0) || (i == newRow/4) || (j ==0 &&  i == newRow/4  && i == (3*newRow)/4) || j == 0 && i == (3 * newRow)/4 || (i == 3 * newRow / 4 && j == newRow/4)  ){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
