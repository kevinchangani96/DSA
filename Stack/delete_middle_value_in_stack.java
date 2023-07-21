package Stack;

import java.util.Arrays;

public class delete_middle_value_in_stack {
    public static void main(String[] args) {
        int a = 96358;
        int a2 = a;
        int count = 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        int[] arr = new int[count];
        int i = count - 1;
        while (a2 != 0) {
            int last = a2 % 10;
            arr[i--] = last;
            a2 /= 10;
        }
        int[] stack = new int[count];
        int top = -1;
        for (int j = 0; j < arr.length; j++) {
            top = push(stack, top, arr[j]);

        }
        int[] stack2 = new int[count - 1];
        int k = 0;
        for (int j = count - 1; j > top / 2; j--) {
            stack2[k] = stack[j];
            k++;

        }
        for (int j = top / 2 - 1; j >= 0; j--) {
            stack2[k] = stack[j];
            k++;
        }
        top--;

        System.out.println(Arrays.toString(stack));
        print(stack2, top);
    }

    private static void print(int[] stack2, int top) {
        int num = 0;
        while (top != -1) {
            num =num * 10 + stack2[top];
            top--;

        }
        System.out.println(num);
    }

    private static int push(int[] stack, int top, int i) {
        top++;
        stack[top] = i;
        return top;
    }
}
