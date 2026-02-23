import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to my Palindrome Checker Management System \nVersion : 1.0 \nSystem Initialized Successfully\n");

        String str = "racecar";
        String rev="";
        Stack <Character> sta = new Stack<>();
            for (int i=0; i<str.length(); i++)
                sta.push(str.charAt(i));

            for (int i=0; i<str.length(); i++)
                rev += sta.pop();

            if (str.equals(rev))
                System.out.println("Palindrome");
            else
                System.out.println("Not a Palindrome");

    }
}
