package JavaOOPs;

class Car {
    public void start(Engine eng) {
        eng.engine();
        System.out.println("Car Started");
    }
}

class Engine {
    public void engine() {
        System.out.println("Engine Started..");
    }
}

public class Injection {
    public static void main(String[] args) {
        Car c = new Car();
        Engine e = new Engine();
        c.start(e);
    }

}