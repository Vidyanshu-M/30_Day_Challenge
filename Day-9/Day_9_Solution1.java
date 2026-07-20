import java.io.*;



class Result {
    public static int factorial (int n){
        if (n<=1) {
            return 1;
        } 
            return n * factorial(n - 1);
        
    }
}
public class Day_9_Solution1 {
    public static void main(String[] args) throws IOException {

        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to calculate its factorial:");
        int n = Integer.parseInt(p.readLine());
        int result = Result.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);

        p.close();
    }
}
