package Blind75;

public class invertTheBinaryTree {
    public static Node invertTree(Node root) {
        Node curr = root;
        if(curr == null) {
            return null;
        }
        Node temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;
        Node lChild = invertTree(root.left);
        Node rChild  = invertTree(root.right);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        Node ans = invertTree(root);
        System.out.println(ans);
    }
}
