package JavaOOPs.AbstractClass;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Fruit[] arrFruit = new Fruit[5];
        ((Apple) arrFruit).display();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter the fruit no " + (i + 1) + " among Apple, Mango, Watermelon");
            String myfruit = sc.nextLine();
            if (myfruit.equalsIgnoreCase("apple")) {
                arrFruit[i] = new Apple();
            }

            else if (myfruit.equalsIgnoreCase("mango")) {
                arrFruit[i] = new Mango();
            } else if (myfruit.equalsIgnoreCase("watermelon")) {
                arrFruit[i] = new Watermelon();
            }
        }

        for (int i = 0; i < 5; i++) {
            // Fruit f = new Apple();
            // Fruit m = new Mango();
            // Fruit w = new Watermelon();
            System.out.println(arrFruit[i].display());
            // arrFruit[i].display();

        }
        // System.out.println(arrFruit[i]);
    }

}

abstract class Fruit {
    protected abstract String display();
}

class Apple extends Fruit {
    @Override
    public String display() {
        String fruitname = this.getClass().getName();
        return "The name of this Fruit class is:  " + fruitname;
    }

    public String toString() {
        String fruitname = this.getClass().getName();
        return "The name of this Fruit class is:  " + fruitname;
    }
}

class Mango extends Fruit {

    public String display() {
        String fruitname = this.getClass().getName();
        return "The name of this Fruit class is:  " + fruitname;
    }
}

class Watermelon extends Fruit {

    public String display() {
        String fruitname = this.getClass().getName();
        return "The name of this Fruit class is:  " + fruitname;
    }
}