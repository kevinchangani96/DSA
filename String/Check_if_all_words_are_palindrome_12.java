package String;

public class Check_if_all_words_are_palindrome_12 {
    public static void main(String[] args) {
        String str="naman abcba";
        str = str.trim();
        String[] arr=str.split(" ");
        for (String str1:arr){
            if (isPalindrome(str1)==false){
                System.out.println("string is not pallindrome");
                return;
            }

        }
        System.out.println("string is palindrome");
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
