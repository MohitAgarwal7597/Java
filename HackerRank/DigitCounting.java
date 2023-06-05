package HackerRank;
//count digits in given input
import java.util.Scanner;

public class DigitCounting {
    public static void main(String[] args) {
        long i, q = 0, count = 0;
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        sc.close();
        for (int j = 1; j >= 1; j++) {
            q = i / 10;
            i = q;
            count++;
            System.out.println(q + ":" + i);
            if (i == 0 && q == 0) {
                break;
            }
        }
        System.out.println("There are " + count + " digits");
    }
}
