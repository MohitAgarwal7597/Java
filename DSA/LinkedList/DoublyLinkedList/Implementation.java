package DSA.LinkedList.DoublyLinkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;
        Node last;

        Node(int data) {
            this.data = data;
        }
    }

    public static class DoublyLinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;
                temp.last = tail;
            }
            tail = temp;

        }

        void display() {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;

            }
        }

    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.insertAtEnd(5);
        d.insertAtEnd(2);
        d.display();
    }
}
