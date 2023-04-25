package JavaOOPs;

interface A {
    void show(int a, String b);
    // void display(); // not possible because Lambda expression can be used only on
    // functional interface.
}

public class LambdaExpression {
    public static void main(String[] args) {
        A a = (c, d) -> {
            System.out.println("This is show method" + c + d);
            System.out.println("hi");
        };
        a.show(4, "MOhit");
        a.show(5, "Shubham");

        A ab = new A() {
            public void show(int v, String x) {
                System.out.println("this is anonymous class" + v + " " + x);
            }
        };
        ab.show(21, "MOhit");

    }
}