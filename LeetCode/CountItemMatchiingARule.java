package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemMatchiingARule {
    public static void main(String[] args) {
        // List<String> temp = new ArrayList<>();
        ArrayList<List<String>> items = new ArrayList<List<String>>();
        // ArrayList<Integer> i = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "silver", "iphone"));
        items.add(Arrays.asList("phone", "silver", "iphone"));
        int ans = countMatches(items, "type", "phone");
        System.out.println(ans);

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    count++;
                }
            }
            return count;
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    count++;
                }
            }
            return count;
        } else if (ruleKey.equals("name")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}
