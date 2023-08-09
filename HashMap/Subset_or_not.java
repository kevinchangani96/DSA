package HashMap;

import java.util.HashSet;

public class Subset_or_not {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2,4};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!hashSet.contains(arr2[i])) {
                System.out.println("not subset");
                return;
            }
        }
        System.out.println("subset");
        }
    }

