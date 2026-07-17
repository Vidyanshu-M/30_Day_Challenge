import java.io.*;

public class Day_3_Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        br.close();
        
        if (N % 2 != 0){
            System.out.println("Weird");
        }else {if (N >= 2 && N <= 5){
            System.out.println("Not Weird");
        }else if (N >= 6 && N <= 20){
            System.out.println("Weird");
        }else if (N > 20){
            System.out.println("Not Weird");
        }
        }
    }
}
