package LeetCode;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 2, 5 };
        int[] bobSizes = { 2, 4 };
        int[] result = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(result));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] answer = new int[2];
        int aliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            aliceSum = aliceSum + aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            bobSum = bobSum + bobSizes[i];
        }
        int total = aliceSum + bobSum;
        int candiesBothShouldHave = total / 2;
        boolean breakNow = false;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] + bobSizes[j] == candiesBothShouldHave) {
                    answer[0] = aliceSizes[i];
                    aliceSizes[i] = 0;
                    breakNow = true;
                    break;
                }
            }
            if (breakNow) {
                break;
            }
        }
        for (int i = 0; i < bobSizes.length; i++) {
            for (int j = 0; j < aliceSizes.length; j++) {
                if (bobSizes[i] + aliceSizes[j] == candiesBothShouldHave) {
                    answer[1] = bobSizes[i];
                    break;
                }
            }
        }
        System.out.println(aliceSum);
        System.out.println(bobSum);
        System.out.println(candiesBothShouldHave);
        System.out.println(Arrays.toString(aliceSizes));
        System.out.println(Arrays.toString(bobSizes));
        return answer;
    }
}
