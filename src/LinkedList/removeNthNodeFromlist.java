package LinkedList;

public class removeNthNodeFromlist {
    public static  Node  remove(Node head, int n) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int pos = length - n + 1; // Calculate the position of the node to be removed from the end.
        if (pos == 1) {
            return head.next; // If it's the first node, update the head and return.
        }
        int count = 1;
        temp = head;
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next; // Remove the nth node by updating pointers.
        return head; // Return the updated head.
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int n = 2; // Change this value to test different cases.
        head = remove(head, n); // Call the function to remove the nth node.
        while (head != null) {
            System.out.print(head.data + " "); // Print the modified linked list.
            head = head.next;
        }
    }
}
