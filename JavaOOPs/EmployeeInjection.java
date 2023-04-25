package Practice;

class Employee {
    Employee(EmployeePassowrd pass) {
        pass.show();
    }
}

class EmployeePassowrd {
    private int amount = 50000;

    protected void show() {
        System.out.println("Amount is " + amount);
    }
}

public class EmployeeInjection {
    public static void main(String[] args) {
        EmployeePassowrd ep = new EmployeePassowrd();
        new Employee(ep);
    }
}
