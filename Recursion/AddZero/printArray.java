package Recursion.AddZero;

public class printArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        array(arr,arr.length-1);
    }

    private static void array(int[] arr, int n) {
        if(n==-1){
            return;
        }
        array(arr,n-1);
        System.out.println(arr[n]+ " ");

    }
}
