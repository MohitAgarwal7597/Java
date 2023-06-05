package DSA.LinkedList.DoublyLinkedList;
//Problem: LeetCode 430: Flatten a Multilevel Doubly LinkedList;

// *********Problem Statement*********
// You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional child pointer. This child pointer may or may not point to a separate doubly linked list, also containing these special nodes. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure as shown in the example below.

// Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list. Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.

// Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null
public class FlattenList {
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        Node(int val) {
            this.val = val;
        }
    };

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void displayrev(Node head) {
        if (head.next == null) {
            System.out.println();
            System.out.print(head.val + " ");
            return;
        }
        displayrev(head.next);
        System.out.print(head.val + " ");
    }

    public static void displayTail(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        a.next = b;
        b.prev = a;
        Node c = new Node(3);
        b.next = c;
        c.prev = b;
        Node d = new Node(4);
        c.next = d;
        d.prev = c;
        Node e = new Node(5);
        d.next = e;
        e.prev = d;
        Node f = new Node(6);
        e.next = f;
        f.prev = e;

        Node g = new Node(7);
        c.child = g;
        Node h = new Node(8);
        g.next = h;
        h.prev = g;
        Node i = new Node(9);
        h.next = i;
        i.prev = h;
        Node j = new Node(10);
        i.next = j;
        j.prev = i;

        Node k = new Node(11);
        h.child = k;
        Node l = new Node(12);
        k.next = l;
        l.prev = k;
        flatten(a);
        // System.out.println(l.val);
        display(a);
        displayTail(f);
        // display(a);
        // display(h.child);
    }

    public static Node flatten(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.child != null) {
                Node childTail = temp.child;
                while (childTail.next != null) {
                    childTail = childTail.next;
                }
                childTail.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = childTail;
                }
                temp.next = temp.child;
                temp.child.prev = temp;
                temp.child = null;
            }
            temp = temp.next;
        }
        return head;
    }
}
