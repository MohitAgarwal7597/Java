package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

class SortIntegersByNumberOf1Bits{
    public static void main(String[] args) {
        int [] nums = {0,2,54,26,249,6516,324,16,32,151,64,6,8,21,22};
        
        System.out.println(Arrays.toString(sortByBits(nums)));
    }
    public static int[] sortByBits(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[arr.length];
        int check = 0;
        for(int i : arr){
            if(check < i){
                check = i;
            }
        }
        for(int i = 0; i <= check;){
            for(int j = 0; j < arr.length; j++){
                if(i == arr[j]){
                    arr[j] = 0;
                    list.add(i);
                }

            }
            if(i == 0){
                i++;
            }
            else{
            i = i*2;
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i++){
            ans[i] = list.get(i);
        }
    return ans;
        
    }
}