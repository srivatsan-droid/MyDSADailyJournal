package LinkedList;

import java.util.ArrayList;

class Node {
    int data ;
    Node next;
    Node(int x){
        this.data = x;
        this.next = null;
    }
}
public class singlyLinkedListTraversal {
    public static void traversal(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.data);
            if(head != null)
                System.out.print("-> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static ArrayList<Integer> printList(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head;
        while(curr != null) {
            arr.add(curr.data); // adding the current node's data into arraylist.
            curr = curr.next; // moving forward.
        }
        return arr;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        traversal(head);
        System.out.println(printList(head));
    }
}
