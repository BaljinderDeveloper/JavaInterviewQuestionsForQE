package Batch2;

public class Prog15_StringLengthWithout_lengthMethod {
    public static void main(String[] args) {
        String str = "Baljinder_Singh";

        int count = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        System.out.println("Num of chars : "+count);
    }
}
