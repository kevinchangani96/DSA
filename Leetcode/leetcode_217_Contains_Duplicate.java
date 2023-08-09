package Leetcode;

import java.util.HashSet;

public class leetcode_217_Contains_Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4};
        System.out.println(duplicate(arr));

    }
    public static boolean duplicate(int[] arr){
        HashSet<Integer> hashSet =new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            if (hashSet.contains(arr[i])) {
                return true;
            } else {
                hashSet.add(arr[i]);
            }
        }
        return false;
    }
}
