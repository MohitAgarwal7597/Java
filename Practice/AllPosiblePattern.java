package Practice;

//Print All The Sub Set Of Given String. Ex: String s = "ABC"
// Output will be: "A" ,"AB", "ABC","B","BC","C"
import java.util.ArrayList;

public class AllPosiblePattern {
    public static void main(String[] args) {
        System.out.println(allPosiblePattern("ABC"));
    }

    public static ArrayList<String> allPosiblePattern(String s) {
        // ArrayList To Add Elements In It.
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            // Adding Every Individual Element To The List
            list.add(s.charAt(i) + "");
            for (int j = i + 1; j < s.length(); j++) {
                int lastindex = list.size() - 1;
                // This will concatinate previous element with next element and add it to next
                // index
                list.add((list.get(lastindex) + "" + s.charAt(j)));
            }
        }
        return list;
    }
}
