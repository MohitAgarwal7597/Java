import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.println(power());
    }

    static int power() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        System.out.println("Enter the power");
        int pow = sc.nextInt();
        sc.close();
        int temp = a;

        for (int i = 1; i < pow; i++) {
            a = temp * a;
        }
        return a;
    }
}
