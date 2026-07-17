import java.util.Scanner;

public class Day_2_Solution1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double meal_cost;
        int tip_percent;
        int tax_percent;

        System.out.print("Enter the meal cost: ");
        meal_cost = scan.nextDouble();
        System.out.print("Enter the tip percentage: ");
        tip_percent = scan.nextInt();
        System.out.print("Enter the tax percentage: ");
        tax_percent = scan.nextInt();
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double total_cost = meal_cost + tip + tax;
        long rounded_total_cost = Math.round(total_cost);
        System.out.println("The total meal cost is " + rounded_total_cost + " dollars.");
        scan.close();
    }
}