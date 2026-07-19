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
