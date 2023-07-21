package Stack;

public class palindromeusing_stack {
    public static void main(String[] args) {
        String s = "naman";
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            top = push(stack, top, s.charAt(i));
        }
        String s1 = print(stack, top);
        System.out.println(s1.equals(s));
    }
    private static String print(char[] stack, int top) {
        StringBuilder s = new StringBuilder();
        while (top != -1) {
            s.append(stack[top]);
            top--;
        }
        return s.toString();

    }

    private static int push(char[] stack, int top, char charAt) {
        top++;
        stack[top] = charAt;
        return top;
    }
}
