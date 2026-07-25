# 30_Day_Challenge
A code repo for 30 day code challenge from #hackerRank to improve coding skills 
Day-1 => Data types and output from user and input writing (Day-1 = Day_1 +Day_2 )
Day-2 => Operators 
Day-3 => Intro to Conditional Statements
Day-4 => Class vs Objects (oops concepts are starting from here)
Day-5 => Loops (For , While , Do-While , Unlabeled Break)

## Day 6: Let's Review (Strings and Loops)

### Problem Description
Given a string, separate it into two new strings based on the even and odd index positions of its characters. The output must print the even-indexed characters, followed by a space, and then the odd-indexed characters on a single line.

### Concepts Explored
*   **String Manipulation:** Extracting specific characters from a string using zero-based indexing.
*   **Custom Loop Steps:** Traversing arrays and strings using customized step increments (`j += 2`) instead of standard sequential loops.
*   **I/O Optimization:** Transitioned from `Scanner` to `BufferedReader` for significantly faster and more efficient input processing.
*   **Memory Efficiency:** Implemented `StringBuilder` to construct strings dynamically, avoiding the memory overhead of basic string concatenation.
*   **Exception Handling:** Managing input/output streams properly using `throws IOException`.

### File Structure
*   `Solution.java`: Contains the complete, optimized Java code for the HackerRank submission.

### How to Run
Compile and run the Java file from the terminal:
```bash
javac Solution.java
java Solution


## Day 7: Arrays

### Problem Description
Given an array of `N` integers, print the array's elements in reverse order as a single line of space-separated numbers. The input is provided as a single string of space-separated values.

### Concepts Explored
*   **Reverse Iteration:** Traversing a data structure backward by initializing the loop counter at `size - 1` and decrementing down to `0`.
*   **Java Stream API:** Utilizing modern Java features to process data pipelines.
    *   `Stream.of()` to initiate the data stream.
    *   `.replaceAll("\\s+$", "")` to sanitize input by removing trailing spaces.
    *   `.map(Integer::parseInt)` to transform string tokens into mathematical integers.
    *   `.collect(toList())` to package the processed data into a dynamic Collection.
*   **Collections vs. Primitive Arrays:** Working with `List<Integer>` and utilizing dynamic methods like `.size()` and `.get()` instead of standard primitive array brackets `[]`.

### File Structure
*   `Solution.java`: Contains the Java code utilizing the Stream API and `List` traversal for the HackerRank submission.

### How to Run
Compile and run the Java file from the terminal:
```bash
javac Solution.java


## Day 8: Dictionaries and Maps

### Objective
Learn and implement Key-Value pair mappings using the Map/Dictionary data structure to create a functional phone book application capable of saving and querying contacts.

### Concepts Explored
- **Java Maps & HashMaps:** Storing and retrieving data using `put()`, `get()`, and `containsKey()` methods.
- **Fast I/O Integration:** Implemented `BufferedReader` instead of `Scanner` to optimize input reading speed for large datasets.
- **Efficient String Parsing:** Used `StringTokenizer` as a faster, non-Regex alternative to the standard `String.split()` method.

### Challenges Faced & Solutions
- **Issue:** Encountered a `java.lang.NumberFormatException` during local testing.
- **Cause:** Attempted to input a 10-digit phone number (e.g., 9918922085). This value is larger than `2,147,483,647`, which is the maximum value a 32-bit signed Java `int` can hold.
- **Solution:** Refactored the application to use the `long` primitive data type. By updating the map to `Map<String, Long>` and parsing inputs with `Long.parseLong()`, the program can now safely store numbers up to 19 digits long without crashing.



Day 9

# Day 9: Recursion - Factorial

## Objective
Today's challenge focuses on understanding and implementing an algorithmic concept called Recursion. The task is to complete a factorial function that calculates the factorial of a given integer `n` using recursive calls.

## Concepts Mastered Today
- **Recursion**: A method where the solution to a problem depends on solutions to smaller instances of the same problem.
- **Base Case**: The condition that stops the recursion (`n <= 1`), preventing infinite loops and StackOverflow errors.
- **Recursive Case**: The part of the function that reduces the problem's size (`n * factorial(n - 1)`).
- **The Call Stack**: Visualized how function calls are pushed to the stack (winding) and how they return values (unwinding) once the base case is hit.



Day 10 

# Day 10: Binary Numbers

## Objective
Today, we are learning about the algorithmic concept of Radix (Base) and converting numbers from the Decimal number system (Base-10) to the Binary number system (Base-2). The specific challenge is to find the maximum number of consecutive `1`s in a given number's binary representation.

## Concepts Mastered Today
- **Base-10 vs Base-2**: Understanding how positional number systems work.
- **Decimal to Binary Conversion**: Utilizing the divide-by-2 method to extract remainders and form a binary number.
- **On-the-fly Logic**: Calculating consecutive `1`s dynamically within the `while` loop without needing to store the entire binary string in memory.


## Day 11: 2D Arrays (Hourglass Sum) ⏳

###  Objective
Learned how to navigate and manipulate 2D Arrays (matrices) by solving the "Hourglass Sum" problem on HackerRank.

