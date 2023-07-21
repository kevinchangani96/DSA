package Stack;

public class minimum_value_stack {
    static int mintop = -1;

    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;
        int[] min = new int[5];

        top = push(stack, min, top, 10);
        top = push(stack, min, top, 20);
        top = push(stack, min, top, 16);
        top = push(stack, min, top, 78);
        top = push(stack, min, top, 5);

        System.out.println(getmin(min));
//        top = pop(stack, min, top);

    }



    private static int getmin(int[] min) {
        return min[mintop];
    }

    private static int push(int[] stack, int[] min, int top, int value) {
        top++;
        stack[top] = value;
        if (top == 0) {
            mintop++;
            min[mintop] = value;

        }
        if (value < min[mintop]) {
            mintop++;
            min[mintop] = value;

        }
        return top;
    }
}
