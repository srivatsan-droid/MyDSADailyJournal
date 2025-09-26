package Blind75;

import java.util.LinkedList;
import java.util.Queue;

public class identicalTrees {
    static boolean isIdentical(Node r1, Node r2) {
        //If both the trees are empty they are identical
        if(r1 == null && r2 == null) {
            return true;
        }
        //If one tree is empty and the other is not
        if(r1 == null || r2 == null) {
            return false;
        }
        //Queue to store the nodes for level - order traversal
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(r1);
        q2.add(r2);
        //Perform level order traveral for both trees
        while(!q1.isEmpty() && !q2.isEmpty()) {
            Node n1 = q1.poll();
            Node n2 = q2.poll();
            //check if the current nodes are not equal
            if(n1.data != n2.data)
                return false;
            //Check left children
            if(n1.left != null && n2.left != null) {
                q1.add(n1.left);
                q2.add(n2.left);
            }
            else if(n1.left != null || n2.left != null) {
                return false;
            }
            if(n1.right != null && n2.right != null) {
                q1.add(n1.right);
                q2.add(n2.right);
            }
            else if(n1.right != null || n2.right != null) {
                return false;
            }
        }
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void main(String[] args) {
        Node r1 = new Node(1);
        r1.left = new Node(2);
        r1.right = new Node(3);
        r1.left.left = new Node(4);

        // Representation of input binary tree 2
        //        1
        //       / \
        //      2   3
        //     /
        //    4
        Node r2 = new Node(1);
        r2.left = new Node(2);
        r2.right = new Node(3);
        r2.left.left = new Node(4);

        if (isIdentical(r1, r2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
