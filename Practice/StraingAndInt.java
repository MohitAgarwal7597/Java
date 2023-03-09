package Practice;

import java.util.Scanner;

class Hacker {
    void solveProblem() {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int num1 = num;

        for (int i = 0; i < name.length(); i++) {
            if (i > name.length() || i == 15) {
                break;
            }
            System.out.print(name.charAt(i));
        }

        int count = 0;
        for (int i = 0; i >= 0; i++) {
            int qut = num / 10;
            num = qut;
            count++;
            if (qut == 0 && num == 0)
                break;
        }
        if (count == 3) {
            System.out.println(num1);
        }
        if (count == 2) {
            System.out.println("0" + num1);
        }
        if (count == 1) {
            System.out.println("00" + num1);
        }
    }
}

public class StraingAndInt {
    public static void main(String[] args) {
        Hacker h = new Hacker();
        h.solveProblem();
        h.solveProblem();
        h.solveProblem();

    }
}
