package Batch1;

public class Prog7_FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, sum = 0;
        for(int i = 0; i < 10; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+"  ");
        }
    }
}
