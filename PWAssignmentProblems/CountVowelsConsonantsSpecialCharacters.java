package PWAssignmentProblems;

public class CountVowelsConsonantsSpecialCharacters {
    public static void main(String[] args) {
        String str = "sun rises from east & earth revolves around sun:";
        str = str.toUpperCase();
        str = str.replaceAll(" ", "");
        int totalChar = 0;
        int vowels = 0;
        int consononts = 0;
        int specialCharacters = 0;
        for (int i = 0; i < str.length(); i++) {
            totalChar++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - 65 == 0 || str.charAt(i) - 65 == 4 || str.charAt(i) - 65 == 8
                    || str.charAt(i) - 65 == 14 || str.charAt(i) - 65 == 20) {
                vowels++;
            } else if (str.charAt(i) - 65 == 1 || str.charAt(i) - 65 == 2 || str.charAt(i) - 65 == 3
                    || str.charAt(i) - 65 == 5 || str.charAt(i) - 65 == 6 || str.charAt(i) - 65 == 7
                    || str.charAt(i) - 65 == 9 || str.charAt(i) - 65 == 10 || str.charAt(i) - 65 == 11
                    || str.charAt(i) - 65 == 12 || str.charAt(i) - 65 == 13 || str.charAt(i) - 65 == 15
                    || str.charAt(i) - 65 == 16 || str.charAt(i) - 65 == 17 || str.charAt(i) - 65 == 18
                    || str.charAt(i) - 65 == 19 || str.charAt(i) - 65 == 21 || str.charAt(i) - 65 == 22
                    || str.charAt(i) - 65 == 23 || str.charAt(i) - 65 == 24 || str.charAt(i) - 65 == 24
                    || str.charAt(i) - 65 == 25) {
                consononts++;
            } else {
                specialCharacters++;
            }
        }
        System.out.println("Total Characters: " + totalChar +
                "Vowels: " + vowels + "\nConsonants: " + consononts + "\nSpecial Characters: " + specialCharacters);
    }
}
