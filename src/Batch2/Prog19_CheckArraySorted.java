package Batch2;

public class Prog19_CheckArraySorted {
    public static void main(String[] args) {
//        int[] arr = {3,298,37,90,37,6753,283,93};
        int[] arr = {5,4,3,2,1};

        int asc = 0, desc = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                desc++;
            }
            if(arr[i] < arr[i+1]){
                asc++;
            }
        }
        String str = (asc > 1 && desc >1)? "Array is not sorted" : "Array is sorted";
        System.out.println(str);
    }
}
