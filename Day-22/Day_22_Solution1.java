import java.util.Scanner;

public class Day_22_Solution1 {

    public static class NodeDay22 {
        NodeDay22 left, right;
        int data;
        NodeDay22(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int getHeight(NodeDay22 root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static NodeDay22 insert(NodeDay22 root, int data) {
        if (root == null) {
            return new NodeDay22(data);
        } else {
            NodeDay22 cur;
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
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println(" Binary Search Tree Height Calculator ");

            
            System.out.print("Enter the total number of nodes you want to add: ");
            int T = sc.nextInt();
            NodeDay22 root = null;
            
            System.out.println("\nEnter " + T + " numbers (space separated): ");
            System.out.print("> ");
            while (T-- > 0) {
                int data = sc.nextInt();
                root = insert(root, data);
            }
            
            System.out.println("⏳ Calculating Tree Height...");
            
            int height = getHeight(root);
            
            System.out.println("✅ Result: The Maximum Height of the BST is: " + height);
        }
    }
}