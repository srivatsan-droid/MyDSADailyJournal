package Blind75;

public class validateBinaryTree {
    public static boolean isValidTree(Node root) {
        return validate(root, null, null);
    }
    private static boolean validate(Node node, Integer min, Integer max) {
        if (node == null) return true; // Base case: empty tree is valid
        // Check if node's value violates the min/max constraints
        if ((min != null && node.data <= min) || (max != null && node.data >= max)) {
            return false;
        }
        // Recursively validate left and right subtrees
        return validate(node.left, min, node.data) && validate(node.right, node.data, max);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        boolean ans = isValidTree(root);
        System.out.println(ans);
    }
}
