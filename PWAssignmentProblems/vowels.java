//Keep vowels from a string remove all consonants from the string.
package PWAssignmentProblems;

class HelloWorld {
    public static void main(String[] args) {
        String name = "hello have a good day";
        String vowels = "aeiouAEIOU";
        char newName = ' ';
        for (int i = 0; i < name.length(); i++) {
            boolean matched = true;
            for (int j = 0; j < 10; j++) {
                if (name.charAt(i) == vowels.charAt(j)) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                name = name.replace(name.charAt(i), newName);
            }

        }
        System.out.println(name);

    }
}