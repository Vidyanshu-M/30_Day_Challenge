import java.io.*;
import java.util.*;

public class Day_8_Solution1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Long> phoneBook = new HashMap<>();

        System.out.println("Enter the number of entries in the phone book:");
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n; i++){

            System.out.println("Enter name and phone number for entry " + (i + 1) + ":");
            System.out.println("Format: <name> <phone_number>");
            String line = br.readLine();

            String[] parts = line.split(" ");
            String name = parts[0];
            Long phoneNumber = Long.parseLong(parts[1]);
            phoneBook.put(name, phoneNumber);
        }
        System.out.println("Enter names to search for in the phone book:");
        String queryName;

        while ((queryName = br.readLine()) != null ) {
            if (phoneBook.containsKey(queryName)) {
                System.out.println(queryName + "=" + phoneBook.get(queryName));
            } else {
                System.out.println("Not found");
            }
        }
    }
    
}