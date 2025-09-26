package Blind75;

public class searchInBinaryTree {
    public static boolean isValid(Node root, int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        boolean res1 = isValid(root.left,key);
        if(res1)
            return true;
        boolean res2 = isValid(root.right,key);
            return res2;
    }
    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.left.left = new Node(3);
        root.left.left.left = new Node(7);
        root.left.right = new Node(4);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right = new Node(2);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        int key = 14;

        if (isValid(root, key))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
