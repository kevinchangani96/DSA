package Stack;

public class Main {
    public static void main(String[] args) {
        int[] Stack =new int[5];
        int top=-1;

        top =push(Stack ,top,10);
        top =push(Stack ,top,20);
        top =push(Stack ,top,20);
        print(Stack,top);
    }

    private static void print(int[] stack, int top) {
        if (top==-1){
            System.out.println("stack is empty");
        }
        while(top>=0){
            System.out.println(stack[top]);
            top--;
        }
    }

    private static int push(int[] stack, int top,int value) {
        if (top==stack.length-1){
            System.out.println("stack overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
}