###  Key Learnings
- **2D Array Traversal:** Mastered using nested loops to iterate through rows (`i`) and columns (`j`).
- **Pattern Extraction (The "Damroo" Shape):** Extracted a 7-element "Hourglass" shape from a 6x6 grid and calculated the maximum possible sum by sliding a 3x3 frame across the board.
- **Boundary Conditions:** Learned the importance of setting correct loop limits (`row <= 3` and `col <= 3`) to prevent `ArrayIndexOutOfBoundsException` when the frame reaches the edges of the grid.
- **Lists vs Arrays:** Understood how to traverse nested dynamic lists (`List<List<Integer>>`) using `.get(i).get(j)` instead of standard primitive arrays (`int[][]`).
- **Input Error Handling:** Fixed `NumberFormatException` caused by blank terminal inputs by implementing `.filter(str -> !str.isEmpty())` in Java Streams.


DAY 12 

## Day 12: Inheritance 🧬

### 📝 Objective
Learned and applied Object-Oriented Programming (OOP) concepts, specifically Inheritance and Constructors, by creating a derived class that inherits from a base class.

### 💡 Key Learnings
- **Class Inheritance:** Used the `extends` keyword to create a `Student` class that inherits properties (`firstName`, `lastName`, `idNumber`) from a parent `Person` class.
- **Constructors & `super()`:** Learned how to initialize a child class object while passing required parameters back up to the parent class's constructor using the `super()` keyword.
- **Array Processing & Logic:** Implemented a `calculate()` method to iterate through an integer array (`testScores`), compute the average, and return a specific character grade based on conditional logic.
- **Input Methods Observation:** Understood why HackerRank's locked stub codes sometimes require `throws IOException` (when using `BufferedReader`) and sometimes don't (when using `Scanner`, which handles internal exceptions gracefully).

DAY 13 

## Day 13: Abstract Classes 📖

### 📝 Objective
Extended the concept of Inheritance by working with Abstract Classes to understand how to enforce method implementation in child classes.

### 💡 Key Learnings
- **Abstract Classes:** Learned that abstract classes act as a blueprint and cannot be instantiated directly (e.g., `new Book()` throws an error). They only exist to be extended.
- **Abstract Methods:** Understood that an abstract method is a contract. If a parent class has an abstract `display()` method, the child class is strictly forced to implement it, ensuring consistent behavior across all child classes.
- **Data Encapsulation & `super()`:** Continued practicing passing parameters from the child constructor (`MyBook`) to the parent constructor (`Book`) using the `super()` keyword, keeping the code DRY (Don't Repeat Yourself).



DAY 14 

# Day 14: Scope and Array Optimization 🚀

## Objective
The goal for today was to solve the **Maximum Absolute Difference** problem. The challenge required finding the maximum absolute difference between any two elements in an array of non-negative integers.

## Key Concepts Learned
1. **Variable Scope:** Understanding the difference between Class Scope (Instance Variables) and Local/Loop Scope.
2. **The `this` Keyword:** Using `this` in constructors to resolve naming collisions (Shadowing) between class fields and method parameters.
3. **Code Optimization:** 
   - *Brute Force:* Using a nested loop to compare every element checks every combination but is extremely slow for large arrays.
   - *Optimized:* Finding the minimum and maximum values in a single loop traversal $O(n)$, then calculating `max - min`.
4. **Fast I/O:** Implementing `BufferedReader` and `InputStreamReader` for faster user input processing in Java.
5. **Compilation Basics:** Remembering that `.java` files must be recompiled into `.class` files using `javac` before executing with `java`.

## Optimized Code Snippet
```java
void computeDifference() {
    int min = elements[0];
    int max = elements[0];
    
    // Single pass loop instead of nested loops!
    for (int i = 0; i < elements.length; i++) {
        if (elements[i] < min) min = elements[i];
        if (elements[i] > max) max = elements[i];
    }
    
    maximumDifference = max - min;
}



DAY 15


# Day 15: Linked List - Insertion at the Tail 🚂

## Objective
Today's challenge was to understand the fundamentals of a Singly Linked List and write a function to insert a new Node at the tail (end) of the list.

## Key Concepts Learned
1. **The Node Structure:** 
   - A Linked List is made of Nodes. 
   - Each Node contains `data` (the value) and a `next` pointer (the reference to the next Node).
2. **The `head` Pointer:** 
   - The starting point of the list. If `head` is null, the list is empty.
3. **Safe Traversal (The "Ticket Checker" Rule):** 
   - Never overwrite the `head` pointer to traverse the list, as it will cause the list to be lost in memory for the Garbage Collector.
   - Always use a temporary pointer (`Node current = head;`) to traverse to the end of the list (`while(current.next != null)`).
4. **Insertion Logic:**
   - **Empty List:** The new node becomes the `head`.
   - **Populated List:** Traverse to the last node and link its `next` to the new node.

## Code Snippet (Insert Method)
```java
public static Node insert(Node head, int data) {
    Node newNode = new Node(data);
    
    // Condition 1: Empty List
    if (head == null) {
        return newNode;
    } 
    // Condition 2: Traverse and Insert at Tail
    else {
        Node current = head; 
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
}

