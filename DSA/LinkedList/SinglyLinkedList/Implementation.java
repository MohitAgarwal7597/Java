package DSA.LinkedList.SinglyLinkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void deleteAt(int index) {

            if (index < 0 || index >= size) {
                System.out.println("Wrong Index");
                return;
            }
            if (index == 0) {
                head = head.next;
                size--;
            } else {
                Node pointer = head;
                if (index == size - 1) {
                    for (int i = 0; i < index - 1; i++) {
                        pointer = pointer.next;
                    }
                    pointer.next = null;
                    tail = pointer;
                    size--;
                    return;
                }
                for (int i = 1; i < index; i++) {
                    pointer = pointer.next;
                }
                pointer.next = pointer.next.next;
                size--;
            }
        }

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAt(int index, int data) {
            if (index < 0 || index > size()) {
                System.out.println("Wrong Index");
                return;
            } else if (index == size()) {
                insertAtEnd(data);
                return;
            } else if (index == 0) {
                insertAtHead(data);
                return;
            } else {
                Node temp = new Node(data);
                Node pointer = head;
                for (int i = 0; i < index - 1; i++) {
                    pointer = pointer.next;
                }
                temp.next = pointer.next;
                pointer.next = temp;
                size++;
            }
        }

        void insertAtHead(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
            }
            head = temp;
            size++;
        }

        int getAt(int index) {
            if (index < 0 || index > size()) {
                System.out.println("Wrong Index");
                return -1;
            } else {
                Node pointer = head;
                for (int i = 0; i < index; i++) {
                    pointer = pointer.next;
                }
                return pointer.data;
            }
        }

        void display() {
            Node display = head;
            while (display != null) {
                System.out.print(display.data + " ");
                display = display.next;
            }
        }

        int size() {
            return size;
        }

    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insertAtEnd(1);
        l.insertAtEnd(2);
        l.insertAtEnd(3);
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.display();
        System.out.println();
        // l.deleteAt(4);
        l.deleteAt(1);
        l.display();
        System.out.println("Size is " + l.size);
        System.out.println(l.head.data);
        System.out.println(l.tail.data);
    }
}
