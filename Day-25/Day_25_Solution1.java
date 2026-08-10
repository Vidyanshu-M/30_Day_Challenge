import java.util.Scanner;

public class Day_25_Solution1 {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Prime Number Checker ");
            System.out.print("Enter a number: ");
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (isPrime(n)) {
                    System.out.println(n + " is a prime number.");
                } else {
                    System.out.println(n + " is not a prime number.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }
}