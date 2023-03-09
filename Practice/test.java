package Practice;

public class test {
    public static void main(String[] args) {
        int i = 0;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                i++;
                if (i == 3) {
                    break;
                }
                System.out.println(i);
            }
            if (i == 3) {
                break;
            }
        }
    }
}
