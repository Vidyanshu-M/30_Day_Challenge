import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day_7_Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array:");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("Enter " + n + " space-separated integers:");
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        System.out.println("Reversed output:");
        // Loop starting from the last index down to 0
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
        
        System.out.println(); // Moves to a new line after printing the reversed array
        bufferedReader.close();
    }
}