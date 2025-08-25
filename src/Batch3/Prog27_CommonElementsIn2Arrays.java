package Batch3;

import java.util.HashSet;
import java.util.Set;

public class Prog27_CommonElementsIn2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {2,4,665,34,53,24,5,99,8,39};
        int[] arr2 = {22,41,65,34,34,41,47,98,99,40,665};

        Set<Integer> set = new HashSet<>();
        for(int i : arr1){
            for(int j : arr2){
                if(i == j){
                    set.add(i);
                }
            }
        }
        System.out.println(set);
    }
}