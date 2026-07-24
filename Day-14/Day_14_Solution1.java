
import java.io.*;

class Difference {
    int[] elements;
    int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = 0;
    }

    void computeDifference() {
        int min = elements[0];
        int max = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] < min ) min = elements[i];
            if(elements[i] > max ) max = elements[i];
        }
        maximumDifference = max - min ;
    }
}

public class Day_14_Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array: ");
        int n = Integer.parseInt(t.readLine());
        System.out.println("Enter the Number(with space) inside the Array:  ");

        String[] stringNumbers = t.readLine().split(" ");

        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = Integer.parseInt(stringNumbers[i]);
        }
        Difference diff = new Difference(elements);
        diff.computeDifference();
        System.out.println("Maximum Difference(Gap) is :" + diff.maximumDifference);
        
    }
}
