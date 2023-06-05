package JavaOOPs;

class Person {
    public void show() {
        System.out.println("This is outer class show method: ");
    }

    class Heart extends Person {
        @Override
        public void show() {
            System.out.println("This is innner class show method");
        }

        int heartBeat = 20;
        int pulse;
        int weight;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Person p = new Person();
        p.show();
        Person.Heart h = p.new Heart();
        p = h;
        System.out.println(h.heartBeat = 25);
        p.show();
        // h.show();

    }
}
