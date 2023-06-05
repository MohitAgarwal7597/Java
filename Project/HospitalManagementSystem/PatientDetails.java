package Project.HospitalManagementSystem;

import java.util.Scanner;

class PatientDetails {
    Scanner sc = new Scanner(System.in);
    String name;
    String age;
    String gender;
    String mobileNumber;

    public void setPatientDetails() {
        for (;;) {
            System.out.println("------------------------------------------------------------");
            System.out.print("Enter Name:\t|\t");
            name = sc.nextLine();
            System.out.println("------------------------------------------------------------");
            try {
                int n = Integer.parseInt(name);
                if (n >= 0 || n < 0) {
                    System.out.println("Plese Enter Correct Input!!");
                }

            } catch (Exception e) {
                break;

            }

        }
        for (;;) {
            System.out.print("Enter Age:\t|\t");
            age = sc.next();
            System.out.println("------------------------------------------------------------");
            try {
                int n = Integer.parseInt(age);
                if (n > 0 && n < 125) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter Correct Input: ");
            }
        }

        System.out.print("Enter Your Gender\"Male/Female/Other\":\t|\t");
        sc.nextLine();
        gender = sc.next();
        System.out.println("------------------------------------------------------------");
        for (;;) {
            if (gender.equalsIgnoreCase("male")) {
                break;
            } else if (gender.equalsIgnoreCase("female")) {
                break;
            } else if (gender.equalsIgnoreCase("other")) {
                break;
            } else {
                System.out.println("Enter Correct Input From Given Choice");
                gender = sc.nextLine();
            }
        }
        System.out.print("Enter Mobile Number:\t|\t+91 ");
        for (;;) {
            mobileNumber = sc.next();
            System.out.println("------------------------------------------------------------");
            try {
                Long temp = Long.parseLong(mobileNumber);
                if (mobileNumber.length() != 10) {
                    System.out.println("Enter Correct Number: +91 ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter Correct Number: +91 ");
            }
        }
    }

    public void patientReceipt() {

    }
}
