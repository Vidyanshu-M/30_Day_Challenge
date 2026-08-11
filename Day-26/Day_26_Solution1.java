import java.util.*;

public class Day_26_Solution1 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println(" Library Fine Calculator (Nested Logic) ");

        System.out.println("=========================================\n");
        System.out.println("Enter Actual Return Date (DD MM YYYY): ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.println("Enter Expected Due Date (DD MM YYYY): ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int fine = 0;
        
        if (y1 > y2) {
            fine = 10000;
        } else if (y1 == y2) {
            if (m1 > m2) {
                fine = 500 * (m1 - m2);
            } else if (m1 == m2) {
                if (d1 > d2) {
                    fine = 15 * (d1 - d2);
                }
            }
        }
    
        System.out.println(" Total Fine: " + fine + " Hackos");

    }
    }
}   