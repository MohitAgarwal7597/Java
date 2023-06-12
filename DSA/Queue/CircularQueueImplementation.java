package DSA.Queue;

public class CircularQueueImplementation {
    // Circular Queue using array
    public static class Queue {
        private int[] arr;

        Queue(int length) {
            arr = new int[length];
        }

        private int front = -1;
        private int size = 0;
        private int rear = -1;

        void add(int val) {
            if (size == 0) {
                front = rear = 0;
                arr[rear] = val;
            } else if (size < arr.length && rear == arr.length - 1) {
                rear = 0;
                arr[rear] = val;
            } else if (size < arr.length) {
                rear++;
                arr[rear] = val;
            } else {
                System.out.println("Queue is Full!");
                size--;
            }
            size++;
        }

        int remove() {
            int x = -1;
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return x;
            } else {
                if (front == arr.length - 1 && size > 1) {
                    x = arr[front];
                    front = -1;
                } else {
                    x = arr[front];
                }
            }
            front++;
            size--;
            return x;
        }

        void display() {
            int temp = size;
            int count = 0;
            for (int i = front; i <= temp; i++) {
                if (count == temp)
                    break;
                System.out.print(arr[i] + " ");
                if (i == arr.length - 1) {
                    i = -1;
                }
                count++;
            }
            System.out.println();
        }

        int peek() {
            return arr[front];
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }

        boolean isFull() {
            if (size == arr.length) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(4);
        q.add(5);
        q.add(10);
        q.add(9);
        q.add(3);
        q.remove();
        q.add(-1);
        q.display();
        System.out.println(q.isEmpty());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.isFull());
        // q.isEmpty();
    }

}
