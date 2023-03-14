package Practice;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        int x = 5;
        x++;
        if (x == 6) {
            System.out.println("Its postincrement");
        }
        ++x;
        if (x == 7) {
            System.out.println("Its preincrement");
        }
        // System.out.println(x++);
        // System.out.println(++x);
    }
}
