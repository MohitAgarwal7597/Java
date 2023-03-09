package LeetCode;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.println(j);

            }
            if (i == 3) {
                break;
            }
        }
    }
}
