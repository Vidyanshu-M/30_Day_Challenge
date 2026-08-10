import java.util.Scanner;

public class Day_24_Solution1 {

    public static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;
        }
        return head;
    }
    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Linked List: Remove Duplicates ");
            System.out.print("Enter total number of nodes: ");
            if (sc.hasNextInt()) {
                int T = sc.nextInt();
                Node head = null;
                System.out.println("\nEnter " + T + " numbers in sorted order: ");
                System.out.print("> ");
                while (T-- > 0) {
                    int data = sc.nextInt();
                    head = insert(head, data);
                }
                System.out.println(" Removing Duplicates (Garbage Collector Activated)...");
                head = removeDuplicates(head);
                display(head);
            }
        }
    }
}