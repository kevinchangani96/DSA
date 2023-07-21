package Stack;

import java.util.Stack;

public class palindrome_check_arraylist {
    public static void main(String[] args) {
        String s = "naman   ";
        StringBuilder s1 = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            char ans = stack.pop();
            s1.append(ans);

        }
        if (s.equals(s1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
