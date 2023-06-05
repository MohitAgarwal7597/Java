//HakerRank Problem: Show Preceding 0 if integer is less than 3 digits.....
package HackerRank;

import java.util.Scanner;

class indata {
    Scanner sc = new Scanner(System.in);
    String name;
    int num, num1, copy;
    String[] nam = new String[3];
    int value[] = new int[3];

    void input() {
        for (int m = 0; m < 3; m++) {
            System.out.println("Enter String: ");
            name = sc.next();
            nam[m] = name;
            System.out.println("Enter Number: ");
            num = sc.nextInt();
            num1 = num;
            value[m] = num;
        }
        sc.close();
    }

    // void showArray() {
    // for (int i = 0; i < 3; i++) {
    // System.out.println(nam[i]);
    // System.out.println(value[i]);
    // }
    // }

    void solveProblem() {
        System.out.println("================================");
        for (int m = 0; m < 3; m++) {
            name = nam[m];
            for (int i = 0; i < name.length(); i++) {
                if (i > name.length() || i == 15) {
                    break;
                }
                System.out.print(name.charAt(i));
            }
            System.out.print(" ");

            int count = 0;
            num = value[m];
            copy = num;
            for (int i = 0; i < 3; i++) {
                int qut = num / 10;
                num = qut;
                count++;
                if (qut == 0 && num == 0)
                    break;
            }
            if (count == 3) {
                System.out.println("               " + copy);
            }
            if (count == 2) {
                System.out.println("               " + "0" + copy);
            }
            if (count == 1) {
                System.out.println("               " + "00" + copy);
            }
        }
    }
}

public class HackerRankPrecedingZero {
    public static void main(String[] args) {
        indata h = new indata();
        h.input();
        // h.showArray();
        h.solveProblem();
        System.out.println("================================");

    }
}
