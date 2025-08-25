package Batch1;

import java.util.Arrays;

public class Prog4_FindLargest_2 {
    public static void main(String[] args) {
        int[] arr = {21,34,564,73,80,35,25,7,345,345,6,44,56,544};

        System.out.println("Largest number is : "+findLar(arr));
    }
    public static int findLar(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] < array[j]){
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array[0];
    }
}