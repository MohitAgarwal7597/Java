package DSA.LinkedList.SinglyLinkedList;

public class Node_basics {
    int data;
    Node_basics next;

    Node_basics(int data) {
        this.data = data;
    }

    // length of the list recurssively
    static int lengthR(Node_basics head, int count) {
        if (head == null) {
            return count;
        }
        return lengthR(head.next, ++count);
    }

    // length of the list iteratively
    static int length(Node_basics head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // **Printing all data in reverse order ***
    static void displayReverse(Node_basics head) {
        if (head == null) {
            return;
        }
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }

    // ***Printing all the data Using Recurssion.
    static void displayR(Node_basics head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    static void display(Node_basics head) {// print all the data without recurssion.
        while (head != null) {
            System.out.print(head.data + " ");// print current node data.
            head = head.next; // move to next node
        }
    }

    public static void main(String[] args) {
        // creating five new nodes
        Node_basics a = new Node_basics(45);// head node
        Node_basics b = new Node_basics(50);
        Node_basics c = new Node_basics(55);
        Node_basics d = new Node_basics(59);
        Node_basics e = new Node_basics(100);// tail node
        // At this point nodes are like a b c d e there is no connection between them so
        // to connect them.
        a.next = b; // a->b (a connected to b)
        b.next = c;
        c.next = d;
        d.next = e; // We cannot connect e because is the tail node its default value is null.
        display(a);// pass head to print all the data.
        System.out.println();
        displayR(a); // ***Recurssively Printing**
        System.out.println();
        displayReverse(a);// Printing in reverse order Using recurssion**
        System.out.println();
        System.out.println("Length of the list is " + length(a));
        System.out.println();
        System.out.println("Length of the list recurssively is: " + lengthR(a, 0));
        System.out.println("\n" + a.data); // Way to print node data.
        System.out.println(a.next.data);// Way to print next node data
        System.out.println(a.next.next.data);// like this we can go to any node.
    }
}
