import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_16_Solution1 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String to convert in number(to check the try catch)");
        String s = br.readLine();
        System.out.println(s.getClass().getSimpleName());

        try {
            int number = Integer.parseInt(s);
            System.out.println("Here is the converted String into Number :"+number);
            System.out.println("Type of Entered value"+((Object)number).getClass().getSimpleName());
        } 
        catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}