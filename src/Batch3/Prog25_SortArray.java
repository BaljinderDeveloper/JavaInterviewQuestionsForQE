package Batch3;

import java.util.Arrays;

public class Prog25_SortArray {
    public static void main(String[] args) {
        int[] arr = {4,7,39,87,56,21,11,61,77,89,7};

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}