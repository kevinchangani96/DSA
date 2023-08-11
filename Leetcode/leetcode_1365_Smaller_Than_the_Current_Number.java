package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode_1365_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int arr[]={8,1,2,2,3};
        int arr2[]=arr.clone();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++){
            hashMap.putIfAbsent(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            arr2[i]=hashMap.get(arr[i]);
        }
        for(int i=0;i<arr2.length;i++) {
            System.out.println(arr2[i]);
        }
    }
}
