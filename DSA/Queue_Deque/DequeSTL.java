package DSA.Queue_Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeSTL {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        Deque<Integer> dq1 = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        dq.addFirst(5);
        dq1.addFirst(6);
        dq1.addFirst(9);
        dq.addAll(dq1);
        System.out.println(dq);

    }
}
