package Practice;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        list.add(3);
        list.add(5);
        list.add(1);
        for (int num : list) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println(list.indexOf(max));

    }
}
