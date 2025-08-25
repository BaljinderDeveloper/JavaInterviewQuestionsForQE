package Batch3;

import java.util.Arrays;

public class Prog21_2ndLargestNumber {
    public static void main(String[] args) {
        int[] arr = {23,44,54,89,39,34,57,28};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
