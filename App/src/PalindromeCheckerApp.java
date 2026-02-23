public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to my Palindrome Checker Management System \nVersion : 1.0 \nSystem Initialized Successfully\n");

        String str = "racecar";
        boolean ans = true;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) != str.charAt(str.length() - i-1))
                ans = false;
        }

        if (ans)
            System.out.println("Your string is a Palindrome");
        else
            System.out.println("String is not a Palindrome");
    }
}
