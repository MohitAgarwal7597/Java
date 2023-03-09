//package LeetCode;
//
//import java.util.Arrays;
//
//public class CreateTargetArrayInTheGivenOrder {
//    public static void main(String[] args) {
//    int [] nums = {0,1,2,3,4};
//    int [] index = {0,1,2,2,1};
//        System.out.println(Arrays.toString(createTargetArray(nums,index)));
//    }
//    static int[] createTargetArray(int[] nums, int[] index) {
//
//        int [] target = new int[nums.length];
//        for(int i = 0; i < nums.length; i++){
//            int x = 0;
//            for(int j = 0; j < nums.length; j++){
//                for(int k = i; k > 0; k--){
//                    if(index[i] == index[k]){
//                        for(int copy : target){
//                            int [] copyArr = new int[target.length];
//                            copyArr[x] = copy;
//                            x++;
//                        }
//                        for(int m = index[i] + 1; m < i; m++){
//                            target[index[i + 1]] = copyArr[]
//
//                        }
//                        target[i]
//                    }
//                }
//                target[index[i]] = nums[i];
//            }
//        }
//        return target;
//    }
//}
