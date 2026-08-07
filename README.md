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


## Day 11: 2D Arrays (Hourglass Sum) 

###  Objective
Learned how to navigate and manipulate 2D Arrays (matrices) by solving the "Hourglass Sum" problem on HackerRank.

###  Key Learnings
- **2D Array Traversal:** Mastered using nested loops to iterate through rows (`i`) and columns (`j`).
- **Pattern Extraction (The "Damroo" Shape):** Extracted a 7-element "Hourglass" shape from a 6x6 grid and calculated the maximum possible sum by sliding a 3x3 frame across the board.
- **Boundary Conditions:** Learned the importance of setting correct loop limits (`row <= 3` and `col <= 3`) to prevent `ArrayIndexOutOfBoundsException` when the frame reaches the edges of the grid.
- **Lists vs Arrays:** Understood how to traverse nested dynamic lists (`List<List<Integer>>`) using `.get(i).get(j)` instead of standard primitive arrays (`int[][]`).
- **Input Error Handling:** Fixed `NumberFormatException` caused by blank terminal inputs by implementing `.filter(str -> !str.isEmpty())` in Java Streams.


DAY 12 

## Day 12: Inheritance 

###  Objective
Learned and applied Object-Oriented Programming (OOP) concepts, specifically Inheritance and Constructors, by creating a derived class that inherits from a base class.

###  Key Learnings
- **Class Inheritance:** Used the `extends` keyword to create a `Student` class that inherits properties (`firstName`, `lastName`, `idNumber`) from a parent `Person` class.
- **Constructors & `super()`:** Learned how to initialize a child class object while passing required parameters back up to the parent class's constructor using the `super()` keyword.
- **Array Processing & Logic:** Implemented a `calculate()` method to iterate through an integer array (`testScores`), compute the average, and return a specific character grade based on conditional logic.
- **Input Methods Observation:** Understood why HackerRank's locked stub codes sometimes require `throws IOException` (when using `BufferedReader`) and sometimes don't (when using `Scanner`, which handles internal exceptions gracefully).

DAY 13 

## Day 13: Abstract Classes 

###  Objective
Extended the concept of Inheritance by working with Abstract Classes to understand how to enforce method implementation in child classes.

