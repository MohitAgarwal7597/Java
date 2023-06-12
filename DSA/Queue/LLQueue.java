package DSA.Queue;

// Queue implementation using linked list (easist Way to of implementatioin queue)
class LLQueue {
    static class Queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }
        }

        void add(int val) {
            if (head == null) {
                Node n = new Node(val);
                head = tail = n;
                return;
            }
            Node n = new Node(val);
            tail.next = n;
            tail = n;
            size++;
        }

        int remove() {
            if (head == null) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size == 0)
                return true;
            return false;
        }

        /*
         * boolean isFull(); is method ka koi mtlb nhi q ki linked list mai memory limit
         * nhi h toh vo full nhi hogi
         */
        int peek() {
            return head.val;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(3);
        q.add(6);
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        q.display();
    }
}