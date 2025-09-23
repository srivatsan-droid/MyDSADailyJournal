package LinkedList;


public class linkedListCycle {
    public static boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move slow by 1
            fast = fast.next.next;     // move fast by 2

            if (slow == fast) {
                return true;           // cycle detected
            }
        }

        return false;                  // no cycle
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);
        boolean ans = hasCycle(head);
        System.out.println(ans);
    }
}
