package Array;

public class double_sizearray_samevalue_print {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        int[] arr2 = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            arr2[i+n] = arr[i];

        }
      for (int i =0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
