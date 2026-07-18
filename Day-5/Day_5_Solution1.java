import java.io.*;

public class Day_5_Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number to print its multiplication table: ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println();
        
        System.out.println("Multiplication Table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        System.out.println("----------------------------------");
        
        bufferedReader.close();
    }
}