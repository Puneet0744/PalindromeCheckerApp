import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Deque;


public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to my Palindrome Checker Management System \nVersion : 1.0 \nSystem Initialized Successfully\n");

        String str = "racecar";
        boolean ans = true;
       Deque<Character> deque = new ArrayDeque<>();

       for (int i =0; i<str.length(); i++){
           char c = str.charAt(i);
           deque.add(c);
       }

       while (deque.size() > 1){
           char a = deque.removeFirst();
           char b = deque.removeLast();

           if(a!=b) ans = false;
       }

       if (ans) System.out.println("Is a Pallindrome");
       else System.out.println("Is not a Pallindrome");
    }
}
