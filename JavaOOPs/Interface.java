package JavaOOPs;

import java.util.Scanner;

interface Patient {
    void pName();

    void pAge();

    void appointmentStatus();
}

class Patient1 implements Patient {
    @Override
    public void pName() {
        System.out.println("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
    }

    @Override
    public void pAge() {
        System.out.println("Enter Your Age: ");
    }

    @Override
    public void appointmentStatus() {
        System.out.println("Appointment Fixed!");
    }
}

class Hospital implements Patient {
    public void pName() {
        System.out.println("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
    }

    @Override
    public void pAge() {
        System.out.println("Enter Your Age 2: ");
    }

    @Override
    public void appointmentStatus() {
        System.out.println("Appointment Fixed!");
    }
}

public class Interface {
    public static void main(String[] args) {
        Patient1 p = new Patient1();
        p.pAge();

    }

}
