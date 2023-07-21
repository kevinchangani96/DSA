package Stack;

import java.util.Stack;


public class valid_parentheses {
    public static void main(String[] args) {
        String s = "()";
        boolean ans = valid(s);
        System.out.println(ans);
    }

    private static boolean valid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' ||s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.empty()) {
                    return false;
                } else if ((s.charAt(i) == ')' && stack.peek() == '(')
                        || (s.charAt(i) == '}' && stack.peek() == '{')
                        || (s.charAt(i) == ']' && stack.peek() == '[')) {
                    stack.pop();

                } else {
                    return false;
                }
            }


        }
        return stack.empty();

    }
}


