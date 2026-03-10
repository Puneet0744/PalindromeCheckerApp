import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to my Palindrome Checker Management System \nVersion : 1.0 \nSystem Initialized Successfully\n");

        String str = "racecar";
        boolean ans = true;
        LinkedList<Character> list = new LinkedList<>();

        for (int i=0; i<str.length(); i++){
            list.add(str.charAt(i));
        }

        while(list.size() > 1){
            if (list.removeFirst() != list.removeLast()) ans = false;
        }

        if (ans) System.out.println("Is a Palindrome");
        else System.out.println("Is not a Palindrome");
    }
}
