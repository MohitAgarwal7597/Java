package DSA.Stack;

import java.util.Scanner;

class stack_implementation extends Functions {
    public static void main(String[] args) {
        Functions F = new Functions();
        Scanner sc = new Scanner(System.in);
        char c = 'y';
        while (c == 'y') {
            System.out.println("1.Push\n2.Pop\n3.Show Memory\n4.Empty Stack\n5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    F.Push();
                    break;
                }

                case 2: {
                    F.Pop();
                    break;
                }

                case 3: {
                    F.Show_Memory();
                    break;
                }

                case 4: {
                    F.Empty_Stack();
                    break;
                }

                case 5: {
                    System.out.println("Thanks! Welcome Back..");
                    break;
                }

                default:
                    System.out.println("Invalid Input\nPlease Rerun Program & Enter Correct Choice..");
                    break;

            }
            if (choice == 5)
                break;
            System.out.println("Do You Want To Run It Again..y/n");
            c = sc.next().charAt(0);
        }
        // sc.close();

    }
}

class Functions {

    int[] arr = new int[100];
    int Top = -1;

    void Push() {
        System.out.print("Enter Element To Push: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // sc.close();
        Top++;
        arr[Top] = num;
        System.out.println("Item Pushed: " + arr[Top] + " At Position " + (Top + 1));
    }

    void Pop() {
        System.out.println("Item Poped: " + arr[Top]);
        Top--;
    }

    void Show_Memory() {
        System.out.println("Available Storage: " + ((Top + 1)) + "/100");
    }

    void Empty_Stack() {
        Top = -1;
        System.out.println("Stack is Empty Now " + (Top + 1) + "/100");
    }
}