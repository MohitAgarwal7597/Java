package Practice;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonaciSeries(0, 10, 0)));
    }

    static int[] fibonaciSeries(int first, int last, int n) {
        int i = n;
        int[] arr = new int[last];
        first = n;
        last = n + 1;
        arr[i] = first + last;
        i++;
        if (i < 10) {
            return arr;
        }
        fibonaciSeries(first, last, i);
        return arr;
    }
}
