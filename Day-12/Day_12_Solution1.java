import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber); 
    }
}

class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        int average = sum / testScores.length;

        System.out.println("=> Debug: Total Average calculated is: " + average);

        if (average >= 90 && average <= 100) return 'O';
        if (average >= 80 && average < 90) return 'E';
        if (average >= 70 && average < 80) return 'A';
        if (average >= 55 && average < 70) return 'P';
        if (average >= 40 && average < 55) return 'D';
        return 'T';
    }
}

public class Day_12_Solution1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter First Name, Last Name, and ID (separated by space):");
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        
        System.out.println("Enter the total number of subjects:");
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        
        System.out.println("Enter the test scores out of 100 (separated by space):");
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}