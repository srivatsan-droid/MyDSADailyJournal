package Blind75;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false; // Base case: If root is null, no subtree can exist
        }
        // Check if current node matches OR recurse left/right
        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isSameTree(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true; // Both trees are empty
        }
        if (root == null || subRoot == null) {
            return false; // One tree is empty, the other is not
        }
        if (root.data != subRoot.data) {
            return false; // Node values don't match
        }
        // Recursively check left and right subtrees
        return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);

        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        SubtreeOfAnotherTree obj = new SubtreeOfAnotherTree();
        boolean ans = obj.isSubtree(root, subRoot);
        System.out.println(ans); // Output: true
    }
}