package Blind75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        if(root == null) {
            return new ArrayList<>();
        }
        Queue<Node> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        queue.offer(root);
        int currLevel = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            result.add(new ArrayList<>());

            for(int i = 0;i < len;i++) {
                Node node = queue.poll();
                result.get(currLevel).add(node.data);
                //Enqueue left child
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
                currLevel++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);

        // Perform level order traversal and get the result
        ArrayList<ArrayList<Integer>> res = levelOrder(root);

        // Print the result in the required format
        for (List<Integer> level : res) {
            System.out.print("[");
            for (int i = 0; i < level.size(); i++) {
                System.out.print(level.get(i));
                if (i < level.size() - 1) System.out.print(", ");
            }
            System.out.print("] ");
        }
    }
}
