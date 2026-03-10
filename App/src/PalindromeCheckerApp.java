import java.util.Stack;

     class PalindromeChecker {
        public boolean checkPalindrome(String str) {
            Stack<Character> st = new Stack<>();
            String str2 = "";
            for (int i = 0; i < str.length(); i++) {
                st.push(str.charAt(i));
            }

            while(!st.empty()){
                str2 = str2 + st.pop();
            }

            if (!str.equals(str2)) return false;

            return true;
        }
    }

    public class PalindromeCheckerApp {
        public static void main(String[] args){
            String str = "racecar";
            PalindromeChecker checker = new PalindromeChecker();
            if (checker.checkPalindrome(str))
                System.out.println("String is a Palindrome");
            else
                System.out.println("String is not a palindrome");
        }
}