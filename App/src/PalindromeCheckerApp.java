import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to my Palindrome Checker Management System \nVersion : 1.0 \nSystem Initialized Successfully\n");

        String str = "racecar";
        boolean ans = true;
        Stack <Character> sta = new Stack<>();
        Queue <Character> que = new LinkedList<>();

            for (int i=0; i<str.length(); i++)
                sta.push(str.charAt(i));
            for (int i=0; i<str.length(); i++)
                que.add(str.charAt(i));

            for (int i=0; i<str.length(); i++){
                if (que.remove() != sta.pop()){
                    ans = false;
                    break;
                }
            }
            if (ans)
                System.out.println("Palindrome");
            else
                System.out.println("Not a Palindrome");
    }
}
