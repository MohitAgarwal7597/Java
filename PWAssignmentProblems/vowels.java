package PWAssignmentProblems;

class HelloWorld {
    public static void main(String[] args) {
        String name = "hello have a good day";
        String vowels = "aeiouAEIOU";
        String newName = "";
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (name.charAt(i) == vowels.charAt(j)) {
                    continue;
                } else {
                    char c = name.charAt(i);
                    newName = name.replace(name.charAt(i), "");
                }
            }

        }
        System.out.println(name);

    }
}