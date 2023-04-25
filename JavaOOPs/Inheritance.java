package JavaOOPs;

class Person {
    String hair = "Black";
    int eye = 2;
}

class Son extends Person {
    void bnm() {
        System.out.println(hair);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Son s = new Son();
        s.bnm();
    }
}
