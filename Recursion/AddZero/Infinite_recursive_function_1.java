package Recursion.AddZero;

public class Infinite_recursive_function_1 {
    public static void main(String[] args) {
    loop();
    }

    private static void loop() {
        System.out.println("hello recursion");

        loop();

    }
}
