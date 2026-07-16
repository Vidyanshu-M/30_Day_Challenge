import java.util.Scanner;

public class Day_1_Solution1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        int i2;
        double d2;
        String s2;



        System.out.print("Enter an integer: ");
        i2 = scan.nextInt();
        System.out.print("Enter a double: ");
        d2 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter a string: ");
        s2 = scan.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);

        scan.close();
    }
}