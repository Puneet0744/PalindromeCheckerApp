

public class PalindromeCheckerApp {
        static boolean isPalindrome(String str, int left, int right){

            if (left >= right)
                return true;

            if (str.charAt(left) != str.charAt(right))
                return false;

            return isPalindrome(str, ++left, --right);
        }

        public static void main(String[] args){
            System.out.println("Welcome to my Palindrome Checker Management System \nVersion : 1.0 \nSystem Initialized Successfully\n");

            String str = "racecar";

            if(isPalindrome(str, 0, str.length()-1))
                System.out.println("String is a Palindrome");
            else System.out.println("String is not a palindrome");
        }
    }

