package Project.HospitalManagementSystem;

import java.util.Scanner;

class DoctorDetais extends PatientDetails {
    String qualification;
    Scanner sc = new Scanner(System.in);
    String id;

    public void setDoctorDetails() {
        for (;;) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Enter Name: ");
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
            System.out.println("Enter Age: ");
            name = sc.next();
            System.out.println("------------------------------------------------------------");
            try {
                int n = Integer.parseInt(name);
                if (n >= 28 && n <= 60) {
                    break;
                } else {
                    System.out.println("Minimum Doctor Age is 28 And Maximum 60");
                    System.out.println("Please Enter Correct Input Below");
                }
            } catch (Exception e) {
                System.out.println("Enter Correct Input: ");
            }
        }

        System.out.println("Enter Your Gender\"Male/Female/Other\"");
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
        System.out.print("Enter Mobile Number: +91 ");
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
        // "Working Experience
        for (;;) {
            System.out.println("Working Experience: ");
            String experience = sc.next();
            System.out.println("------------------------------------------------------------");
            try {
                int n = Integer.parseInt(experience);
                if (n >= 0 || n <= 30) {
                    break;
                } else {
                    System.out.println("Please Enter Correct Input Below");
                }
            } catch (Exception e) {
                System.out.println("Enter Correct Input: ");
            }
        }
    }

    public void qualification() {
        System.out.println("Enter Your Email ID: ");
        id = sc.nextLine();
        System.out.println("------------------------------------------------------------");
        System.out.println("Tell About Yourself & Your Qualifications");
        qualification = sc.nextLine();
        System.out.println(
                "ThankYou For Registration. We Will See Your Application And Contact You In Next 2 Working Days");
        System.out.println("------------------------------------------------------------");
        sc.close();
    }

    public void applyForTraining() {
        setDoctorDetails();
        System.out.println("How Long Do You Want To Train With Us: ");
        System.out.println("1.6 Months\n2.12 Months");
        for (;;) {
            String trainingDuration = sc.nextLine();
            System.out.println("------------------------------------------------------------");
            try {
                int n = Integer.parseInt(trainingDuration);
                if (n == 1 || n == 2) {
                    break;
                } else {
                    System.out.println("Please Enter Correct Input Below");
                }
            } catch (Exception e) {
                System.out.println("Enter Correct Inputt: ");
            }
        }
        qualification();
    }
}
