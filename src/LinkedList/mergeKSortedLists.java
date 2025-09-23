package LinkedList;

import static SortingAlgos.mergeSort.merge;

public class mergeKSortedLists {
    public Node mergeKLists(Node[] lists) {
        if(lists.length == 0){
            return null;
        }
        Node merged = null;
        for(Node l : lists){
            merged = merge(merged,l);
        }
        return merged;
    }

    private Node merge(Node slow, Node fast) {
        if(slow == null || fast == null){
            return (slow!=null)?slow:fast;
        }
        if(slow.data < fast.data){
            slow.next = merge(slow.next,fast);
            return slow;
        }else{
            fast.next = merge(slow,fast.next);
            return fast;
        }
    }
    public void printList(Node head){
        System.out.println("Linked List:");
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args){
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        n1.next = n2;
        n2.next = n3;
        Node ans = new mergeKSortedLists().mergeKLists(new Node[]{n1,n2});
        new mergeKSortedLists().printList(ans);
    }
}
