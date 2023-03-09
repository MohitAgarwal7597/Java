package Practice;

import java.util.Scanner;

class indata {
    String name;
    int num, num1, copy;
    String[] nam = new String[3];
    int value[] = new int[3];

    void in() {
        for (int m = 0; m < 3; m++) {
            Scanner sc = new Scanner(System.in);
            name = sc.next();
            nam[m] = name;

            int j = 0;
            num = sc.nextInt();
            num1 = num;
            value[m] = num;
        }
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
                System.out.println(copy);
            }
            if (count == 2) {
                System.out.println("0" + copy);
            }
            if (count == 1) {
                System.out.println("00" + copy);
            }
        }
    }
}

public class problem {
    public static void main(String[] args) {
        indata h = new indata();
        h.in();
        // h.showArray();
        h.solveProblem();
        System.out.println("================================");

    }
}
