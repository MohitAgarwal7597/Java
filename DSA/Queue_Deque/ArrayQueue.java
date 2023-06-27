package DSA.Queue_Deque;

// Queue implementation using array
public class ArrayQueue {

    public static class Queue {
        int[] arr;

        Queue(int length) {
            arr = new int[length];
        }

        private int front = -1;
        private int rear = -1;
        private int size = 0;

        void add(int val) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is Full!");
                return;
            }
            if (size == 0) {
                front = 0;
            }
            rear++;
            arr[rear] = val;
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }

        void display() {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
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

        boolean isFull() {
            if (size == arr.length)
                return true;
            return false;
        }

        int peek() {
            if (size > 0)
                return arr[front];
            else
                System.out.println("Queue is Empty");
            return -1;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(2);
        q.add(8);
        q.add(7);
        System.out.println(q.peek());
        q.add(6);
        q.remove();
        q.remove();
        System.out.println(q.size);
        // q.add(5);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }
}
