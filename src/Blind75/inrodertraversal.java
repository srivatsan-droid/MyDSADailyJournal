package Blind75;

import java.util.ArrayList;

class Node {
    int data;
    Node left, right = null;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
public class inrodertraversal {
    public static void printInorder(Node node){
        if(node == null) {
            return;
        }
        printInorder(node.left);
        System.out.println(node.data + " ");
        printInorder(node.right);
    }
    public static ArrayList<Integer> inOrder(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(node,result);
        return result;
    }
    private static void helper(Node node, ArrayList<Integer> ans) {
        if(node == null) {
            return;
        }
        helper(node.left,ans);
        ans.add(node.data);
        helper(node.right,ans);
    }
    public static ArrayList<Integer> preOrder(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        helper1(node,result);
        return result;
    }
    private static void helper1(Node node, ArrayList<Integer> ans) {
        if(node == null) {
            return;
        }
        ans.add(node.data);
        helper(node.left,ans);
        helper(node.right,ans);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

//        printInorder(root);
        ArrayList<Integer> ans = inOrder(root);
        System.out.println(ans);
        ArrayList<Integer> ans1 = preOrder(root);
        System.out.println(ans1);
    }
}
