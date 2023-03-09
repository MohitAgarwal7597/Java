package PWAssignmentProblems;

public class Palindrome {
    public static void main(String[] args) {
        String str = "2552";
        boolean status = true;
        int j = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            j--;
            if (str.charAt(i) == str.charAt(j)) {
                continue;
            } else {
                status = false;
                break;
            }
        }
        if (status) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindome");
        }
    }
}
