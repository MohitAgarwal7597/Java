package Practice;

import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        int num;
        int tempResult = 1;
        int finalResult = 0;
        int result = 0;
        int update;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        num = sc.nextInt();
        int copy = num;
        int num1 = num;
        int n = num;

        // This code finds number of digits in the number:
        int count = 0;
        for (int j = 0; j < 1; j--) {
            int temp0 = num / 10;
            num = temp0;
            count++;
            if (num == 0) {
                break;
            }

        }

        // this code finds wheather the code is armstrong or not:

        for (int i = 1; i <= count; i++) {
            int temp = num1 % 10;
            tempResult = temp;
            update = num1 / 10;
            num1 = update;
            for (int k = 0; k < count - 1; k++) {
                tempResult = temp * tempResult;
            }
            finalResult = finalResult + tempResult;
        }
        if (finalResult == copy) {
            System.out.println("This is Armstrong number ");
        } else
            System.out.println("This is not a armstrong number");
    }
}