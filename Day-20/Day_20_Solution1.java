import java.io.*;

public class Day_20_Solution1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Size of the Array: ");
        int n = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];
        System.out.println("Enter the elements of the array(Eg:- x x x x....): ");
        String[] input = br.readLine().trim().split(" ");
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(input[i]);
        }
        System.out.println("First Element when array is not sorted: " + a[0]);

        int numSwaps = 0;
        for(int i = 0; i < n; i++){
            int numberOfSwapsInThisPass = 0;
            for(int j = 0; j < n - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwapsInThisPass++;
                    numSwaps++;
                }
            }
            if(numberOfSwapsInThisPass == 0){
                break;
            }
        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element when array is sorted: " + a[0]);
        System.out.println("Last Element when array is sorted: " + a[n - 1]);
        
        
    }    
}
