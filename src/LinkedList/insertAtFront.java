package LinkedList;

public class insertAtFront {
    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }
    static void printList(Node node) {
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        int x = 5;
        head = insertBegin(head,x); // Inserting at front of the linked list.
        printList(head);
    }
}
