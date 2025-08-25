package Batch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog30_PairsSumEqualsTarget {
    public static void main(String[] args) {
        int target = 6;
        int[] array = {2,4,3,5,6,-2,8,7,1};

        List<int[]> alist = pairs(target, array);
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(Arrays.toString(alist.get(i)));
        }
    }
    public static List<int[]> pairs(int sum, int[] arr){
        List<int[]> pairsList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    pairsList.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        return pairsList;
    }
}