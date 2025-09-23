package LinkedList;

public class reverseInLL {
    public static Node reverse(Node head) {
        Node curr=head;
        Node prev=null;
        while(curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr=temp;
        }
        return prev;
    }
    public static void printList(Node head) {
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head.next.next.next.next= new Node(50);
        reverse(head);
        printList(head);
    }
}
