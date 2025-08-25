package Batch3;

import java.util.*;

public class Prog22_FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {33,44,33,87,65,34,47,34,47,87,90,33};

        Set<Integer> set = new HashSet<>();
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        System.out.println("repeated nums are : "+set);
    }
}
