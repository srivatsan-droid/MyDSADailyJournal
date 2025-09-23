package LinkedList;

public class searchingNodeinList {
    public static boolean searchKey(Node head, int key) {
        if(head == null) {
            return false;
        }
        while(head != null) {
            if(head.data == key) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        searchKey(head, 3);
    }
}
