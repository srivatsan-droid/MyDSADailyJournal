package LinkedList;

public class insertAtEndofList {
    public static Node insertAtEnd(Node head,int x){
        if(head==null){
            return new Node(x);
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=new Node(x);
            return head;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
