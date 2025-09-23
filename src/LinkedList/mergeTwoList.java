package LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class mergeTwoList {
    public static Node mergeTwoLists(Node list1, Node list2) {
        ArrayList<Integer> merge = new ArrayList<>();
        Node ans,curr1 = list1,curr2 = list2;
        while(curr1 != null) {
            merge.add(curr1.data);
            curr1 = curr1.next;
        }
        while(curr2 != null) {
            merge.add(curr2.data);
            curr2 = curr2.next;
        }
        Collections.sort(merge);
        Node dummy = new Node(-1);
        Node curr = dummy;
        for(int i = 0;i < merge.size();i++) {
            curr.next = new Node(merge.get(i));
            curr = curr.next;
        }
        return curr;
    }
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        Node ans = mergeTwoLists(list1,list2);
        System.out.println(ans);
    }
}
