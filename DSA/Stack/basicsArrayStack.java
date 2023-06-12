package DSA.Stack;

/*
 * Array Stack Advantages
 * It takes less space(1 block) than linked list(Node | 2x space)
 * If Size is know than array can be used else linked list for unknown size.
 * 
 */
/*
 * Array Stack Disadvantages
 * It has limited size.
 * Better to use only when size is known or estimated
 * 
 */
public class basicsArrayStack {
    public static class Stack {
        private int[] arr = new int[5];
        private int size = 0;
        private int index = -1;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is Full!");
                return;
            }
            ++index;
            ++size;
            arr[index] = x;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[index];
            index--;
            size--;
            return top;
        }

        void display() {
            for (int i = 0; i <= index; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        int peek() {
            return arr[index];
        }

        boolean isEmpty() {
            if (index == -1)
                return true;
            return false;
        }

        boolean isFull() {
            if (index == arr.length - 1)
                return true;
            return false;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.push(9);
        st.push(5);
        st.push(9);
        st.display();
        System.out.println(st.isFull());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
        System.out.println(st.pop());

    }
}
