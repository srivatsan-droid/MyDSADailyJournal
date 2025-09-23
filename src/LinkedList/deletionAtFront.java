package LinkedList;

public class deletionAtFront {
    static Node deleteFirst(Node head) {
        Node curr = head;
        if(curr != null && curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        deleteFirst(head);
        System.out.println("Linked list after deleting first node: ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
