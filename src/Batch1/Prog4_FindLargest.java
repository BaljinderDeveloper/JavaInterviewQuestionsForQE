package Batch1;

import java.util.Arrays;

public class Prog4_FindLargest {
    public static void main(String[] args) {
        int[] arr = {3,5,2,8,4,5,5,4,9};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("Largest number : "+arr[arr.length-1]);
    }
}
