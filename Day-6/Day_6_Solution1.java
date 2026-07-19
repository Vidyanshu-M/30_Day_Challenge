import java.io.*;
import java.util.*;
public class Day_6_Solution1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of test cases: ");
        int T = Integer.parseInt(br.readLine());


        for(int i = 0; i < T; i++){
            System.out.println("Enter String" + (i+1) + ":");
        
            String s = br.readLine().trim();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for( int j = 0; j < s.length(); j += 2){
                even.append(s.charAt(j));
            }
            for( int j = 1; j< s.length(); j +=2){
                odd.append(s.charAt(j));
            }
        System.out.println(even.toString() + " " + odd.toString());
        }
    }
}