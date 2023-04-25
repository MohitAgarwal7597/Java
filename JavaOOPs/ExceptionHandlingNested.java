package JavaOOPs;

import java.util.Scanner;

class FaceBook {
    String name = "Mohit";
    int pass = 12344321;
    String iname;
    int ipass;
}

class Login extends FaceBook {
    Boolean status = false;
    Scanner sc = new Scanner(System.in);

    public void login() {
        System.out.println("Enter Your Name: ");
        try {

            iname = sc.next();
        } catch (Exception e) {
            System.out.println("Input Error");
            try {
                iname = sc.next();
            } catch (Exception se) {
                System.out.println("Exception Error");
            }
        }
        System.out.println("Enter Your Password: ");
        ipass = sc.nextInt();
    }

    public void check() {
        if (name.equalsIgnoreCase(iname) && pass == ipass) {
            System.out.println("Logged In..");
            status = true;
        } else {
            System.out.println("Wrong Password or User Name. Try Again..");
        }
    }
}

public class ExceptionHandlingNested extends Login {
    public static void main(String[] args) {
        int i = 0;
        Login l = new Login();
        l.login();
        l.check();
        while (i < 2) {
            if (!l.status) {
                l.login();
                l.check();
            }
            i++;
        }
    }
}
