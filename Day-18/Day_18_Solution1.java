import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class  Day_18_Solution1{
    Stack<Character> st = new Stack<>();
    Queue<Character> qu = new LinkedList<>();
    
    void pushCharacter(char ch ){
        st.push(ch);
    }
    void enqueueCharacter(char ch){
        qu.add(ch);
    }
    char popCharacter(){
        return st.pop();
    }
    char dequeueCharacter(){
        return qu.remove();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word to check , it is PALINDROME or not : ");


        String input = br.readLine();
        Day_18_Solution1 detective = new Day_18_Solution1();
        for (char c:input.toCharArray()){
            detective.pushCharacter(c);
            detective.enqueueCharacter(c);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < input.length()/2; i++){
            if (detective.popCharacter() != detective.dequeueCharacter()){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
        System.out.println("Result:"  + input + " IS PALINDROME !");
        }else {
            System.out.println("Result: " + input + " IS NOT A PALINDROME !");
        }
        br.close();
    }
}