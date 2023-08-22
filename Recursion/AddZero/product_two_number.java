package Recursion.AddZero;

public class product_two_number {
    public static void main(String[] args) {

        int num1 = 5; // First number
        int num2 = 3; // Second number

        int product = calculateProduct(num1, num2);
        System.out.println("Product: " + product);
    }

    public static int calculateProduct(int num1, int num2) {
        if (num2 == 0) {
            return 0; // Base case: product with 0 is 0
        } else if (num2 < 0) {
            return -calculateProduct(num1, -num2); // Convert negative multiplication to positive
        } else {
            return num1 + calculateProduct(num1, num2 - 1); // Recursively add num1 for num2 times
        }
    }
}


