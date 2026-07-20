import java.io.*;


public class Day_10_Solution1{
    public static void main(String[] args) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("===============================================");
        System.out.println("         Consecutive Numbers Finder            ");
        System.out.println("===============================================");
        System.out.println("Enter a base-10 number:");

        int n = Integer.parseInt(p.readLine().trim());


        int maxOnes = 0;
        int currentOnes = 0;

        while (n > 0) {
            int remainder = n %2;
            if (remainder ==1){
                currentOnes++;
                if (currentOnes > maxOnes){
                    maxOnes = currentOnes;
                }
            } else {
                currentOnes = 0;
            }
            n = n/2 ;
        }
        System.out.println("===============================================");
        System.out.println("Maximum number of consecutive 1's in the binary representation: " + maxOnes);
        System.out.println("===============================================");
        p.close();
    }   
}