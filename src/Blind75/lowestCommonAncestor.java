package Blind75;

public class lowestCommonAncestor {
    public static Node lowestCommonAncestor1(Node root, Node p, Node q) {
        if(root == null)
            return null;
        if(p.data < root.data && q.data < root.data) {
            return lowestCommonAncestor1(root.left, p, q);
        }
        if(p.data > root.data && q.data > root.data) {
            return lowestCommonAncestor1(root.right, p, q);
        }
    return root;
    }
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);
        Node ans = lowestCommonAncestor1(root, root.left, root.right);
        System.out.println(ans);


    }
}
