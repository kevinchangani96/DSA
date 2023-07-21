package Array;

public class alternative {

    public static void main(String[] args) {

            int[] arr = {1, 2, 3};
            int[] arr2 = {4, 5, 6};
            int[] arr3 = new int[arr.length + arr2.length];
            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                arr3[j] = arr[i];
                j++;
                arr3[j] = arr2[i];
                j++;
            }
            for (int i = 0; i < arr3.length; i++) {
                System.out.println(arr3[i]);
            }
        }

    }

