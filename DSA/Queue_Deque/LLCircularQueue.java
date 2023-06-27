package DSA.Queue_Deque;

public class LLCircularQueue {
    // Only Difference in this and LLCircularQueue is tail.next == head. thats it.
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
                tail.next = head;
                return;
            }
            Node n = new Node(val);
            tail.next = n;
            tail = n;
            tail.next = head;// circular
            size++;
        }

        int remove() {
            if (head == null) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            tail.next = head;// tail.next need to update othewise it will be pointing to deleted head node.
            size--;
            return x;
        }

        void display() {
            Node temp = head;
            while (temp.next != head) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.print(temp.val);
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
        int peek() throws Exception {
            if (head == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            // if (head == null) {
            // throw new Exception("Queue is Empty!");
            // }
            return head.val;
        }

    }

    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        System.out.println(q.peek());
        q.add(5);
        q.add(3);
        q.add(6);
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        q.display();
    }
}
