package Array;

public class oddevencount {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int odd=0;
        int even=0;
    for (int i=0;i<arr.length;i++)
    {
        if (arr[i]%2==0){
            even++;
        }
        else {
            odd++;

        }
    }
        System.out.println("odd"+odd + "even"+even);
    }

}