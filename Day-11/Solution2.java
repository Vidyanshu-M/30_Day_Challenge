//This is the easy way of understanding that Day-11 is about 2D array and how to find the maximum sum of hourglass in a 2D array.
import java.io.*;


public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[6][6];
        System.out.println("Please Enter the 6x6 Grid (6 lines with 6 numbers each):");
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(arrRowItems[j]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                               + arr[i+1][j+1]
                               + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("The maximum hourglass sum is: " + maxSum);
        bufferedReader.close();
    }
}
