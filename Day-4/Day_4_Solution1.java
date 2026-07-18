import java.util.*;

public class Day_4_Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of test cases (T): ");
        int T = sc.nextInt();
        System.out.println();
        
        for (int i = 0; i < T; i++) {
            System.out.print("Enter age for Person " + (i + 1) + ": ");
            int age = sc.nextInt();
            
            System.out.println("--- Output for Person " + (i + 1) + " ---");
            Person p = new Person(age);
            
            System.out.print("Initial Age Check: ");
            p.amIOld();
            
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            
            System.out.print("After 3 Years Pass: ");
            p.amIOld();
            
            System.out.println("----------------------------\n");
        }
        sc.close();
    }
}

class Person {
    private int age;    
  
    public Person(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }
}