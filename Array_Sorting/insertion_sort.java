package Array_Sorting;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 1};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ "");
        }
    }
}



//        int[] arr = {5, 9, 3, 2, 1};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//
//            }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]);
//        }
//
//    }

//        int[] arr = {2, 5, 3, 8};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[min] > arr[j ]) {
//                    min = j;
//                }
//
//            }
//            if (i != min) {
//                int temp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = temp;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + "");