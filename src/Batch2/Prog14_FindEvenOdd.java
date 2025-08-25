package Batch2;

import java.util.ArrayList;
import java.util.List;

public class Prog14_FindEvenOdd {
    public static void main(String[] args) {
        int[] arr = {23,43,54,35,52,53434,343,532,23523,2};
        List<Integer> elist = new ArrayList<>();
        List<Integer> olist = new ArrayList<>();

        for(int i : arr){
            if(i%2 == 0){
                elist.add(i);
            } else {
                olist.add(i);
            }
        }
        System.out.println("even nums : "+ elist);
        System.out.println("odd nums : "+ olist);
    }
}
