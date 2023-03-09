package PWAssignmentProblems;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "This is a String";
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        System.out.println(str);
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    c[i] = ' ';
                }
            }
        }
        String s = "";
        for (char n : c) {
            s = s + n;
        }
        s = s.replace(" ", "");
        System.out.println(s);
    }
}
