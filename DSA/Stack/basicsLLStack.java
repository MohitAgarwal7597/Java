package DSA.Stack;

/*
 * Array Stack Advantages
 * Ulimited Size
 * 
 */
/*
 * Array Stack Disadvantages
 * Use Extra Memory Than Array
 * Takes Space Complexity O(n) of call Stack to print elements of Stack.
 */
public class basicsLLStack {
    public static class Node {
        private int val;
        private Node next;

        Node(int x) {
            val = x;
        }
    }

    public static class Stack {
        Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        void display() {
            Node temp = head;
            helper(temp);
            System.out.println();
        }

        void helper(Node head) {
            if (head == null)
                return;
            helper(head.next);
            System.out.print(head.val + " ");
        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int peek() {
            return head.val;
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (head == null)
                return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(3);
        st.push(8);
        System.out.println(st.peek());
        st.display();
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.display();
        st.push(8);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
