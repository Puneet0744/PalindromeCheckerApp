public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to my Palindrome Checker Management System \nVersion : 1.0 \nSystem Initialized Successfully\n");

        String str = "racecar";
        String rev = "";

        for (int i=str.length() - 1; i>=0; i--){
            rev += str.charAt(i);
        }

        if (str.equals(rev))
            System.out.println("Your string is a Palindrome");
        else
            System.out.println("String is not a Palindrome");
    }
}
