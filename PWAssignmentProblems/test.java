package PWAssignmentProblems;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str = "MOHIT";
        StringBuilder reversed = new StringBuilder("");
        System.out.println("String before reverse: " + str);

        for (int i = str.length() - 1; i > -1; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println("String after reverse: " + reversed);
    }
}
