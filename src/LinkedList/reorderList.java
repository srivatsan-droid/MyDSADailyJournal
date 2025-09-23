package LinkedList;

public class reorderList {
    public static void reorderList(Node head) {
        if(head == null || head.next == null)
            return;
        //Find the middle Node of the list
        Node slow = head,fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //Step 2 : Reverse the second half of the list
        Node prev = null , curr = slow.next;
        slow.next = null;
        while(curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        //Step 3 : Merge the two halves
        Node first = head, second = prev;
        while(second != null) {
            Node temp1 = first.next,temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next = new Node(4);
        reorderList(head);
    }
}
