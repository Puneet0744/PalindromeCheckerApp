public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to my Palindrome Checker Management System \nVersion : 1.0 \nSystem Initialized Successfully\n");

        String str = "racecar";
        int len = str.length();
        boolean ans = true;
        char arr[] = new char[len];

        for (int i=0; i<len; i++){
            arr[i] = str.charAt(i);
        }

        int j=0, k=len-1;
        while(j<=k){
            if (arr[j] != arr[k]){
                ans = false;
                break;
            }
            j++;
            k--;
        }

        if (ans)
            System.out.println("Your string is a palindrome");
        else
            System.out.println("String is not a palindrome");
    }
}
