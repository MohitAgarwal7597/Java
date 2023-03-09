package PWAssignmentProblems;

public class PrintDuplicatesFromString {
    public static void main(String[] args) {
        String str = "hello this is a string made by use of characters and my name is mohit agarwal";
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        char[] c = str.toCharArray();
        String s = "";
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    s = s + c[i];
                }
            }
        }
        char[] b = s.toCharArray();
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] == b[j]) {
                    b[i] = ' ';
                }
            }
        }
        String a = "";
        for (char n : b) {
            a = a + n;
        }
        a = a.replace(" ", "");
        System.out.println(a);
    }
}
