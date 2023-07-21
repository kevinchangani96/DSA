package String;

public class String_Palindrome_2 {
    public static void  main(String[] args) {
         String str= "abcba5";
         if (isPalindrome(str)){
             System.out.println("string is palindrom");
         }
         else {
             System.out.println("string is  not palindrom");
         }
    }


    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}



