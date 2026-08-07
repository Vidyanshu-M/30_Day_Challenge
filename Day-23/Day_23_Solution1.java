import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day_23_Solution1 {

    static class NodeDay23 {
        NodeDay23 left, right;
        int data;
        NodeDay23(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static void levelOrder(NodeDay23 root) {
        if (root == null) return;
        
        Queue<NodeDay23> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            NodeDay23 current = queue.poll();
            
            System.out.print(current.data + " ");
            
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    static NodeDay23 insert(NodeDay23 root, int data) {
        if (root == null) {
            return new NodeDay23(data);
        } else {
            NodeDay23 cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data); 
                root.right = cur; 
            }
            return root;
        }
    }

    public static void main(String args[]) {
        // 2. Try-with-resources lagaya taaki Scanner ki warning na aaye
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" BST Level-Order (BFS) Traversal ");
            
            System.out.print("Enter total number of nodes: ");
            if (sc.hasNextInt()) {
                int T = sc.nextInt();
                NodeDay23 root = null;
                
                System.out.println("\nEnter " + T + " numbers (space separated): ");
                System.out.print("> ");
                while (T-- > 0) {
                    int data = sc.nextInt();
                    root = insert(root, data);
                }
                
                System.out.println("⏳ Calculating Traversal (Level by Level)...");
                System.out.print("✅ Result: ");
                
                levelOrder(root);
            }
        }
    }
}