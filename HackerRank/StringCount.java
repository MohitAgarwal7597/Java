package HackerRank;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i <= 14; i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }
    }

}
