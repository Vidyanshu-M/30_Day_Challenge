import java.io.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public Calculator() {
        System.out.println("I implemented: "+ AdvancedArithmetic.class.getName());
    }
    
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Day_19_Solution1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        AdvancedArithmetic calculator = new Calculator();
        System.out.println(calculator.divisorSum(n));
    }
}
