package Bank;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class BankingSystem extends Functions {
    public static void main(String[] args) {
        char c = 'y';
        Functions F = new Functions();
        Scanner sc = new Scanner(System.in);
        while (c == 'y') {
            System.out.println("<<Welcome To Bank Of Computers>>\nWe Provide Following Services");
            System.out.println("1.Transfer Amount.\n2.Withdraw Cash\n3.Check Bank Balance\n4.Double My Money\n5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    F.transferAmount();
                    break;
                }

                case 2: {
                    F.withdrawCash();
                    break;
                }

                case 3: {
                    F.checkBankBalance();
                    break;
                }
                case 4: {
                    System.out.println("Welcome To Laxmi Chit Fund");
                    System.out.println("Your Money Will Be Doubled in 21 Day's\nThanks!");
                    F.totalAmount = 0;
                    break;
                }

                case 5: {
                    System.out.println("Thanks! Welcome Back..");
                    break;
                }

            }
            if (choice == 5)
                break;
        }
    }

}

class Functions {
    int totalAmount = 5000;
    // int pin = 4321;
    int amount;

    void psd() {
        System.out.println("Enter Password: ");
        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        while (pass != 1234) {
            System.out.println("Wrong Password Try Again.. ");
            pass = sc.nextInt();
        }
    }

    void transferAmount() {
        psd();
        System.out.println("Enter Account Number: ");
        Scanner sc = new Scanner(System.in);
        long accountNumber = sc.nextInt();
        System.out.println("Enter Amount To Transfer: ");
        amount = sc.nextInt();
        while (!(amount > totalAmount && amount <= 0)) {
            if (amount > totalAmount) {
                System.out.println("Insufficient Balaance.");
                System.out.println("Please Enter Valid Amount: ");
                amount = sc.nextInt();
            }
            if (amount <= 0) {
                System.out.println("Please Enter Valid Amount: ");
                amount = sc.nextInt();
            } else {
                totalAmount = totalAmount - amount;
                System.out.println("Processing..");
                System.out.println("Done..Amount Transfered\n\n\n");
                System.out.println("\t\t\t*****Receipt*****");
                System.out.println("Transfered To: " + accountNumber);
                System.out.println("Amount Transfered: " + amount);
                System.out.println("Available Balance: " + totalAmount);
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
                System.out.println("Time: " + dtf.format(now));
                System.out.println("Date: " + dtf1.format(now));
                break;
            }
        }

    }

    void checkBankBalance() {
        psd();
        System.out.println("Available Balance is: " + totalAmount);
    }

    void withdrawCash() {
        psd();
        System.out.println("Enter Amount To Withdraw: ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        while (!(amount >= 1 && amount <= totalAmount)) {
            if (amount > totalAmount) {
                System.out.println("Low Balance..Try Again.\nEnter Amount: ");
                amount = sc.nextInt();
            }
            if (amount < 1) {
                System.out.println("Negative Value Or 0 Can't Be Out\nEnter Valid Input..\nEnter Amount: ");
                amount = sc.nextInt();
            } else {
                continue;
            }
        }
        totalAmount = totalAmount - amount;
        System.out.println("Cash Is Out | Take Your Money From The Box.");
        System.out.println("Available Balance: " + totalAmount);

    }
}