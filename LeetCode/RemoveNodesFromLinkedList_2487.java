package LeetCode;

public class RemoveNodesFromLinkedList_2487 {

    public static class ListNode {
        void display(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();

        }

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(14);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(13);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        removeNodes(a);
        a.display(a);
        // ListNode(temp.next.val, temp.next);
    }

    public static ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val < temp.next.val) {
                temp.val = temp.next.val;
                temp.next = temp.next.next;
                temp = head;
            } else
                temp = temp.next;
        }
        return head;
    }

}
