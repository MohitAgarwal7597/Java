package JavaOOPs.MultiThreading;

class Main {
    // Thread is a class in which there are static methods to get the priority,name
    // etc. of a thread.
    static void show() {
        int priority;
        System.out.println("Before Changing");
        String name = Thread.currentThread().getName();
        priority = Thread.currentThread().getPriority();
        System.out.println(name);
        System.out.println(priority);
    }

    static void display() {
        System.out.println("After Changing");
        Thread.currentThread().setName("Java Thread");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());
    }
}

class Multithreading {
    public static void main(String[] args) {
        Main.show();
        Main.display();
    }
}