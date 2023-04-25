package JavaOOPs;

import java.util.Scanner;

abstract class Shape {
    Scanner sc = new Scanner(System.in);
    float area;
    float length;
    float breadth;

    abstract void caculate();

    abstract void input();

    final void display() {
        System.out.println("Area is " + area);
    }
}

class Rectangle extends Shape {
    void input() {
        System.out.println("Enter the Length of Rectangle: ");
        length = sc.nextInt();
        System.out.println("Enter the breadth of Rectangle: ");
        breadth = sc.nextInt();
    }

    void caculate() {
        area = length * breadth;
    }
}

class Square extends Shape {
    void input() {
        System.out.println("Enter the Length of Square: ");
        length = sc.nextInt();
    }

    void caculate() {
        area = length * length;
    }
}

class Circle extends Shape {
    void input() {
        System.out.println("Enter the Radius of Circle: ");
        length = sc.nextInt();
    }

    void caculate() {
        area = length * length * 3.14f;
    }
}

class Trianle extends Shape {
    void input() {
        System.out.println("Enter the Length of Triangle: ");
        length = sc.nextInt();
        System.out.println("Enter the breadth of Triangle: ");
        breadth = sc.nextInt();
    }

    void caculate() {
        area = length * breadth * (.5f);
    }
}

class Reference {
    private Shape ref;

    void show(Shape ref) {
        this.ref = ref;
        ref.input();
        ref.caculate();
        ref.display();
    }
}

public class AreaOfShapesUsingOOPs {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Square s = new Square();
        Circle c = new Circle();
        Trianle t = new Trianle();
        Reference ref = new Reference();
        ref.show(r);
        ref.show(s);
        ref.show(c);
        ref.show(t);
    }
}
