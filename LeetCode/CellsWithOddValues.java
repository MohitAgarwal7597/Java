//package LeetCode;
//
//import java.util.Arrays;
//
//public class CellsWithOddValues {
//    public static void main(String[] args) {
//        int m = 2;
//        int n = 2;
//        int[][] indices = {
//                {1,1},
//                {0,1}
//
//        };
//        int result = oddCells(m,n,indices);
//        System.out.println(result);
//
//    }
//    static int oddCells(int m, int n, int[][] indices) {
//        int [][] ans = new int[m][n];
//        for(int i = 0; i < indices.length; i++){
//            int row = 0;
//            for(int j = 0; j < 1; j++){
//                row =  indices[i][j];
//                for(int k = 0; k < ans[i].length;k++){
//                    ans[row][k] = +1;
//                }
//            }
//            for(int j = 1; j <= 1; j++){
//                int col =  indices[i][j];
//                for(int k = 0; k < ans[i].length - 1;k++){
//                    ans[k][col] = +1;
//                }
//            }
//            for(int[] a : ans){
//            System.out.println(Arrays.toString(a));
//
//            }
//        }
//        int count = 0;
//        for(int i = 0; i < ans.length; i++){
//            for(int j = 0; j < ans[i].length; j++){
//                if(ans[i][j] % 2 != 0){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}

package LeetCode;

import java.util.Arrays;

public class CellsWithOddValues {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {
                {0,1},
                {1,1}

        };
        int result = oddCells(m,n,indices);
        System.out.println(result);
//0 0 0
//0 0 0

//1 1 1
//0 0 0

//1 2 1
//0 1 0

//1 2 1
//1 2 1

//1 3 1
//1 3 1
    }
    static int oddCells(int m, int n, int[][] indices) {
        int [][] ans = new int[m][n];
        boolean check =  true;
        for(int i = 0; i < indices.length; i++){
            for(int j = 0; j < indices[i].length; j++){
                //increment for row
                if(check){
                    for(int k = 0; k < ans[indices[i][j]].length;k++){
                        ans[indices[i][j]][k]++;
                    }
                    check = false;
                }
                //increment for column
                else if(!check) {
                    for (int k = 0; k < ans.length; k++) {
                        ans[k][indices[i][j]]++;
                    }
                    check = true;
                }
            }
        }
        for(int[] a : ans){
            System.out.println(Arrays.toString(a));

        }
        int count = 0;
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                if(ans[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}

