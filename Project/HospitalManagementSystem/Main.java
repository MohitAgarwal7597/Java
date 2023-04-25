package Project.HospitalManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoctorDetais d = new DoctorDetais();
        Scanner sc = new Scanner(System.in);
        HospitalManagementSystem h = new HospitalManagementSystem();
        boolean run = true;
        while (run) {
            System.out.println("\n\n\t\t*****Welcome To Online Hospital Management System*****");
            System.out.print(
                    "------------------------------------------------------------------------------------------");
            System.out.print(
                    "\n1.Fix Appoinment\n2.Register For Doctors\n3.CheckUps\n4.Hospital Doctors Timing\n5.Apply For Training\n6.Contact Us..\n7.Exit\n");
            System.out.println(
                    "------------------------------------------------------------------------------------------");
            int key;
            try {
                key = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Please Don't Enter Characters\n");
                break;
            }
            // String temp = "";
            // for (;;) {
            // temp = sc.next();
            // try {
            // key = Integer.parseInt(temp);
            // if (key < 0 && key > 7) {
            // System.out.println("Enter Correct Input: ");
            // } else {
            // break;
            // }

            // } catch (Exception e) {
            // System.out.println("Enter Correct Input: ");
            // }
            // }
            switch (key) {
                case 1: {
                    h.fixAppointment();
                    break;
                }
                case 2: {
                    h.registerForDoctor();
                    break;
                }
                case 3: {
                    h.checkUps();
                    break;
                }
                case 4: {
                    h.availableDoctors();
                    break;
                }
                case 5: {
                    d.applyForTraining();
                    break;
                }
                case 6: {
                    h.contactUs();
                    break;
                }
                case 7: {
                    System.out.println("Exit");
                    System.out.println("ThankYou For Visiting!!");
                    run = false;
                    break;
                }
                default: {
                    System.out.println("Enter Choice Between 1 To 7");
                    break;
                }
            }
            if (key > 0 && key < 8) {
                break;
            }
        }
        sc.close();
    }
}