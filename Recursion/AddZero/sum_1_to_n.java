package Recursion.AddZero;

public class sum_1_to_n {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumrecursion(5));
    }

    private static int sumrecursion(int i) {
        if(i==0){
            return i;
        }
        return i+sumrecursion(i-1);
    }
}
