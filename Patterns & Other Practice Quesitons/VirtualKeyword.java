package Practice;

public class VirtualKeyword {
    void print() {
        System.out.println("This is Parent Class");
    }

    public static void main(String[] args) {
        VirtualKeyword v = new VirtualKeyword();
        v.print();
    }
}

class Child {
    void print() {
        System.out.println("This is child class");
    }
}
