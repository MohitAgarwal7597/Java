package PWMockTest;

public class NonRepeating {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(reapting(str));
    }

    public static int reapting(String str) {
        boolean staus = false;
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            staus = false;
            for (int j = i + 1; j < c.length; j++) {
                if (i < c.length - 1 && c[i] == c[j]) {
                    staus = true;
                    if (c[j] == c[i]) {
                        c[j] = '.';
                    }
                }
            }
            if (staus) {
                c[i] = '.';
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] != '.') {
                return i;
            }
        }
        return -1;
    }
}
