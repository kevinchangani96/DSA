package Array_Sorting;

public class Selction_sort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 3, 0};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;

                }
            }
            if (i!=min){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");


        }
    }
}