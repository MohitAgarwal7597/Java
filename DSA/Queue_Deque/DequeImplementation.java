package DSA.Queue_Deque;

public class DequeImplementation {
    // Deque -> Doubly Ended Queue
    // Insertion/Deletion can be done from both the ends of queue.
    // Implementing using LinkedList.
    static class Deque {
        Node head = null;
        Node tail = null;
        int size = 0;

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        void add(int value) {
            if (head == null) {
                Node n = new Node(value);
                head = tail = n;
            } else {
                Node n = new Node(value);
                tail.next = n;
                tail = n;
            }
            size++;
        }

        void addLast(int value) {
            if (head == null) {
                Node n = new Node(value);
                head = tail = n;
            } else {
                Node n = new Node(value);
                tail.next = n;
                tail = n;
            }
            size++;
        }

        void addFirst(int value) {
            if (head == null) {
                Node n = new Node(value);
                head = tail = n;
            } else {
                Node n = new Node(value);
                n.next = head;
                head = n;
            }
            size++;
        }

        int peek() {
            if (size != 0)
                return head.value;
            System.out.println("Deque Is Empty!");
            return -1;
        }

        int remove() {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            int x = tail.value;
            tail = temp;
            size--;
            return x;
        }

        int removeFirst() {
            int x = head.value;
            head = head.next;
            size--;
            return x;
        }

        int removeLast() {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            int x = tail.value;
            tail = temp;
            tail.next = null;
            size--;
            return x;
        }

        boolean isEmpty() {
            if (size == 0)
                return true;
            return false;
        }

        int size() {
            return size;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.add(5);
        dq.add(5);
        dq.addFirst(4);
        dq.add(5);
        dq.add(5);
        dq.addLast(6);
        dq.add(5);
        dq.removeFirst();
        dq.removeLast();
        dq.display();
        System.out.println(dq.size());
    }
}
