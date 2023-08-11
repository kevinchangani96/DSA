package Recursion.AddZero;

public class LargesteEle {
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        largest(nums,nums.length-1);
        System.out.println(max);
    }

    private static void largest(int[] nums, int n) {
        if(n==-1){
            return ;
        }
        max=Math.max(max,nums[n]);
        largest(nums,n-1);

    }
}
