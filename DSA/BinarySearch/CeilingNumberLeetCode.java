package DSA.BinarySearch;

// Problem. Return next greatest letter than given target if target dosen't exits in array return first letter of the array and for last element too.
public class CeilingNumberLeetCode {
    public static void main(String[] args) {
        char[] arr = { 'a', 'c', 'f', 'h', 'k', 'o', 'r', 'u', 'x', 'y' };
        char target = 'h';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= letters[letters.length - 1]) {
                return letters[0];
            } else if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            } else if (letters[mid] == target) {
                return letters[mid + 1];
            }
        }
        return letters[start];
    }
}
