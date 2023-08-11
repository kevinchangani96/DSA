package Recursion.AddZero;

public class facorial {
    public static void main(String[] args) {
        System.out.println(ansfact(5));
    }

    private static int ansfact(int n) {
        if(n==1){
            return n;
        }
        return n* ansfact(n-1);
    }
}
