import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day_11_Solution1 { 
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();

        System.out.println("======================================================");
        System.out.println("Enter 6x6 Grid...");
        System.out.println("Total 6 lines to be entered.");
        System.out.println("======================================================\n");

        IntStream.range(0, 6).forEach(i -> {
            try {
                System.out.print("Line " + (i + 1) + " Enter 6 number (Press Enter): ");
                
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .filter(str -> !str.isEmpty())
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

 
        System.out.println("\nCalculating...");

        int maxSum = Integer.MIN_VALUE; 

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int currentSum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                               + arr.get(i+1).get(j+1)
                               + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("======================================================");
        System.out.println("=> Maximum Hourglass Sum : " + maxSum);
        System.out.println("======================================================");
        
        bufferedReader.close();
    }
}