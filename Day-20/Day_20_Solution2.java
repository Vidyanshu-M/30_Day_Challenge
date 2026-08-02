import java.util.*;

public class Day_20_Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int numSwaps = 0;

        for (int i = 0; i < n; i++) {
            
            int numberOfSwapsInThisPass = 0;
            
            for (int j = 0; j < n - 1; j++) {
                
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    numberOfSwapsInThisPass++;
                    numSwaps++;
                }
            }
            
            if (numberOfSwapsInThisPass == 0) {
                break; 
            }
        }
        
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
        
        in.close();
    }
}