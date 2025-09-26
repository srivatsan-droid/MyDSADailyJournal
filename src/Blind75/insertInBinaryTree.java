package Blind75;

import java.util.LinkedList;
import java.util.Queue;

public class insertInBinaryTree {
    public static Node insertNode(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        Queue<Node>  q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            //Front Element in the Queue
            Node curr = q.poll();
            if(curr.left != null)
                q.add(curr.left);
            else{
                curr.left = new Node(data);
                return root;
            }
            if(curr.right != null) {
                    q.add(curr.right);
            }
            else {
                    curr.right = new Node(data);
                    return root;
            }
        }
        return root;
    }
    //Inorder traversal of the binary tree
    public static void inOrder(Node curr) {
        if(curr == null) {
            return;
        }
        inOrder(curr.left);
        System.out.println(curr.data + " ");
        inOrder(curr.right);
    }
    public static void main(String[] args) {
        // Constructing the binary tree
        //          10
        //        /    \
        //       11     9
        //      /      / \
        //     7      15   8
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        int key = 12;
        root = insertNode(root, key);

        // After insertion 12 in binary tree
        //          10
        //        /    \
        //       11     9
        //      /  \   / \
        //     7   12 15  8
        inOrder(root);
    }
}