###  Key Learnings
- **Abstract Classes:** Learned that abstract classes act as a blueprint and cannot be instantiated directly (e.g., `new Book()` throws an error). They only exist to be extended.
- **Abstract Methods:** Understood that an abstract method is a contract. If a parent class has an abstract `display()` method, the child class is strictly forced to implement it, ensuring consistent behavior across all child classes.
- **Data Encapsulation & `super()`:** Continued practicing passing parameters from the child constructor (`MyBook`) to the parent constructor (`Book`) using the `super()` keyword, keeping the code DRY (Don't Repeat Yourself).



DAY 14 

# Day 14: Scope and Array Optimization 

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


# Day 15: Linked List - Insertion at the Tail 

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




DAY 16

# Day 16: Exceptions - String to Integer 

##  Objective
Today's challenge is all about understanding **Exception Handling**. The goal is to read a string and parse it into an integer. If the string cannot be converted into an integer, we must handle the exception and print a specific error message.

**Constraint:** We are strictly forbidden from using any conditional statements (`if-else`) or loops. We must rely purely on `try-catch` blocks!

##  Task
1. Read a string, `S`.
2. Print its integer value.
3. If `S` cannot be converted to an integer (e.g., it contains letters), catch the exception and print `Bad String`.

## Concepts Covered
- **Exception Handling:** Using `try` and `catch` blocks to prevent programs from crashing.
- **Parsing:** Converting String data types to Integer using `Integer.parseInt()`.
- **Handling NumberFormatException:** The specific error thrown when a string with non-numeric characters is parsed into an int.

##  Examples

**Sample Input 1:**
```text
3

DAY 18

# Day 17: More Exceptions - Propagating 

##  Objective
Today's challenge dives deeper into Exception Handling. Instead of just catching exceptions thrown by Java's built-in methods, we practice **throwing** our own exceptions and **propagating** them back to the calling method.

##  Task
Write a `Calculator` class with a single method: `int power(int n, int p)`. 
- The method takes two integers and returns the result of $n^p$.
- **Constraint:** If either `n` or `p` is negative, the method must throw an exception with the exact message: `n and p should be non-negative`.

##  Concepts Covered
- **Exception Propagation:** Passing the responsibility of handling an error to the calling method (the "Boss-Worker" model).
- **`throws` Keyword:** Used in the method signature to warn that this method might throw an exception.
- **`throw` Keyword:** Used inside the method to actually create and throw a new Exception object.
- **Math.pow():** Utilizing Java's built-in Math library and casting the double result back to an integer.

##  Examples

**Sample Input 1:**
```text
3 5



DAY 18

# Day 18: Queues and Stacks 

##  Objective
Today's challenge introduces two fundamental Data Structures: Stacks and Queues. We are tasked with building a system that can verify if a given word is a palindrome by leveraging the core principles of both structures simultaneously.

##  Concepts Covered
- **Stack:** Follows the **LIFO** (Last-In-First-Out) principle. Uses `.push()` to add and `.pop()` to remove.
- **Queue:** Follows the **FIFO** (First-In-First-Out) principle. Implemented via a `LinkedList`. Uses `.add()` to enqueue and `.remove()` to dequeue.
- **I/O Optimization (Local Testing):** Integrated `BufferedReader` for efficient input handling, applying the `Throws IOException` concepts learned in Days 16/17.

##  Task
Determine if a given string is a palindrome.
1. Take each character in the string, enqueue it in a queue, and push it onto a stack.
2. Dequeue the first character from the queue and pop the top character from the stack.
3. Compare the two characters.
4. Continue until the containers are empty. If all characters match, the word is a palindrome!

##  Example

**Sample Input:**
```text
racecar


DAY -19 


Day 19: Interfaces & Polymorphism 

Objective

Today's challenge focuses on understanding Interfaces in Java and how they are used to achieve Polymorphism. We explored how interfaces act as a contract that classes must follow.

Key Learnings

The Concept of Interfaces:
An interface is essentially a blueprint or a "rulebook" for a class. It defines what a class must do (method declarations) but not how to do it (no method body).

The implements Keyword:
Unlike inheritance where we use extends to borrow features, we use implements to sign the interface contract. The class is then forced to provide the actual logic for all the abstract methods defined in the interface.

Polymorphism in Action:
We learned the power of using an Interface as a reference type.
AdvancedArithmetic calc = new Calculator();
This makes our code incredibly flexible, allowing the same reference variable to hold different object types at runtime.

The Diamond Problem (Why Interfaces?):
Java doesn't support multiple inheritance (extending multiple classes) to avoid the "Diamond Problem" (ambiguity). However, a single class can implement multiple interfaces, giving us a clean workaround!

HackerRank Problem: Divisor Sum

Task: Create a Calculator class that implements the AdvancedArithmetic interface and write the logic for the divisorSum(int n) method to return the sum of all divisors of n.

Logic Applied:

Used a for loop from 1 to n.

Used the Modulo Operator (%) to check for remainders (n % i == 0).

Accumulated the sum of all valid divisors.

Tech Stack

Java

Object-Oriented Programming (OOP)



DAY 20

 Objective

Today's challenge focuses on understanding fundamental sorting algorithms. We explored Bubble Sort, learning how it iterates through an array to push (or "bubble") the largest unsorted values to the end of the data structure.

Key Learnings

How Bubble Sort Works:
It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

The Swapping Logic (The "3-Glass" Trick):
To swap two variables without losing their data, we use a temporary variable:

int temp = a[j];
a[j] = a[j + 1];
a[j + 1] = temp;


Optimization (Early Exit):
Bubble Sort can be slow ($O(N^2)$ Time Complexity). However, we can optimize it by tracking if any swaps were made during a pass. If numberOfSwaps == 0 for a full round, it means the array is already sorted, and we can break out of the loop early, saving processing time!

HackerRank Problem: Bubble Sort

Task: Sort an array of size n in ascending order using Bubble Sort. After sorting, print:

The total number of swaps made.

The first element of the sorted array.

The last element of the sorted array.

Logic Applied:

Used nested for loops to iterate through the array.

Compared a[j] and a[j+1] and swapped if the left element was greater.

Maintained a global numSwaps counter.

Printed the required values using a[0] (first) and a[n-1] (last).

Tech Stack

Java

Sorting Algorithms

Array Manipulation


DAY 21


Day 21: Generics 

 Objective

Today's challenge dives into Generics in Java. Generics allow us to write flexible, reusable code by parameterizing data types. Instead of writing separate methods for Integer[], String[], or Double[], we can write a single Generic Method that handles all of them!

 Key Learnings

What are Generics?
Generics act as a "Sticker" (or placeholder) for data types. We use angle brackets < > (e.g., <T>, <E>) to denote a generic type. It provides Type Safety at compile-time (catching errors early).

Generic Methods:
We can create a method that adapts to the type of data passed to it.
Syntax: public static <E> void printArray(E[] array)

The <E> before the return type tells Java that E is a placeholder for a generic type (often stands for 'Element').

The "For-Each" Loop (Enhanced For-Loop):
A cleaner way to iterate through arrays or collections without worrying about indices or bounds.

for (E element : array) {
    System.out.println(element);
}


Translation: "For each element of type E inside the array, print it."

 HackerRank Problem: Print Array

Task: Write a single generic function named printArray that takes an array of generic elements as a parameter and prints each element on a new line. Do not use method overloading.

Logic Applied:

Created a class Printer<T>.

Defined a generic method printArray with a type parameter <E>.

Used a for-each loop to traverse through the array and print each item.

The same method flawlessly handles both Integer[] and String[] passed by the hidden main method.

 Tech Stack

Java

Generics <E> / <T>

For-Each Loop

Compile-time Type Safety


DAY 22

# Day 22: Binary Search Trees 

##  Objective
Today's challenge introduced the fundamental concepts of Data Structures: **Trees**, specifically **Binary Search Trees (BST)**. We learned how to traverse a tree and calculate its maximum height using recursion.

##  Key Learnings

1. **What is a Tree?**
   Unlike Arrays or Linked Lists, a Tree is a non-linear data structure organized in a hierarchical format.
   - **Root:** The topmost node.
   - **Leaf:** A node with no children.
   - **Edges:** The connecting links between nodes.

2. **Binary Search Tree (BST) Rules:**
   - Maximum of 2 children per node.
   - **Left Child:** Must have a value *less than or equal* to its parent.
   - **Right Child:** Must have a value *greater* than its parent.

3. **Calculating Tree Height:**
   The height of a BST is the number of edges between the root and the furthest leaf. We can easily calculate this using **Recursion**.
   - Base Case: If the node is `null`, return `-1` (an empty tree has a height of -1).
   - Recursive Step: Get the maximum height between the left and right subtrees, and add `1` (for the current node's edge).
   - Logic: `Math.max(getHeight(root.left), getHeight(root.right)) + 1;`

##  HackerRank Problem: Calculate Height
**Task:** Given a pointer to the root of a binary search tree, complete the `getHeight` function to return its height.

**Logic Applied:**
- Used depth-first traversal with recursion.
- Handled the null base case.
- Returned the maximum calculated path length.

## 🛠️ Tech Stack
- Java
- Data Structures
- Binary Search Trees (BST)
- Recursion   


DAY 23

# Day 23: BST Level-Order Traversal (Breadth-First Search) 


The task for today is to traverse a Binary Search Tree (BST) level-by-level, from left to right, and top to bottom. This is a classic implementation of the Breadth-First Search (BFS) algorithm.


Unlike Depth-First Search (DFS) where we dive deep into a single branch, BFS explores the tree floor-by-floor. 
To achieve this, we use a **Queue (FIFO - First-In-First-Out)** data structure:
1. Enqueue the `root` node.
2. While the queue is not empty:
   - Dequeue the node at the front and print its data.
   - Enqueue the left child (if it exists).
   - Enqueue the right child (if it exists).


To compile and run this code directly in your PC terminal:

```bash
javac Day23_Local.java

java Day23_Local