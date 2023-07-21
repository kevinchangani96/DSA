package Array;

public class twice_value_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = new int[arr.length*2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr2[j] = arr[i];
            j++;
            arr2[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }

}
