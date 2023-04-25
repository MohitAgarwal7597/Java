package JavaOOPs;

import java.util.InputMismatchException;
import java.util.Scanner;

// import org.jcp.xml.dsig.internal.SignerOutputStream;

public class ExceptionHandling {
    public static void main(String[] args) {
        // int num = 50;
        System.out.println("Enter Your roll: ");
        Scanner sc = new Scanner(System.in);
        int roll = 0;
        int number = 0;
        try {

            roll = sc.nextInt();
            System.out.println("Enter number");
            number = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please Enter correct input");
        } catch (ArithmeticException e) {
            System.out.println("This is arthematic exception");
        } catch (Exception e) {
            System.out.println("This is Exception class");
        } finally {
            System.out.println("This is finally");
        }

        System.out.println(roll);
    }
}
