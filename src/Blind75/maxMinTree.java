package Blind75;

public class maxMinTree {
    Node root;
    public static int findMax(Node node) {
        if(node == null) {
            return Integer.MIN_VALUE;
        }
        int res = node.data;
        int leftNode = findMax(node.left);
        int rightnode = findMax(node.right);
        if(leftNode > res) {
            res = leftNode;
        }
        if(rightnode > res) {
            res = rightnode;
        }
        return res;
    }
    public static int findMin(Node root) {

        // code here
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        int res = root.data;
        int lres = findMin(root.left);
        int rres = findMin(root.right);
        if(lres < res) {
            res = lres;
        }
        if(rres < res) {
            res = rres;
        }
        return res;
    }
    public static void main(String[] args) {
        maxMinTree tree = new maxMinTree();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        System.out.println("Maximum element is "
                + tree.findMax(tree.root));
        System.out.println("Minimum element is "
                + tree.findMin(tree.root));
    }
}
