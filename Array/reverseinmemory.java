package Array;

public class reverseinmemory {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int temp;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        for (int i =0;i< arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
