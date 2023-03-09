package LeetCode;

import java.util.ArrayList;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = { { 1950, 1961 }, { 1960, 1971 }, { 1970, 1981 } };
        int ans = maximumPopulation(logs);
        System.out.println(ans);
    }

    public static int maximumPopulation(int[][] logs) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        int birth = 0;
        int death = 1;
        for (int arr = 0; arr < logs.length; arr++) {
            int count = 0;
            for (int nextArr = arr + 1; nextArr < logs.length; nextArr++) {
                if (logs[arr][death] > logs[nextArr][birth]) {
                    count++;
                }
            }
            list.add(count);
        }
        for (int num : list) {
            if (max < num) {
                max = num;
            }
        }
        int index = list.indexOf(max);
        return logs[index][birth];
    }
}
