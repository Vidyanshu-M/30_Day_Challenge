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