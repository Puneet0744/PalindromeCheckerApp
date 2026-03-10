

public class PalindromeCheckerApp {
    public static void main(String[] args){

        String str = "A man a plan a canal Panama";
        boolean ans = true;

        str = str.toLowerCase().replace(" ","");

        int first = 0;
        int last = str.length()-1;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(first) != str.charAt(last))
                ans = false;

            first++;
            last--;
        }

        if (ans) System.out.println("Sting is a Palindrome");
        else System.out.println("String is not a Palindrome");
    }
}