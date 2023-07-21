package Stack;

import java.util.Stack;

public class Reverse_a_String_using_Stack {
    public static void main(String[] args) {
        String s="kevin";
        StringBuilder s1= new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            char ans=stack.pop();
            s1.append(ans);

        }
        System.out.println(s1);

    }
}
