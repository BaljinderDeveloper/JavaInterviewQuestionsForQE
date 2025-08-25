package Batch1;

import java.util.Arrays;

public class Prog4_FindLargest_3 {
    public static void main(String[] args) {
        int[] arr = {21,34,564,73,80,35,25,7,345,345,6,44,56,544};
        int max = arr[0];

        System.out.println("Largest number is : "+findLar(arr,max));
    }
    public static int findLar(int[] array, int max){
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("max : "+max);
        return array[0];
    }
}
