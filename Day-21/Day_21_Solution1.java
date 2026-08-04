import java.util.*;

class Printer <T> {
    public void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
public class Day_21_Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Integer array: ");
        int n = sc.nextInt();
        Integer[] intArray = new Integer[n];

        System.out.println("Enter the elements of Integer array: ");
        for(int i = 0 ;i < n; i++){
            intArray[i] = sc.nextInt();
        }
        System.out.println("Enter the size of String array: ");
        n = sc.nextInt();
        String[] stringArray = new String[n];

        System.out.println("Enter the elements of String array: ");
        for(int i = 0; i < n; i++){
            stringArray[i] =sc.next();
        }

        System.out.println("Integer Array output");
        Printer<Integer> intPrinter = new Printer<>();
        intPrinter.printArray(intArray);

        System.out.println("String Array output");
        Printer<String> strnPrinter = new Printer<>();
        strnPrinter.printArray(stringArray);

        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");

        sc.close();
    }
}
}