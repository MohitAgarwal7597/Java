package JavaOOPs;

import java.util.Scanner;

class demo {
    int n = 1;
    Scanner sc = new Scanner(System.in);

    public void check() {
        try {
            n = sc.nextInt();
        } catch (Exception e) {

            n = sc.nextInt();
            // catch (Exception se) {
            // System.out.println("try again");
            // }

            System.out.println("try again");
        }
    }

}

public class ExceptionHandlingNested1 {
    public static void main(String[] args) {
        demo d = new demo();
        d.check();
    }
}
