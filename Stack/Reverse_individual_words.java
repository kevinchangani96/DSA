package Stack;

import java.util.Stack;

public class Reverse_individual_words {
    public static void main(String[] args) {
        String s="how are you";
        StringBuilder s1=new StringBuilder();
        Stack<Character> stack= new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' ') {
                while (!stack.isEmpty()) {
                    char c = stack.pop();
                    s1.append(c);
                }
                s1.append(" ");
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            char c = stack.pop();
            s1.append(c);
        }
        System.out.println(s1);
    }
}
