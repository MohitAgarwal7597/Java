package Patterns;

public class check {
    public static void main(String[] args) {
        int temp2, num = 153;
        for (int i = 0; i < 3; i++) {
            temp2 = num % 10;
            int temp = temp2;
            temp2 = num / 10;
            num = temp2;
            System.out.println(temp);
        }
    }
}
