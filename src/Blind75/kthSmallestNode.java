package Blind75;

import java.util.Stack;

public class kthSmallestNode {
    public static int kthSmallest(Node root, int k) {
        Stack<Node> st = new Stack<>();
        Node current = root;
        int cnt = 0;

        // Iterative In-order Traversal
        while (!st.isEmpty() || current != null) {
            // Step 1: Push all left nodes
            while (current != null) {
                st.push(current);
                current = current.left;
            }

            // Step 2: Pop the top node
            current = st.pop();
            cnt++;

            // Step 3: Check if it's the kth node
            if (cnt == k) {
                return current.data; // Return kth smallest element
            }

            // Step 4: Move to the right subtree
            current = current.right;
        }

        // If k is invalid (greater than total nodes)
        return -1;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.left = new Node(0);
        root.left.right = new Node(2);

        int k = 1;
        System.out.println(kthSmallest(root,k));
    }
}
