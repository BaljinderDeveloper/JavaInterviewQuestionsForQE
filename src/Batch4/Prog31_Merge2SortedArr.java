//Merge 2 sorted Arrays
package Batch4;

import java.util.Set;
import java.util.TreeSet;

public class Prog31_Merge2SortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {0,2,4,6,8};

        Set<Integer> tSet = new TreeSet<>();

        for(int i : arr1){
            tSet.add(i);
        }
        for(int j : arr2){
            tSet.add(j);
        }
        System.out.println(tSet);
    }
}
