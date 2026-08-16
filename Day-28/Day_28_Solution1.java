import java.util.*;
import java.util.regex.*;

public class Day_28_Solution1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" -*-RegEx Database Filter-*- ");
            
            System.out.print("Enter total number of rows: ");
            if (sc.hasNextInt()) {
                int N = sc.nextInt();
                
                List<String> validNames = new ArrayList<>();
                Pattern p = Pattern.compile(".+@gmail\\.com$");
                
                System.out.println("\nEnter " + N + " rows (FirstName EmailID):");
                for (int i = 0; i < N; i++) {
                    System.out.print("> ");
                    String firstName = sc.next();
                    String emailID = sc.next();
                    
                    Matcher m = p.matcher(emailID);
                    if (m.find()) {
                        validNames.add(firstName);
                    }
                }
                
                Collections.sort(validNames);
                
                System.out.println(" Alphabetical List of Gmail Users:");
                for (String name : validNames) {
                    System.out.println(":>"+name);
                }
            }
        }
    }
}