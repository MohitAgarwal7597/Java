package DSA.BST;

public class implementation {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(25);
        Node a = new Node(20);
        Node b = new Node(30);
        root.right = b;
        root.left = a;
    }
}
