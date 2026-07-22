import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    void display() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Day_13_Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Book Title:");
        String title = scanner.nextLine();
        System.out.println("Enter the Book Author:");
        String author = scanner.nextLine();
        System.out.println("Enter the Book Price:");
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        
        book.display();
    }
}