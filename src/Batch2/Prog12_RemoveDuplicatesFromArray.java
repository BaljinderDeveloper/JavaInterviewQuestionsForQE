package Batch2;

import java.util.*;

public class Prog12_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {23,45,23,67,67,45,99,98,98,99,98};
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        System.out.println("original : "+list);

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int i : arr){
            set.add(i);
            set1.add(i);
        }
        System.out.println("after removing(with set) : "+set);

        for(int i = 0; i < list.size(); i++){
//            for(int j = i+1; j < list.size(); j++){
            for(int j = list.size()-1; j > i ; j--){
                if (Objects.equals(list.get(i), list.get(j))) {
                    list.remove(j);
                }
            }
        }
        System.out.println("after removing(with loops) : "+list);
        System.out.println("Above implementation is wrong because there is left shift after deletion.");
        //solution : iterate j from last to front.
    }
}