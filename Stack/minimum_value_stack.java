package Stack;

public class minimum_value_stack {
    static int mintop = -1;

    public static void main(String[] args) {
            int[] Stack = new int[5];
            int top = -1;
            int[] min = new int[5];

            top = push(Stack, min, top,9);
            top = push(Stack, min, top,8);
            top = push(Stack, min, top,10);
            top = push(Stack, min, top,6);
            top = push(Stack, min, top,2);
            System.out.println("Minimum is  " + getmin(min));
            top=pop(Stack,min,top);
            System.out.println("After popping");
            System.out.println("Minimum is  " + getmin(min));
            top=pop(Stack,min,top);
            System.out.println("After popping");
            System.out.println("Minimum is  " + getmin(min));
        }

        private static int getmin(int[] min) {
            return min[mintop];
        }

        public static int pop(int[] stack, int[] min, int top) {
            int value = stack[top];
            top--;
            if (value==min[mintop]){
                mintop--;
            }
            return top;
        }

        public static int push(int[] stack, int[] min, int top, int value) {
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