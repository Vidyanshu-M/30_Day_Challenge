import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int d){
        data = d;
        next = null;
    }
}
public class Day_15_Solution1 {
    
    static Node insert(Node head, int data){
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }else {
            Node current = head ;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
            return head;
        }
    }
    static void display(Node head){
        Node start = head ;
        while(start != null){
            System.out.println(start.data + " "); 
            start = start.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        System.out.println("How many elements to be insert");
        try (Scanner p = new Scanner(System.in)) {
            int T = p.nextInt();

            System.out.println("Enter "+T+" Numbers");
            while(T-- > 0){
                int ele = p.nextInt();
                head = insert(head, ele);
            }
            System.out.println("Yout linkedList");
            display(head);
        }
    }
}
