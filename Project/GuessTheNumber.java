package Project;

import java.lang.Math;
import java.util.Scanner;

class Guess {
    double temp;
    int guess;

    void computerGuess() {
        temp = Math.random() * 100;
        guess = (int) temp;
    }
}

class User extends Guess {
    int userGuess;
    Scanner sc = new Scanner(System.in);

    void userGuess() {
        userGuess = sc.nextInt();
    }
}

class Run {
    Scanner sc = new Scanner(System.in);
    Guess g = new Guess();
    User u = new User();
    char choice = 'y';

    void run() {
        while (choice == 'y') {
            System.out.println("Guess the number between  1 to 100: ");
            g.computerGuess();
            int attemp = 0;
            while (attemp != 5) {
                u.userGuess();
                attemp++;
                if (attemp == 5) {
                    System.out.println("You Lost\nCorrect Number was " + g.guess);
                    break;
                }

                if (u.userGuess < g.guess) {
                    System.out.println("Guess Bigger");
                } else if (u.userGuess > g.guess) {
                    System.out.println("Guess Lesser");
                } else {
                    System.out.println("You Guess it correct! You Won");
                    break;
                }
            }
            System.out.println("Do You Want to play again(y/n) ");
            choice = sc.next().charAt(0);
        }
    }

}

public class GuessTheNumber {
    public static void main(String[] args) {
        Run r = new Run();
        r.run();
    }
}
