package Project.HospitalManagementSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class HospitalManagementSystem implements HospitalInterface {
    Scanner sc = new Scanner(System.in);
    PatientDetails p = new PatientDetails();
    DoctorDetais d = new DoctorDetais();

    String title = "Checkup!!";

    @Override
    public void receipt(String title) {
        System.out.print("\n\t\t\t\tR E C E I P T");
        System.out.println(
                "\n************************************************************************************");
        System.out.println("* Kindly Bring Your Receipt For" + title);
        System.out.println(
                "* Patient Name: " + p.name);
        System.out.println(
                "* Patient Age: " + p.age);
        System.out.println(
                "* Patient Gender: " + p.gender);
        System.out.println("* Patient Mobile Number: +91" + p.mobileNumber);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        System.out.print("    \t\t\t\t\t\tTime: " + dtf.format(now));
        System.out.println(" | Date: " + dtf1.format(now));
        System.out.println(
                "************************************************************************************");
    }

    @Override
    public void fixAppointment() {
        String title = "Taking Appointment With Doctor.";
        p.setPatientDetails();
        System.out.println("Appoinment Fixed Sucessfully...");
        System.out.println("Come Tommorow At 9 AM For Checkup!!");
        receipt(title);
    }

    @Override
    public void registerForDoctor() {
        d.setDoctorDetails();
        DoctorDetais d = new DoctorDetais();
        d.qualification();

    }

    @Override
    public void checkUps() {
        int choice = 0;
        System.out.println("------------------------------------------------------------");
        System.out.println("1.Fully Body CheckUp\n2.Blood Test\n3.CT Scan\n4.X-Ray/Sonography\n5.Urine Test");
        System.out.println("------------------------------------------------------------");
        choice = sc.nextInt();

        switch (choice) {
            case 1: {
                p.setPatientDetails();
                System.out.println("Your Full Body Checkup Appoinment Fixed Sucessfully.");
                receipt(title);
                System.out.println("Come Day After Tommorow Take Your Report.");
                System.out.println("Thank You!!");
                System.out.println("------------------------------------------------------------");
                break;
            }
            case 2: {
                p.setPatientDetails();
                System.out.println("Your Blood Test Appoinment Fixed Sucessfully.");
                receipt(title);
                System.out.println("Thank you!!");
                System.out.println("------------------------------------------------------------");
                break;
            }
            case 3: {
                p.setPatientDetails();
                System.out.println("Your CT Scan Appoinment Fixed Sucessfully.");
                receipt(title);
                System.out.println("Thank you!!");
                System.out.println("------------------------------------------------------------");
                break;
            }
            case 4: {
                System.out.println("------------------------------------------------------------");
                System.out.println("1.X-Ray\n2.Sonography");
                System.out.println("------------------------------------------------------------");
                int choic = 0;
                choic = sc.nextInt();
                switch (choic) {
                    case 1: {
                        p.setPatientDetails();
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Your Appointment For X-Ray Scan is Fixed Sucessfully..");
                        receipt(title);

                        System.out.println("Thank you!!");
                        System.out.println("------------------------------------------------------------");
                        break;
                    }
                    case 2: {
                        p.setPatientDetails();
                        System.out.println("Your Appointment For Sonography is Fixed Sucessfully..");
                        receipt(title);

                        System.out.println("Thank you!!");
                        System.out.println("------------------------------------------------------------");
                        break;
                    }
                }
                break;
            }
            case 5: {
                p.setPatientDetails();
                System.out.println("Your Appointment For Urine Test is Fixed Sucessfully..");
                receipt(title);
                System.out.println("Thank you!!");
                System.out.println("------------------------------------------------------------");
                break;
            }
        }
        sc.close();
    }

    @Override
    public void contactUs() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("--> Address - Computer Hospital Inside ComputerWorld Intel");
        System.out.println("--> Contact Support:-\n--> +91-7375-XXX-573");
        System.out.println("--> +91-7878-XXX-878");
        System.out.println(
                "--> For Ambulance Support Call: 108/+91- 9828-XXX-123\n--> Press 3 For Ambulance or Press Other Key For Home Page");
        System.out.println("-------------------------------------------------------------");
        try {
            int ambulance = sc.nextInt();
            if (ambulance == 3) {
                System.out.println("Ambulance Is Ready To Leave. Please Give Address..");
                String Addresss = sc.nextLine();
                String Address = sc.nextLine();
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ambulance Arriving At " + Address);
                System.out.println("-------------------------------------------------------------");
            } else {
                System.out.println("Back To Home Page");
            }
        } catch (Exception e) {
            System.out.println("Back To Home Page");
            System.out.println("-------------------------------------------------------------");
        }

    }

    @Override
    public void availableDoctors() {
        System.out.println("------------------------------------------------------------");
        System.out.println("--> Doctors Availability");
        System.out.println("--> For Viral,Cough,Other Normal Disease: 09:00 to 12:00 & 03:00 to 06:00");
        System.out.println("--> 24/7 Available for Other Serious Condition");
        System.out.println("------------------------------------------------------------");

    }
}
