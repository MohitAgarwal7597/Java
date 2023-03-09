package LeetCode;

import java.util.Arrays;

//Approach: Swap element one by one and check that sum of both the array is same 
public class FairCandySwap1 {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 2, 5 };
        int[] bobSizes = { 2, 4 };
        int[] result = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(result));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                int temp = aliceSizes[i];
                aliceSizes[i] = bobSizes[j];
                bobSizes[j] = temp;
                for (int k = 0; k < aliceSizes.length; k++) {
                    aliceSum += aliceSizes[k];
                }
                for (int k = 0; k < bobSizes.length; k++) {
                    bobSum += bobSizes[k];
                }
                if (aliceSum == bobSum) {
                    return new int[] { bobSizes[j], aliceSizes[i] };
                } else {
                    aliceSum = 0;
                    bobSum = 0;
                    bobSizes[j] = aliceSizes[i];
                    aliceSizes[i] = temp;
                }

            }
        }
        return new int[] { -1, -1 };

    }
}
