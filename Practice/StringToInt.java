package Practice;

public class StringToInt {
    public static void main(String[] args) {
        String num = "807";
        int i = Integer.parseInt(num);
        System.out.println(i + 1);

        int[] arr = { 2, 5, 70 };
        String s = "";
        int k = 0;
        while (arr.length != k) {
            s += Integer.toString(arr[k]);
            k++;
        }
        int l = Integer.valueOf(s + 1);
        System.out.println(l + 1);
    }
}
