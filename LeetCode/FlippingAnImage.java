package LeetCode;

import java.sql.SQLOutput;
import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int [][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        flipAndInvertImage(image);
    for(int[] arr : image){
        System.out.println(Arrays.toString(arr));//A method to print two Dimentional array
    }
//        System.out.println(Arrays.toString(image[i]));//Another method to print the same


    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            int k = image[i].length - 1;
            for(int j = 0; j < image[i].length/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                k--;
            }
        }
        for(int i = 0; i < image.length; i++){
            int k = image[i].length - 1;
            for(int j = 0; j < image[i].length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
